# Exemplo 2 — Facade: Cinema em Casa

## Problema

Assistir um filme envolve orquestrar quatro subsistemas — `Projetor`,
`SistemaSom`, `Luzes`, `Streaming` — cada um ligado e configurado numa
ordem específica, e desligado na ordem inversa ao final.

## Por que incomoda

`ClasseCliente` precisa conhecer os quatro subsistemas e lembrar a
sequência certa tanto para começar quanto para encerrar a sessão. Qualquer
outro lugar do sistema (um app, um controle remoto, uma automação) que
quiser "assistir um filme" precisa reimplementar as duas sequências.

## Solução (Facade)

`CinemaEmCasaFacade` concentra os quatro subsistemas e expõe dois métodos
simples: `assistirFilme(filme)` e `encerrarSessao()`.

## O que mudou

Quem quer assistir um filme só chama `cinema.assistirFilme("Matrix")` e,
no final, `cinema.encerrarSessao()` — sem conhecer `Projetor`,
`SistemaSom`, `Luzes` ou `Streaming` individualmente. A mesma ideia do
[Exemplo 1](../exemplo1/README.md), aplicada a um domínio bem diferente:
Facade não é sobre pedidos ou pagamentos especificamente, é sobre esconder
a orquestração de vários subsistemas atrás de uma operação simples.
