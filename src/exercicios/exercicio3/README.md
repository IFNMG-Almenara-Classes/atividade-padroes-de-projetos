# Exercício 3 — Rastreamento de Encomendas

## Contexto

O sistema interno de logística foi desenhado em torno da interface
`RastreadorEncomenda`, com um único método:
`String consultarStatus(String codigoRastreio)`. Para expandir a operação,
a empresa contratou uma transportadora terceirizada, cuja biblioteca
(`TransportadoraExternaApi`) já vem pronta e **não pode ser alterada**.

## O código atual

`TransportadoraExternaApi.getStatusCode(trackingId)` devolve um código
numérico (1, 2, 3), não uma `String`, e usa um nome de parâmetro e de método
diferentes do que `RastreadorEncomenda` espera. Sem uma forma de encaixar
essa API na interface interna, o código cliente converte o número em texto
manualmente toda vez que precisa consultar um status — duplicando a mesma
lógica de conversão em vários lugares.

## Objetivo

Refatore o código para que a API externa possa ser usada em qualquer lugar
que espera um `RastreadorEncomenda`, sem duplicar a conversão de código para
texto e sem alterar `TransportadoraExternaApi`. O comportamento observado em
`ClasseCliente` (os dois status impressos) deve continuar o mesmo depois da
refatoração.

## Para responder no caderno

1. Qual padrão de projeto você aplicou?
2. Por que esse padrão resolve o problema, e não outro que também parecia
   possível?
3. Se amanhã surgir uma segunda transportadora, com uma API totalmente
   diferente (por exemplo, devolvendo um `enum` em vez de um número), o que
   muda no seu design? O código que consulta o status precisa saber disso?
