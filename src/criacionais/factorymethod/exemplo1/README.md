# Exemplo 1 — Factory Method: Sistema de Notificações

## Problema

`PedidoService.confirmarPedido(tipo)` decide, com `if/else`, se instancia
`NotificacaoEmail` ou `NotificacaoSMS` e chama o método de cada uma — que nem
tem o mesmo nome (`enviarEmail()`, `enviarSms()`).

## Por que incomoda

A lógica de negócio (`PedidoService`) conhece **todas** as classes concretas
de notificação. Para adicionar um canal novo (push, WhatsApp...), é preciso:
criar a classe **e** editar `confirmarPedido`, adicionando mais um `else if`.
O método nunca para de crescer, e cada alteração arrisca quebrar os canais
que já funcionavam.

## Solução (Factory Method)

Todas as notificações passam a implementar uma interface comum
(`Notificacao`). Uma classe abstrata `NotificadorService` declara o *factory
method* `criarNotificacao()`; cada subclasse concreta
(`NotificadorEmailService`, `NotificadorSmsService`, ...) decide qual
notificação criar. O método `notificar()` (na classe base) nunca muda —
ele só usa a interface.

## O que mudou

O canal novo (`NotificacaoPush` / `NotificadorPushService`)
foi adicionado **sem alterar uma linha sequer** das classes existentes —
só criamos classes novas. É o princípio Aberto/Fechado na prática.

## Onde o ganho aparece de verdade

O Factory Method **não elimina** a escolha de qual classe concreta usar —
alguém, em algum lugar, ainda precisa decidir isso. O que ele faz é **isolar**
essa escolha num único ponto pequeno (`criarNotificacao()`), em vez de
espalhá-la em `if/else` pela lógica de negócio.

Compare as duas versões de `PedidoService`:

- **`antes/PedidoService`** é a lógica de negócio *e* quem decide o canal ao
  mesmo tempo — tem o `if/else` e instancia `NotificacaoEmail`/`NotificacaoSMS`
  diretamente.
- **`depois/PedidoService`** recebe um `NotificadorService` já pronto no
  construtor e só chama `notificar(mensagem)` — não importa nem conhece
  `NotificadorEmailService`, `NotificadorSmsService` ou qualquer classe
  concreta. Só `Cliente` (o "ponto de composição" da aplicação, papel que num
  projeto real seria de um container de injeção de dependências ou de uma
  configuração) sabe quais classes concretas existem e decide qual usar.

O ganho fica visível exatamente porque, no `depois`, **quem usa** a
notificação está separado de **quem decide** o canal — no `antes`, é a mesma
classe fazendo as duas coisas.
