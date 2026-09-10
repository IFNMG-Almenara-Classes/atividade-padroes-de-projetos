# Exemplo 2 — Proxy: Controle de Acesso (Protection Proxy)

## Problema

`ClasseCliente` verifica o cargo do usuário na mão, no local de uso, antes
de chamar `painel.excluirTodosPedidos()`.

## Por que incomoda

Essa verificação depende de quem escreveu aquele código específico lembrar
de fazê-la. Qualquer outro lugar do sistema que também chame
`excluirTodosPedidos()` precisa repetir a mesma checagem — e é só esquecer
uma vez para abrir uma brecha de segurança.

## Solução (Proxy)

`PainelAdministrativoProxy` implementa a mesma interface `Painel` que o
`PainelAdministrativo` real, mas verifica o cargo do usuário **antes** de
delegar a chamada. O `PainelAdministrativo` real não sabe nada sobre
permissões — ele confia em quem o está chamando.

## O que mudou

A verificação de permissão sai do local de uso e vai para dentro do proxy,
num único lugar. Todo código que acessa o painel através de
`PainelAdministrativoProxy` está automaticamente protegido — não tem como
esquecer a checagem, porque ela não depende mais de quem está chamando.

## Tipos de Proxy

Esse é um **Proxy de Proteção** (controla quem pode acessar o objeto real).
O [Exemplo 1](../exemplo1/README.md) é um **Proxy Virtual** (adia a criação
de um objeto caro). Outros tipos comuns incluem o Proxy Remoto
(representa um objeto que vive em outro processo/servidor) e o Proxy de
Cache (guarda resultados para não repetir um trabalho caro) — todos seguem
a mesma ideia: um objeto com a mesma interface do original, controlando o
acesso a ele por algum motivo.
