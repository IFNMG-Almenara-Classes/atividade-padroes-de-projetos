# Exercício 6 — Relatório Fiscal

## Contexto

Uma contabilidade gera relatórios fiscais que variam em dois eixos
independentes: o **formato de saída** (PDF, Excel, CSV) e o **regime
tributário** usado para calcular o imposto (Simples, Lucro Presumido, Lucro
Real).

## O código atual

`GeradorRelatorioFiscal.gerar()` resolve as duas variações na mesma
sequência de `if/else`: primeiro decide a alíquota de imposto pelo regime
tributário, depois decide como formatar a saída pelo formato pedido. As duas
lógicas não têm relação entre si, mas estão amarradas no mesmo método —
mexer numa arrisca quebrar a outra.

## Objetivo

Refatore o código separando as duas variações, de forma que um formato novo
e um regime tributário novo possam ser adicionados de forma independente,
sem mexer um no código do outro. O comportamento observado em
`ClasseCliente` (as três linhas impressas) deve continuar o mesmo depois da
refatoração.

## Para responder no caderno

1. Quais padrões de projeto você aplicou? (Esse exercício pode precisar de
   mais de um.)
2. Por que essa combinação resolve o problema — o que cada padrão está
   resolvendo especificamente?
3. Chegam ao mesmo tempo um formato "JSON" e um regime "MEI". Com o seu
   design, essas duas mudanças têm algum ponto em comum no código, ou são
   totalmente independentes?
