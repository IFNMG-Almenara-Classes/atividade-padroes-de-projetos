# Atividade prática — Aplique um Padrão de Projeto

## Como funciona

Cada `exercicioN/` abaixo tem um cenário com um problema real de design —
parecido com as pastas `antes/` dos exemplos de aula, mas aqui **não existe
uma versão `depois/`**: a solução é sua.

Para cada exercício:

1. Leia o `README.md` do exercício (Contexto / O código atual / Objetivo).
2. Rode o `ClasseCliente` para ver o comportamento atual.
3. Identifique, entre os padrões vistos em aula, qual (ou quais) resolve o
   problema descrito.
4. Refatore o código aplicando o padrão escolhido — o comportamento
   observável do `ClasseCliente` deve continuar o mesmo depois da mudança.
5. No **caderno** (fora do repositório), responda às perguntas do final do
   README do exercício: qual padrão você escolheu, por que ele e não outro,
   e o que seu design ganha com a mudança.

Alguns exercícios têm um problema só, resolvido por um padrão só. Outros
combinam dois problemas independentes no mesmo código, e podem precisar de
dois padrões trabalhando juntos (ex.: um cuidando de "como calcular algo", o
outro cuidando de "quem precisa ser avisado quando algo acontece").

## Exercícios

| # | Cenário |
|---|---|
| 1 | Emissão de ingressos de evento |
| 2 | Configuração de assinatura SaaS |
| 3 | Rastreamento de encomendas |
| 4 | Organograma de empresa |
| 5 | Desconto no carrinho de compras |
| 6 | Relatório fiscal |

Consulte os exemplos em `src/criacionais/`, `src/estruturais/` e
`src/comportamentais/` sempre que precisar relembrar como um padrão é
estruturado em Java.
