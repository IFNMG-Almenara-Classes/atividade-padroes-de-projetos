# Exercício 4 — Organograma de Empresa

## Contexto

Uma empresa organiza seu quadro em `Departamento`s, que contêm
`Funcionario`s e podem conter outros `Departamento`s aninhados (um
sub-departamento dentro de outro). É preciso somar a folha de pagamento
total de um departamento, incluindo todos os seus sub-departamentos.

## O código atual

`somarFolha()`, em `ClasseCliente`, precisa tratar `Funcionario` e
`Departamento` de formas diferentes: soma o salário de cada funcionário
direto e, separadamente, chama a si mesma recursivamente para cada
sub-departamento. Qualquer código novo que precise percorrer essa árvore
(por exemplo, contar quantas pessoas há no total, ou imprimir o organograma)
vai precisar repetir essa mesma distinção entre os dois tipos.

## Objetivo

Refatore `Funcionario` e `Departamento` para que possam ser tratados de
forma uniforme por quem percorre a árvore — sem um método externo que
precise saber a diferença entre "folha" (funcionário) e "nó" (departamento).
O valor total impresso em `ClasseCliente` deve continuar o mesmo depois da
refatoração.

## Para responder no caderno

1. Qual padrão de projeto você aplicou?
2. Por que esse padrão resolve o problema, e não outro que também parecia
   possível?
3. Se pedirem para também exibir a quantidade total de pessoas em um
   departamento (incluindo sub-departamentos), o que você precisa
   acrescentar no seu design? Precisa duplicar a lógica de navegação da
   árvore?
