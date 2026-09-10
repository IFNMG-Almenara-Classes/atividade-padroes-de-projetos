# Exemplo 1 — Strategy: Cálculo de Frete

## Problema

`CalculadoraFrete` decide como calcular o frete através de uma cadeia de
`if/else` comparando uma string (`"NORMAL"`, `"EXPRESSA"`, `"RETIRADA"`).

## Por que incomoda

Toda vez que surge um tipo de entrega novo, é preciso editar
`CalculadoraFrete` e acrescentar mais um `else if`, mexendo em uma classe que
já funciona e arriscando quebrar um cálculo existente. A lógica de todos os
tipos fica concentrada num único método, cada vez maior e mais difícil de
testar isoladamente.

## Solução (Strategy)

Cada forma de calcular o frete vira uma classe que implementa
`EstrategiaFrete` (`FreteNormal`, `FreteExpresso`, `FreteRetirada`).
`CalculadoraFrete` deixa de saber calcular frete — ela só guarda uma
`EstrategiaFrete` e delega `calcular(peso)` para ela.

## O que mudou

Adicionar um tipo de entrega novo é criar uma classe nova implementando
`EstrategiaFrete` — nenhuma classe existente é alterada. Como
`EstrategiaFrete` tem um único método, qualquer estratégia pode até ser
passada como lambda, sem precisar nem de uma classe (`peso -> peso * 2 + 5`
no `Cliente`).
