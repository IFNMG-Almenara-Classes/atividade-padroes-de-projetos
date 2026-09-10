# Exemplo 2 — Composite: Sistema de Arquivos

## Problema

`Pasta` guarda uma lista de `Arquivo` e uma lista de outras `Pasta`
(subpastas). `calcularTamanhoTotal` e `exibirArvore` são duas funções
recursivas separadas, cada uma percorrendo as duas listas do zero.

## Por que incomoda

As duas funções repetem a mesma estrutura de recursão (percorrer arquivos,
depois subpastas), e uma terceira operação (contar arquivos, buscar por
nome, aplicar um filtro...) exigiria escrever essa recursão pela quarta
vez. `Arquivo` e `Pasta` não têm nada em comum — não dá para tratar um
arquivo avulso como se fosse uma pasta.

## Solução (Composite)

`ItemSistemaArquivos` é a interface comum, com `getTamanhoKb()` e
`exibir(prefixo)`. `Arquivo` implementa o caso simples. `Pasta` também
implementa `ItemSistemaArquivos`, mas guarda uma única lista de
`ItemSistemaArquivos` — arquivos e subpastas juntos.

## O que mudou

`exibir()` e `getTamanhoKb()` são escritos **uma vez** cada, e funcionam
para qualquer profundidade de aninhamento — a recursão está dentro de
`Pasta.exibir()`/`Pasta.getTamanhoKb()`, chamando `exibir()`/`getTamanhoKb()`
de cada item, sem saber (nem precisar saber) se é um `Arquivo` ou outra
`Pasta`.

## Ligação com o Exemplo 1

Mesma ideia do [Exemplo 1](../exemplo1/README.md) (produtos e categorias),
aplicada a arquivos e pastas — reforçando que Composite não é sobre um
domínio específico, é sobre tratar "a parte" e "o todo" de forma uniforme
em qualquer estrutura de árvore.
