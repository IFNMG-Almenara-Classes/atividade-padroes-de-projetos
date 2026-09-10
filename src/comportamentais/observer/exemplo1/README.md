# Exemplo 1 — Observer: Notificações de Status do Pedido

## Problema

`Pedido.avancarStatus()` instancia e chama diretamente `EmailService`,
`EstoqueService` e, em certas condições, `FinanceiroService` toda vez que o
status muda.

## Por que incomoda

`Pedido` conhece todos os serviços interessados em sua mudança de status e
suas regras específicas (ex.: financeiro só age em "ENTREGUE"). Adicionar um
novo interessado — marketing, um sistema de auditoria, um webhook externo —
significa editar `Pedido` outra vez, aumentando o acoplamento e o risco de
quebrar uma notificação existente.

## Solução (Observer)

`Pedido` passa a manter uma lista de `ObservadorPedido` e, ao mudar de
status, apenas percorre a lista chamando `atualizar(novoStatus)` — sem saber
quem são os observadores nem o que cada um faz. `EmailObserver`,
`EstoqueObserver` e `FinanceiroObserver` implementam a interface e decidem
sozinhos como reagir.

## O que mudou

Um novo interessado é só uma classe nova implementando `ObservadorPedido`
(ou até um lambda, como o observador de marketing no `Cliente`) registrada
com `adicionarObservador()` — `Pedido` nunca mais precisa ser alterado para
avisar alguém novo.
