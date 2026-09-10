# Exemplo 3 — Prototype: Cloneable/clone() Não Esquece Campos Novos

## Problema

Os [Exemplos 1](../exemplo1/README.md) e [2](../exemplo2/README.md)
implementam a cópia com um método `copiar()` escrito na mão, que monta a
cópia campo a campo. Esse método foi escrito quando `Pedido` só tinha
`cliente`, `itens` e `enderecoEntrega`. Quando `observacoes` foi adicionado
à classe depois, ninguém lembrou de atualizar `copiar()` para incluir o
campo novo.

## Por que incomoda

`copiar()` não dá nenhum aviso de que ficou incompleto — ele simplesmente
não copia o que não foi escrito nele. No exemplo, a observação "Entregar
após 18h" desaparece no pedido repetido, e ninguém percebe até um cliente
reclamar. Cada campo novo adicionado à classe é um novo lugar onde esse
método pode ficar desatualizado.

## Solução (Prototype com Cloneable)

`Pedido` implementa `Cloneable` e sobrescreve `clone()`. `super.clone()`
copia automaticamente **todos** os campos da classe, um por um, na
memória — sem que ninguém precise listar cada campo manualmente. Só
continua sendo necessário tratar à mão os campos que precisam de cópia
profunda (a lista de itens).

## O que mudou

Quando um campo novo é adicionado a `Pedido` (como `observacoes`), o
`clone()` já copia ele automaticamente, sem precisar de nenhuma alteração —
diferente do `copiar()` manual, que precisaria ser lembrado e atualizado
toda vez que a classe ganhasse um campo novo.

## Ligação com os Exemplos 1 e 2

Os dois exemplos anteriores usaram um método `copiar()` escrito à mão de
propósito, para deixar claro exatamente o que estava sendo copiado e como —
inclusive campos mutáveis (Exemplo 1) e campos privados sem getter
(Exemplo 2). Este exemplo mostra por que `Cloneable`/`clone()` existe na
linguagem: ele resolve automaticamente o caso comum (copiar campo por
campo, mesmo os privados) e deixa você livre para tratar só os casos
especiais — exatamente os mesmos cuidados dos Exemplos 1 e 2, só que agora
dentro de `clone()` em vez de um método escrito do zero.
