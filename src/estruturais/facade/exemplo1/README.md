# Exemplo 1 — Facade: Fechamento de Pedido

## Problema

Fechar um pedido envolve orquestrar quatro subsistemas separados —
`EstoqueService`, `FreteService`, `PagamentoService`, `NotificacaoService`
— cada um com sua própria API, chamados numa ordem específica.
`ClasseCliente` precisa conhecer todos eles e montar essa sequência na mão.

## Por que incomoda

Qualquer lugar do sistema que precisar fechar um pedido tem que repetir a
mesma sequência de chamadas, na ordem certa (verificar estoque antes de
cobrar, calcular frete antes de somar o total, baixar estoque depois do
pagamento...). Errar a ordem ou esquecer um passo é fácil, e cada novo
ponto de uso é mais uma cópia dessa lógica para manter sincronizada.

## Solução (Facade)

`CheckoutFacade` concentra os quatro subsistemas e expõe um único método,
`finalizarCompra(...)`, que sabe a ordem certa de chamá-los.

## O que mudou

Quem precisa fechar um pedido só chama
`checkout.finalizarCompra(produto, quantidade, preco, cep)` — não conhece
`EstoqueService`, `FreteService`, `PagamentoService` nem
`NotificacaoService` diretamente. A Facade não esconde esses subsistemas
para sempre (quem realmente precisar de acesso fino ainda pode usá-los
diretamente); ela só oferece um caminho simples para o caso comum.
