# Exemplo 1 — Decorator: Notificações com Log e Urgência

## Problema

Para adicionar log ao envio de uma notificação, criamos
`NotificacaoEmailComLog`. Para o mesmo log no SMS, criamos
`NotificacaoSMSComLog` — duplicando a lógica de log em cada combinação.

## Por que incomoda

Cada comportamento extra (log, urgência, ...) multiplicado por cada canal
(e-mail, SMS, push...) exige uma classe nova. Duas variações opcionais e
dois canais já dão 4 combinações; três variações e três canais dão muito
mais. A lógica de log fica copiada em cada uma, e mudar o formato do log
significa editar todas as cópias.

## Solução (Decorator)

`NotificacaoDecorator` implementa `Notificacao` e guarda outra `Notificacao`
por dentro (`notificacaoOriginal`). `NotificacaoComLog` e
`NotificacaoUrgente` são decorators concretos: cada um adiciona **um**
comportamento e delega o resto para a notificação que está por dentro dele.

## O que mudou

Qualquer combinação passa a ser só uma questão de empilhar decorators:
`new NotificacaoComLog(new NotificacaoEmail())`,
`new NotificacaoComLog(new NotificacaoUrgente(new NotificacaoSMS()))`, etc.
Duas classes de decorator cobrem todas as combinações possíveis com
qualquer canal — nenhuma classe nova é criada quando uma combinação nova é
necessária.
