# Exemplo 2 — Abstract Factory: Kit de Componentes de UI por Tema

## Problema

`TelaLogin.renderizar(tema)` monta o botão com um `if/else` baseado no
`tema`, mas a caixa de seleção é criada à parte, sempre como
`CaixaSelecaoClara` — um erro de copy-paste em que alguém esqueceu de
repetir a condição para esse componente.

## Por que incomoda

Botão e caixa de seleção formam um "kit visual" que precisa vir do mesmo
tema — mas nada no código impede que cada componente seja escolhido de forma
independente (e, na prática, errada). Quando a tela é renderizada com
`tema = "ESCURO"`, o botão fica escuro, mas a caixa de seleção continua
clara: a UI mistura dois temas ao mesmo tempo, e o bug só é percebido
olhando a tela — o compilador não acusa nada.

## Solução (Abstract Factory)

Botão e caixa de seleção viram produtos de uma família, atrás de uma
fábrica: `FabricaTema` declara `criarBotao()` **e** `criarCaixaSelecao()`.
Cada tema ganha uma fábrica concreta (`FabricaTemaClaro`,
`FabricaTemaEscuro`) que implementa os dois métodos e garante que os
componentes retornados são sempre do mesmo tema.

## O que mudou

`TelaLogin` não decide mais qual componente usar: recebe uma `FabricaTema`
pronta no construtor e pede a ela o botão e a caixa de seleção. Como os dois
vêm sempre da mesma fábrica, é impossível misturar `BotaoEscuro` com
`CaixaSelecaoClara` por engano — o bug do `antes` deixa de existir
estruturalmente, não só na prática.

## Mesma ideia do Exemplo 1, outro tipo de bug

No [Exemplo 1](../exemplo1/README.md), o problema era **esquecer** um
produto da família (um país sem pagamento configurado). Aqui, o problema é
**misturar** produtos de famílias diferentes (tema claro com tema escuro).
O Abstract Factory resolve os dois: como uma única fábrica sempre entrega a
família inteira e consistente, não tem como faltar peça nem como misturar
peças de famílias diferentes.
