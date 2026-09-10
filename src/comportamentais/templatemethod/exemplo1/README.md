# Exemplo 1 — Template Method: Geração de Relatórios

## Problema

`RelatorioPdf` e `RelatorioExcel` têm cada um seu próprio método `gerar()`,
repetindo os passos "abrir conexão", "buscar dados" e "fechar conexão" —
só o passo de formatação muda entre eles.

## Por que incomoda

Os passos comuns do algoritmo estão copiados em cada classe de relatório.
Um formato novo (CSV, JSON...) significa copiar tudo de novo; e se um dia
mudar a forma de abrir a conexão com o banco, é preciso lembrar de editar
todas as cópias existentes, uma por uma.

## Solução (Template Method)

`GeradorRelatorio` define o algoritmo completo em um método `gerar()` que
não pode mais ser sobrescrito (`final`), chamando passos privados
(`abrirConexao()`, `buscarDados()`, `fecharConexao()`) e um passo abstrato
(`formatar()`). `RelatorioPdf` e `RelatorioExcel` só implementam
`formatar()`.

## O que mudou

Os passos comuns existem em um único lugar. Um formato novo é só uma
subclasse sobrescrevendo `formatar()` — inclusive sem precisar de uma
classe nomeada, como a classe anônima do `relatorioCsv` em `Cliente`.
