# Exemplo 4 — Prototype: Clonando uma Referência Cíclica

## Problema

`Pessoa` tem um atributo `melhorAmigo`, do mesmo tipo da própria classe. Ana
e Bruno são melhores amigos um do outro: `ana.melhorAmigo = bruno` e
`bruno.melhorAmigo = ana` — uma referência **cíclica**. `copiar()` clona
`melhorAmigo` recursivamente, chamando `melhorAmigo.copiar()`.

## Por que incomoda

Clonar Ana exige clonar Bruno (o amigo dela); clonar Bruno exige clonar Ana
(o amigo dele); clonar essa nova cópia de Ana exige clonar Bruno de novo...
e assim por diante, para sempre. `copiar()` nunca termina — o programa
trava com `StackOverflowError`.

## Solução (Prototype com controle de ciclos)

`copiar()` passa a receber um mapa (`Map<Pessoa, Pessoa>`) que lembra quais
objetos já começaram a ser clonados **nesta operação**. Antes de clonar o
`melhorAmigo`, `copiar()` registra a cópia da pessoa atual nesse mapa.
Quando a recursão volta para um objeto que já está no mapa (o ciclo), ela
devolve a cópia que já existe, em vez de clonar de novo.

## O que mudou

O ciclo original (`ana -> bruno -> ana`) é reconstruído fielmente na cópia
(`anaCopia -> brunoCopia -> anaCopia`), mas com objetos totalmente novos —
sem nenhuma referência compartilhada com Ana e Bruno originais. E o mais
importante: `copiar()` termina, em vez de recursar para sempre.

## Ligação com o Exemplo 1

A ideia central é a mesma cópia profunda do
[Exemplo 1](../exemplo1/README.md) (não compartilhar estado mutável entre
original e cópia), só que aplicada a uma estrutura que pode ter ciclos.
Nesse caso, "copiar tudo de novo, recursivamente" não é suficiente — é
preciso lembrar o que já foi clonado, para o processo saber quando parar.
