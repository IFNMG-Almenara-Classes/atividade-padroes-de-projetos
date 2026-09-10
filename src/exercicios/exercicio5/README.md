# Exercício 5 — Desconto no Carrinho de Compras

## Contexto

Uma loja online aplica desconto no carrinho conforme o nível do cliente
(Bronze, Prata, Ouro) e, sempre que um desconto é aplicado, precisa avisar
três sistemas: marketing (para campanhas), auditoria (para compliance) e o
ERP (para atualizar o valor do pedido).

## O código atual

`CarrinhoCompras.aplicarDesconto()` faz duas coisas no mesmo método, por
razões diferentes: decide o percentual de desconto com uma cadeia de
`if/else` sobre o tipo de cliente, **e** instancia e chama diretamente os
três serviços interessados no resultado. As duas coisas crescem juntas, mas
por motivos independentes — um nível de cliente novo não tem nada a ver com
um sistema novo que precise ser avisado.

## Objetivo

Refatore `CarrinhoCompras` separando "como calcular o desconto" de "quem
precisa ser avisado quando um desconto é aplicado". O comportamento
observado em `ClasseCliente` (as três chamadas e as saídas dos três
serviços) deve continuar o mesmo depois da refatoração.

## Para responder no caderno

1. Quais padrões de projeto você aplicou? (Esse exercício pode precisar de
   mais de um.)
2. Por que essa combinação resolve o problema — o que cada padrão está
   resolvendo especificamente?
3. Um nível "DIAMANTE" (desconto de 25%) e um novo serviço de fidelidade
   (que também precisa ser avisado) chegam ao mesmo tempo. Com o seu
   design, quantas classes existentes você precisa alterar para cada uma
   dessas duas mudanças?
