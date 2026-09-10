# Exemplo 2 — Decorator: Café com Adicionais

## Problema

Cada combinação de adicionais (leite, chocolate, canela...) vira uma classe
nova: `CafeComLeite`, `CafeComLeiteEChocolate`, e assim por diante.

## Por que incomoda

Com `n` adicionais possíveis, existem até `2ⁿ` combinações — 3 adicionais
já dão 8 combinações, 4 dão 16. Criar uma classe para cada uma é inviável, e
cada classe repete a lógica de somar preço e montar a descrição.

## Solução (Decorator)

`AdicionalDecorator` estende `Bebida` e guarda outra `Bebida` por dentro.
`Leite`, `Chocolate` e `Canela` são decorators concretos: cada um adiciona
**um** ingrediente ao preço e à descrição da bebida que está por dentro
dele.

## O que mudou

Qualquer combinação de adicionais passa a ser só uma questão de empilhar
decorators: `new Canela(new Chocolate(new Leite(new Cafe())))`. Três
classes de decorator cobrem todas as `2³` combinações possíveis — e um
adicional novo (ex.: chantilly) significa **uma** classe nova, não o dobro
das combinações já existentes.
