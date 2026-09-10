# Exemplo 1 — Proxy: Carregamento Preguiçoso de Relatório (Virtual Proxy)

## Problema

`RelatorioVendas` carrega dados pesados no próprio construtor. Só para
listar os relatórios disponíveis, `ClasseCliente` acaba criando um
`RelatorioVendas` para cada um — pagando o custo do carregamento pesado de
todos, mesmo que o usuário só vá abrir um.

## Por que incomoda

O carregamento pesado (que num sistema real poderia ser uma consulta
pesada no banco, uma agregação de milhares de registros, uma chamada a um
serviço externo) acontece cedo demais, antes de saber se o relatório será
realmente usado.

## Solução (Proxy)

`RelatorioVendasProxy` implementa a mesma interface `Relatorio`, mas não
carrega nada no construtor — só guarda o título. O `RelatorioVendas` real
(com o carregamento pesado) só é criado dentro de `exibir()`, na primeira
vez que ele é chamado, e reaproveitado depois se `exibir()` for chamado de
novo.

## O que mudou

Criar um `RelatorioVendasProxy` é uma operação barata — o carregamento
pesado só acontece se e quando o relatório for realmente exibido. Quem usa
`Relatorio` não percebe a diferença: chama `exibir()` normalmente, sem
saber que existe um proxy adiando o trabalho pesado por trás.
