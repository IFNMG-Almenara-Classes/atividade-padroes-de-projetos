# Exemplo 3 — Builder: Builder Aninhado (Nested Static Class)

## Problema

Nos exemplos anteriores, `PedidoBuilder`/`HamburguerBuilder` são classes
separadas do produto que constroem. Para o builder acessar o construtor do
produto, esse construtor precisa ser pelo menos `package-private` — nunca
`private` de verdade, porque uma classe *top-level* não enxerga membros
`private` de outra, mesmo estando no mesmo pacote.

## Por que incomoda

Isso deixa uma brecha: qualquer outra classe do mesmo pacote pode chamar
`new Produto(new ProdutoBuilder())` diretamente, ignorando completamente o
builder e as validações que ele faz em `build()`. No exemplo,
`ClasseCliente` cria um `Produto` sem nome e com preço 0 dessa forma — o
objeto "validado" não estava tão protegido quanto parecia.

## Solução (Builder aninhado)

`Builder` vira uma classe estática aninhada **dentro** de `Produto`
(`Produto.Builder`). Classes aninhadas enxergam os membros `private` da
classe externa (e vice-versa) — então o construtor de `Produto` pode ser
`private` de verdade. Só quem está "dentro" de `Produto` (ou seja, o próprio
`Builder`) consegue chamá-lo.

## O que mudou

`new Produto(...)` deixou de compilar fora da classe `Produto` — a única
forma de criar um `Produto` é por `new Produto.Builder()...build()`, que
sempre passa pela validação. Além do ganho de encapsulamento, o uso fica
mais descobrível: ao digitar `Produto.` na IDE, o autocomplete já mostra
`Builder` ali, sem precisar procurar uma classe separada.

## Quando usar cada forma

- **Builder separado** ([Exemplo 1](../exemplo1/README.md),
  [Exemplo 2](../exemplo2/README.md)): mais simples de ler quando se está
  aprendendo o padrão pela primeira vez.
- **Builder aninhado** (este exemplo): forma mais comum em bibliotecas e
  APIs Java reais — é como o livro *Effective Java* (Joshua Bloch)
  apresenta o padrão. Vale o "extra" de aninhamento pelo ganho real de
  encapsulamento: ninguém cria o objeto sem passar pela validação do
  builder.
