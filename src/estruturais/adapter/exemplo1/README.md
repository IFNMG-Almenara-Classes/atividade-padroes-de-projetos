# Exemplo 1 — Adapter: Integrando um Gateway de Pagamento Externo

## Problema

`GatewayPagamentoExterno` é uma biblioteca de terceiros (não podemos
alterá-la) com uma interface incompatível com a nossa: em vez de
`processar(double valor)`, ela expõe `realizarCobranca(int
valorEmCentavos)`. `CheckoutService` precisa de um método separado,
`finalizarCompraComGatewayExterno`, só para ela.

## Por que incomoda

O gateway externo não pode ser tratado como um `Pagamento` qualquer — o
`CheckoutService` precisa conhecer sua existência e sua conversão especial
(reais para centavos) explicitamente. Se esse gateway for usado em mais
lugares do sistema, essa conversão se repete em cada um deles.

## Solução (Adapter)

`GatewayPagamentoAdapter` implementa `Pagamento` e, por dentro, guarda uma
instância de `GatewayPagamentoExterno`. `processar(valor)` faz a conversão
(reais para centavos) e delega para `realizarCobranca(...)`. O adapter
"traduz" a interface incompatível para a que o resto do sistema espera.

## O que mudou

`CheckoutService` volta a ter um único método, `finalizarCompra(Pagamento,
double)` — ele não sabe (nem precisa saber) que por trás do
`GatewayPagamentoAdapter` existe uma biblioteca de terceiros com uma
interface totalmente diferente. Qualquer código que já trabalha com
`Pagamento` passa a funcionar com o gateway externo de graça.
