# Exemplo 1 — State: Estados do Pedido

## Problema

`Pedido` guarda o status como uma `String` e `avancar()`/`cancelar()` usam
`if/else` para decidir, a partir do status atual, para onde o pedido pode
ir e o que é permitido.

## Por que incomoda

As regras de transição de todos os estados ficam concentradas nos mesmos
dois métodos. Acrescentar um status novo (ex.: "EM_SEPARACAO") ou mudar uma
regra existente (ex.: permitir cancelar depois de enviado) obriga a
reescrever `avancar()` e `cancelar()` inteiros, arriscando quebrar uma
transição que já funciona.

## Solução (State)

Cada status vira uma classe que implementa `EstadoPedido`
(`EstadoNovo`, `EstadoPago`, `EstadoEnviado`, `EstadoEntregue`,
`EstadoCancelado`), com sua própria regra de `avancar()` e `cancelar()`.
`Pedido` delega as duas ações para o estado atual e troca de estado através
de `setEstado()`.

## O que mudou

Cada estado só conhece a própria transição — `EstadoPago` não precisa saber
o que `EstadoEnviado` faz. Um status novo entra como uma classe nova, e só
os estados vizinhos a ele (o que aponta para ele) precisam de ajuste; os
demais permanecem intactos.
