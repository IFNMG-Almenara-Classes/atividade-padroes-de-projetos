# Exemplo 1 — Singleton: Logger com Contador de Registros

## Problema

Cada parte do sistema cria o próprio `Logger` (`new Logger()`).
`ServicoPedido` e `ServicoPagamento` têm, cada um, sua própria instância — e
portanto seu próprio contador de registros.

## Por que incomoda

Não existe um "total de logs do sistema": cada componente só enxerga os
eventos que ele mesmo registrou. `ServicoPedido` registra 2 eventos e diz que
tem 2; `ServicoPagamento` registra 1 e diz que tem 1 — mas o sistema como um
todo teve 3 eventos, e ninguém sabe disso. Qualquer relatório, auditoria ou
métrica que dependa desse contador estaria errado.

## Solução (Singleton)

O construtor de `Logger` vira `private`, e uma única instância estática
(`instancia`) é criada dentro da própria classe. O único jeito de obter um
`Logger` é por `Logger.getInstance()`, que sempre devolve a mesma instância.
Como só existe um `Logger` no processo inteiro, só existe um contador — e ele
reflete a realidade.

## O que mudou

`ServicoPedido` e `ServicoPagamento` não criam mais `Logger` nenhum — eles só
pedem a instância compartilhada com `Logger.getInstance()`. Nenhuma classe de
negócio precisa saber que o `Logger` é um Singleton; elas só chamam
`registrar(mensagem)` normalmente.

## Ponto de atenção

Singleton é útil quando faz sentido existir **exatamente um** desse objeto no
processo (um logger, uma configuração, uma conexão compartilhada). Use com
cuidado: como o estado fica global, ele pode "vazar" entre testes automatizados
(o contador de um teste soma com o do próximo) e esconder dependências que
deveriam estar explícitas no construtor da classe que o usa.
