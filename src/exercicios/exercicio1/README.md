# Exercício 1 — Emissão de Ingressos de Evento

## Contexto

Uma produtora de eventos vende três tipos de ingresso — VIP, Comum e Meia —,
cada um com preço e benefícios diferentes. `VendaIngressos.emitir(tipo)`
recebe uma string e decide qual `Ingresso` montar.

## O código atual

`emitir()` usa uma cadeia de `if/else` comparando a string `tipo` para
decidir preço e benefício de cada ingresso. Toda vez que a produtora lança um
tipo novo, alguém precisa editar esse método e acrescentar mais um ramo —
mexendo em uma lógica que já atende os tipos existentes.

## Objetivo

Refatore o código para que criar um ingresso novo não exija alterar
`VendaIngressos`. O comportamento observado em `ClasseCliente` (as três
linhas de saída) deve continuar o mesmo depois da refatoração.

## Para responder no caderno

1. Qual padrão de projeto você aplicou?
2. Por que esse padrão resolve o problema, e não outro que também parecia
   possível?
3. O organizador quer lançar o ingresso "ESTUDANTE" (desconto de 30% sobre o
   comum, exige carteirinha). Com o seu design, o que precisa ser criado ou
   alterado? Alguma classe existente precisa ser tocada?
