# Exemplo 4 — Builder: Construtor com Todos os Atributos, mas Privado

## Problema

`Produto` só tem um construtor público, com todos os atributos
(`public Produto(String nome, double preco, String descricao, String
categoria, double peso)`). Não existe Builder nenhum — quem quiser criar um
`Produto` chama esse construtor diretamente.

## Por que incomoda

Nada valida os dados: `new Produto(null, 0, null, null, 0)` compila e roda
normalmente, e ninguém percebe o problema. E como `nome`, `descricao` e
`categoria` são todos `String`, é fácil trocar a ordem delas sem que o
compilador acuse nada — no exemplo, a descrição e a categoria saem
invertidas.

## Solução (Builder)

`Produto` ganha um `Builder` estático aninhado (mesma técnica do
[Exemplo 3](../exemplo3/README.md)), com um método nomeado por atributo
(`nome(...)`, `preco(...)`, `descricao(...)`, ...) e uma validação dentro de
`build()`. O construtor com todos os atributos continua existindo — só que
agora é `private`, e só o próprio `Builder` (por estar aninhado em
`Produto`) consegue chamá-lo.

## O que mudou

Não tem mais como criar um `Produto` sem passar por `build()` — o
compilador nem deixa chamar `new Produto(...)` de fora da classe. E a
montagem fica autoexplicativa: cada valor é identificado pelo nome do método
que o define, não pela posição, então não tem mais como trocar
`descricao` por `categoria` sem querer.

A diferença para o Exemplo 3 é sutil, mas importante: lá o construtor
privado recebia o `Builder` inteiro como parâmetro
(`Produto(Builder builder)`); aqui ele recebe os atributos diretamente —
`Produto` ganha a mesma proteção contra criação inválida **sem** precisar
conhecer o tipo `Builder`.
