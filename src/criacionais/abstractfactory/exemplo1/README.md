# Exemplo 1 — Abstract Factory: Kit de Checkout por País

## Problema

`CheckoutService.finalizarCompra` escolhe a notificação e a forma de
pagamento em dois blocos `if/else` **separados**, cada um decidindo por conta
própria com base no país.

## Por que incomoda

Notificação e pagamento formam, na prática, um "kit" que precisa vir junto —
mas nada no código garante isso. Quando um país novo é adicionado, é fácil
atualizar um bloco e esquecer o outro: no exemplo, `"PORTUGAL"` foi passado
para `finalizarCompra`, mas nenhum dos dois `if` tem uma condição para esse
país — o pedido passa batido, sem notificação **nem** pagamento processado,
e nenhuma exceção avisa que algo deu errado.

## Solução (Abstract Factory)

Notificação e pagamento viram produtos de uma mesma família, agrupados atrás
de uma fábrica: `FabricaCheckout` declara `criarNotificacao()` **e**
`criarPagamento()`. Cada país ganha uma fábrica concreta
(`FabricaCheckoutBrasil`, `FabricaCheckoutEUA`) que implementa os dois
métodos e garante que os produtos retornados sempre formam uma combinação
válida.

## O que mudou

`CheckoutService` não decide mais nada sozinho: ele recebe uma
`FabricaCheckout` pronta no construtor e pede a ela os dois produtos. Como
`FabricaCheckout` é uma interface com os dois métodos, **é impossível**
criar uma fábrica de país que produza só a notificação e esqueça o pagamento
(ou vice-versa) — o compilador obriga a implementar a família inteira. Para
adicionar Portugal, basta criar `FabricaCheckoutPortugal` — o erro do
`antes` (esquecer metade do kit) deixa de ser possível.

## Factory Method x Abstract Factory

Nos exemplos de Factory Method ([1](../../factorymethod/exemplo1/README.md),
[2](../../factorymethod/exemplo2/README.md)), cada fábrica cria **um tipo de
produto só** (uma notificação, ou um pagamento, isoladamente). Aqui,
`FabricaCheckout` cria **uma família de produtos relacionados** (notificação
+ pagamento) que precisam ser usados juntos — esse é exatamente o problema
que o Abstract Factory resolve e que o Factory Method sozinho não cobre.
