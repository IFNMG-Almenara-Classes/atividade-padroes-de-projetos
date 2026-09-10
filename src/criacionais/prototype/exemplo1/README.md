# Exemplo 1 — Prototype: Repetir Pedido

## Problema

Para "repetir" um pedido, o código cria um `Pedido` novo copiando os campos
na mão (`pedidoOriginal.getCliente()`, `pedidoOriginal.getItens()`, ...). A
lista de itens, porém, é copiada por **referência** — o pedido novo aponta
para a mesma `List` do original.

## Por que incomoda

Qualquer alteração nos itens do pedido "repetido" (como adicionar um item)
também altera o pedido original, mesmo sendo dois objetos `Pedido`
diferentes — porque os dois compartilham a mesma lista por baixo dos panos.
O bug é sorrateiro: só aparece quando alguém mexe no objeto "copiado" e o
original muda junto, sem nenhuma linha de código ter tocado nele
diretamente.

## Solução (Prototype)

`Pedido` ganha um método próprio, `copiar()`, que monta a cópia na mão,
dentro da própria classe. O método sabe exatamente quais campos podem ser
copiados normalmente (imutáveis, como `String`) e quais precisam de **cópia
profunda** (mutáveis, como a lista de itens).

## O que mudou

Quem usa `Pedido` não precisa mais saber *como* copiá-lo corretamente:
basta chamar `pedidoOriginal.copiar()`. A lógica de "quais campos copiar e
como" fica encapsulada dentro de `Pedido` — e nunca mais precisa ser
repetida (ou esquecida) em cada lugar do código que precisar duplicar um
pedido. A linha `new ArrayList<>(this.itens)` é o que garante que a lista
da cópia é independente da lista do original.
