# Exemplo 2 — Singleton: Configuração da Aplicação

## Problema

`RelatorioService` e `EmailService` criam, cada um, o próprio
`ConfiguracaoApp` (`new ConfiguracaoApp()`). Cada instância carrega (imprime
"Carregando configurações...") e guarda sua própria cópia de nome da
aplicação, URL do banco de dados e e-mail do remetente.

## Por que incomoda

As configurações são carregadas mais de uma vez (desperdício — num caso real
seria ler um arquivo ou uma tabela do banco toda vez). Pior: se alguém
atualiza uma configuração em runtime (ex.: um painel administrativo muda o
nome da loja), só a instância alterada enxerga a mudança — as outras
continuam com o valor antigo. O sistema fica com duas "verdades" diferentes
ao mesmo tempo.

## Solução (Singleton)

O construtor de `ConfiguracaoApp` vira `private`, e a única instância é
criada uma vez (`instancia`), acessível por `ConfiguracaoApp.getInstance()`.
Não importa quantas classes peçam a configuração: todas recebem a mesma
referência, com os mesmos valores.

## O que mudou

`RelatorioService` e `EmailService` não guardam mais sua própria
`ConfiguracaoApp` — cada um pede `ConfiguracaoApp.getInstance()` quando
precisa. "Carregando configurações..." aparece **uma única vez**, e uma
atualização feita por qualquer parte do sistema é enxergada por todas as
outras imediatamente.

## Ponto de atenção

Mesmo ganho do [Exemplo 1](../exemplo1/README.md): um Singleton mutável é
estado global compartilhado — ótimo para garantir uma única fonte de verdade,
mas também uma fonte comum de bugs sutis (uma parte do sistema muda a
configuração e outra, que não esperava isso, se comporta diferente) e de
dificuldade em testes automatizados.
