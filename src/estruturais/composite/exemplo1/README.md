# Exemplo 1 — Composite: Catálogo de Categorias e Produtos

## Problema

`Categoria` guarda uma lista de `Produto` e uma lista de outras
`Categoria` (subcategorias), formando uma árvore. Cada operação sobre essa
árvore (`calcularValorTotal`, `contarItens`) precisa da sua própria função
recursiva, percorrendo as duas listas manualmente.

## Por que incomoda

Toda nova operação sobre o catálogo (listar nomes, aplicar desconto, gerar
relatório...) exige escrever de novo a mesma recursão manual. E como
`Produto` e `Categoria` são tipos diferentes, sem nada em comum, não dá
para tratar um produto avulso do mesmo jeito que uma categoria — cada
função só aceita `Categoria`.

## Solução (Composite)

`ItemCatalogo` é uma interface comum, com `getPreco()` e `contarItens()`.
`Produto` implementa o caso simples (ele mesmo). `Categoria` também
implementa `ItemCatalogo`, mas guarda uma única lista de `ItemCatalogo` —
produtos e subcategorias juntos — e soma o resultado de cada item.

## O que mudou

Uma operação nova só precisa ser escrita **uma vez**, na interface
`ItemCatalogo` (implementada de forma trivial em `Produto` e recursiva em
`Categoria`) — nenhuma função externa de percurso é mais necessária.
`Produto` e `Categoria` são intercambiáveis: qualquer código que espera um
`ItemCatalogo` funciona com os dois, sem `instanceof` nem tratamento
especial.
