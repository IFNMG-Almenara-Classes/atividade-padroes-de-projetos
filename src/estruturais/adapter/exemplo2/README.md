# Exemplo 2 — Adapter: Sensor de Temperatura (Adapter por Herança)

## Problema

`SensorFahrenheit` é um driver legado (não podemos alterá-lo) que só sabe
ler a temperatura em Fahrenheit. O resto do sistema trabalha em Celsius, e
a conversão (`(fahrenheit - 32) * 5 / 9`) fica espalhada em cada lugar que
usa o sensor.

## Por que incomoda

Além de duplicar a fórmula de conversão, o código cliente fica acoplado
diretamente à API do sensor legado. Se um dia trocarmos de sensor, ou
quisermos suportar mais de um tipo, toda essa conversão espalhada precisa
ser encontrada e ajustada.

## Solução (Adapter)

`SensorFahrenheitAdapter` **estende** `SensorFahrenheit` (herda o método
`getTemperaturaFahrenheit()`) e **implementa** `SensorTemperatura`
(`getTemperaturaCelsius()`), fazendo a conversão internamente.

## O que mudou

Quem usa `SensorTemperatura` só chama `getTemperaturaCelsius()` — não sabe
nem precisa saber que por baixo existe um `SensorFahrenheit` legado.

## Adapter por Composição x Adapter por Herança

O [Exemplo 1](../exemplo1/README.md) implementa o adapter por
**composição**: `GatewayPagamentoAdapter` guarda uma instância de
`GatewayPagamentoExterno` como campo e delega para ela. Aqui usamos
**herança**: `SensorFahrenheitAdapter` estende `SensorFahrenheit`
diretamente. A composição é mais flexível (funciona mesmo se a classe
legada for `final`, e não amarra o adapter à implementação interna dela) e
por isso é a forma mais recomendada na prática — mas herança é uma
alternativa válida quando a classe legada foi feita para ser estendida.
