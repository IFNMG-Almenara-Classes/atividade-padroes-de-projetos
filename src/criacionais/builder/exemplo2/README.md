# Exemplo 2 — Builder: Montagem de Hambúrguer Personalizado

## Problema

`new Hamburguer(pao, carne, true, true, false, false, false, true)` — o que
significa cada `true`/`false`? É preciso contar a posição e conferir a
assinatura do construtor para saber a qual ingrediente cada booleano se
refere.

## Por que incomoda

Além de ilegível, é fácil trocar a posição de dois booleanos sem perceber (o
compilador não ajuda — são todos `boolean`) e montar um lanche com os
ingredientes errados. E se o cliente quiser um ingrediente extra que não
estava previsto no construtor (picles, ovo, catupiry...)? Não tem como —
seria preciso alterar a classe toda vez que surgisse um ingrediente novo.

## Solução (Builder)

`HamburguerBuilder` recebe os itens obrigatórios (pão, carne) no próprio
construtor e expõe um método por ingrediente opcional (`comQueijo()`,
`comBacon()`, ...), além de `adicionarIngredienteExtra(nome)`, que pode ser
chamado quantas vezes for preciso. `build()` monta o `Hamburguer` (imutável)
só no final.

## O que mudou

A montagem vira uma sequência legível de "com isso, com aquilo" — cada
ingrediente é identificado pelo nome do método, não pela posição. E
ingredientes extras, que o `antes` nem conseguia representar, agora são só
mais uma chamada encadeada, quantas vezes o cliente quiser — sem precisar
mexer na classe `Hamburguer` nem no `HamburguerBuilder`.

## Mesma ideia do Exemplo 1, outra faceta do problema

No [Exemplo 1](../exemplo1/README.md), o risco era trocar a ordem de
parâmetros do **mesmo tipo** (`String` por `String`). Aqui, o problema é a
lista de `boolean` posicionais ser ilegível **e** fechada — não dá para
estender sem alterar a classe. O Builder resolve os dois: parâmetros viram
métodos nomeados, e a lista de ingredientes extras mostra que o Builder
também acomoda uma quantidade variável de partes, algo que um construtor
fixo não consegue expressar bem.
