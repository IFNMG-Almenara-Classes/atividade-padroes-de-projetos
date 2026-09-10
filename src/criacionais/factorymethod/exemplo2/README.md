# Exemplo 2 — Factory Method: Checkout com Múltiplas Formas de Pagamento

## Problema

`CheckoutService.finalizarCompra(tipoPagamento, valor)` decide, com `if/else`,
se instancia `PagamentoCartao` ou `PagamentoPix` e chama o método de cada
uma — que nem tem o mesmo nome (`processarCartao()`, `processarPix()`).

## Por que incomoda

O `CheckoutService` conhece **todas** as classes concretas de pagamento. Para
adicionar uma forma de pagamento nova (boleto, cripto...), é preciso: criar a
classe **e** editar `finalizarCompra`, adicionando mais um `else if`. O
método nunca para de crescer, e cada alteração arrisca quebrar as formas de
pagamento que já funcionavam.

## Solução (Factory Method)

Todos os pagamentos passam a implementar uma interface comum (`Pagamento`).
Uma classe abstrata `ProcessadorPagamento` declara o *factory method*
`criarPagamento()`; cada subclasse concreta (`ProcessadorCartaoService`,
`ProcessadorPixService`, ...) decide qual pagamento criar. O método
`processar()` (na classe base) nunca muda — ele só usa a interface.

## O que mudou

A forma de pagamento nova (`PagamentoBoleto` / `ProcessadorBoletoService`)
foi adicionada **sem alterar uma linha sequer** das classes existentes — só
criamos classes novas. É o princípio Aberto/Fechado na prática.

## Onde o ganho aparece de verdade

Compare as duas versões de `CheckoutService`:

- **`antes/CheckoutService`** é a lógica de negócio *e* quem decide a forma
  de pagamento ao mesmo tempo — tem o `if/else` e instancia
  `PagamentoCartao`/`PagamentoPix` diretamente.
- **`depois/CheckoutService`** recebe um `ProcessadorPagamento` já pronto no
  construtor e só chama `processar(valor)` — não importa nem conhece
  `ProcessadorCartaoService`, `ProcessadorPixService` ou qualquer classe
  concreta. Só `Cliente` (o "ponto de composição" da aplicação) sabe quais
  classes concretas existem e decide qual usar.

O ganho fica visível exatamente porque, no `depois`, **quem usa** o
checkout está separado de **quem decide** a forma de pagamento — no `antes`,
é a mesma classe fazendo as duas coisas. Esse é o mesmo raciocínio do
[Exemplo 1](../exemplo1/README.md), aplicado a um domínio diferente.
