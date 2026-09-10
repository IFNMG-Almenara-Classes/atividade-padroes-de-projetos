# Exemplo 1 — Builder: Montagem de Pedido com Muitos Parâmetros

## Problema

`new Pedido(cliente, itens, enderecoEntrega, formaPagamento, cupomDesconto,
observacoes, entregaExpressa)` tem 7 parâmetros, vários do mesmo tipo
(`String`). Olhando só a chamada, não dá para saber qual valor é qual sem
consultar a assinatura do construtor.

## Por que incomoda

É fácil trocar a ordem de dois parâmetros do mesmo tipo sem que o compilador
acuse nada — no exemplo, `cupomDesconto` e `observacoes` são trocados de
lugar, e o pedido sai com os dois valores invertidos. Quanto mais campos
(principalmente opcionais), maior o risco. E criar um construtor para cada
combinação de campos presentes/ausentes ("telescoping constructor") também
não escala.

## Solução (Builder)

`PedidoBuilder` expõe um método por campo (`cliente(...)`, `itens(...)`,
`cupomDesconto(...)`, ...), cada um retornando o próprio builder (`this`)
para encadear as chamadas. `build()` valida os campos obrigatórios e só
então monta o `Pedido` (imutável).

## O que mudou

A chamada fica autoexplicativa — cada valor é nomeado pelo método que o
define, então é impossível trocar `cupomDesconto` por `observacoes` sem
querer (são métodos diferentes, não posições). Campos opcionais
(`cupomDesconto`, `observacoes`, `entregaExpressa`) podem simplesmente ser
omitidos, sem precisar de um construtor extra para cada combinação.

## Builder x Factory Method/Abstract Factory

Os padrões de fábrica ([Factory Method](../../factorymethod/exemplo1/README.md),
[Abstract Factory](../../abstractfactory/exemplo1/README.md)) resolvem "qual
classe concreta instanciar". O Builder resolve um problema diferente:
"como montar, passo a passo, **um** objeto complexo" — sem se perder em
parâmetros posicionais nem precisar de um construtor para cada combinação
de campos opcionais.
