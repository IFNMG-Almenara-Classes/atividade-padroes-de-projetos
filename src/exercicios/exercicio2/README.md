# Exercício 2 — Configuração de Assinatura SaaS

## Contexto

Um sistema de assinaturas SaaS tem um plano com vários atributos opcionais:
quantidade de usuários, suporte 24h, SLA contratado, dias de teste grátis e
percentual de desconto. `Assinatura` tenta cobrir as combinações com vários
construtores sobrecarregados, cada um chamando o próximo (`this(...)`) com
mais parâmetros.

## O código atual

Para criar uma `Assinatura` com SLA mas sem teste grátis, ou com desconto mas
sem SLA, é preciso decorar a ordem exata dos parâmetros posicionais de cada
construtor — vários deles são `boolean`, `int` e `double` seguidos, fáceis de
trocar sem o compilador acusar erro nenhum.

## Objetivo

Refatore a criação de `Assinatura` para que fique claro, no ponto de
construção, o que cada valor representa — sem depender de decorar a ordem de
parâmetros posicionais. O comportamento observado em `ClasseCliente` (os
dois `toString()` impressos) deve continuar o mesmo depois da refatoração.

## Para responder no caderno

1. Qual padrão de projeto você aplicou?
2. Por que esse padrão resolve o problema, e não outro que também parecia
   possível?
3. Um plano novo, "STARTUP", tem só três atributos preenchidos (plano,
   usuários e desconto) e ignora suporte, SLA e teste grátis. Como seu design
   deixa isso simples de expressar no código cliente?
