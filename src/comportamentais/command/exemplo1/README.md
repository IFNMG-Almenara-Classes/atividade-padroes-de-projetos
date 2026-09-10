# Exemplo 1 — Command: Controle Remoto Universal

## Problema

`ControleRemoto.apertarBotao()` recebe uma string de comando e usa
`if/else` para decidir, na hora, se chama `luz.ligar()`,
`ventilador.desligar()` etc.

## Por que incomoda

O controle conhece todos os aparelhos da casa diretamente e precisa ser
editado toda vez que um botão novo, um aparelho novo, ou uma funcionalidade
como "desfazer" é necessária. Não há como guardar "o que foi feito" para
reverter depois — a ação já foi executada e esquecida.

## Solução (Command)

Cada ação vira um objeto que implementa `Comando` (`executar()` /
`desfazer()`): `LigarLuzComando`, `LigarVentiladorComando`. O
`ControleRemoto` (invocador) não conhece `Luz` nem `Ventilador` — ele só
recebe um `Comando`, executa e empilha num histórico para permitir desfazer.

## O que mudou

Desfazer a última ação passa a ser trivial: basta chamar `desfazer()` no
último comando do histórico. Um aparelho ou ação nova é só uma classe nova
implementando `Comando` — `ControleRemoto` nunca precisa ser alterado.
