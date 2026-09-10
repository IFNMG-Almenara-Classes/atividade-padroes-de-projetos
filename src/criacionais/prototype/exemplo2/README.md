# Exemplo 2 — Prototype: Copiar Enxerga Estado Interno que a Cópia Manual Externa Não Vê

## Problema

Além dos itens, `Pedido` tem um contador interno, `contadorDeItens`,
incrementado só quando `adicionarItem(item)` é chamado (usado depois em
`imprimirRelatorio()`). Esse campo **não tem getter** — é um detalhe
interno da classe. "Repetir" o pedido copiando campo por campo **de fora**
da classe, como no [Exemplo 1](../exemplo1/README.md) fazia antes de existir
`copiar()`, usaria só o que está disponível publicamente (`getCliente()`,
`getItens()`, `getEnderecoEntrega()`).

## Por que incomoda

Como `contadorDeItens` não tem getter, uma cópia feita só com a API pública
simplesmente não tem como saber que ele existe — o pedido "repetido"
nasceria com o contador zerado, mesmo tendo os mesmos itens do original. O
relatório de quantidade de itens do pedido repetido sairia errado (mostraria
0), mesmo com a lista de itens correta.

## Solução (Prototype)

`Pedido` ganha um método `copiar()`, escrito **dentro** da própria classe.
Como acesso `private` em Java vale por classe (não por instância),
`copiar()` consegue ler `this.contadorDeItens` e escrever direto no campo
`contadorDeItens` da cópia — mesmo esse campo nunca tendo um getter público.

## O que mudou

O pedido copiado carrega fielmente o estado interno do original, mesmo o
que nunca foi exposto publicamente. É exatamente essa a vantagem de colocar
a lógica de cópia **dentro** da classe (Prototype) em vez de tentar montá-la
por fora, usando só getters: de dentro, você enxerga tudo; de fora, só o
que foi exposto.

## Ligação com o Exemplo 1

O [Exemplo 1](../exemplo1/README.md) mostrou o cuidado que `copiar()`
precisa ter com campos mutáveis (a lista de itens, que exige uma cópia
nova). Este exemplo mostra o outro lado: `copiar()` também consegue levar
adiante estado que nem faz parte da API pública da classe — algo que uma
cópia feita de fora, só com getters, jamais conseguiria.
