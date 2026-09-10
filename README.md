# Aula de Arquitetura — Padrões de Projeto em Java

Repositório de apoio às aulas de arquitetura de software, com exemplos e
atividades práticas sobre **padrões de projeto (design patterns)** implementados
em Java puro (sem frameworks), usando o projeto IntelliJ IDEA (`aulaArquitetur.iml`).

## Objetivo

Cada padrão é apresentado através de um caso de uso simples que evolui em duas
etapas:

- **antes/** — código sem o padrão, deixando claro o problema (acoplamento,
  duplicação, `if/else` que cresce, violação de princípios SOLID etc).
- **depois/** — o mesmo caso de uso refatorado aplicando o padrão, com um
  `README.md` explicando **Problema**, **Por que incomoda**, **Solução** e
  **O que mudou**.

A ideia é comparar as duas versões lado a lado para entender não só *como*
implementar o padrão, mas *por que* ele resolve um problema real.

## Estrutura do repositório

```
src/
  <categoria>/       # criacionais, estruturais ou comportamentais
    <padrao>/
      exemplo1/
        antes/    # versão sem o padrão
        depois/   # versão com o padrão aplicado
        README.md # explicação do exemplo
```

Cada subpasta é também um pacote Java (`package <categoria>.<padrao>.exemplo1.antes;`
/ `...depois;`), espelhando o caminho de diretórios. Isso evita colisão de
nomes entre exemplos (ex.: `NotificacaoEmail` existe em `antes` e em `depois`)
e permite rodar qualquer classe direto pelo botão **Run** do IntelliJ, sem
configurar nada — é assim que os alunos devem executar os exemplos.

## Padrões abordados

### Criacionais (`src/criacionais/`)

| Padrão | Pasta | Exemplos |
|---|---|---|
| Factory Method | `src/criacionais/factorymethod/` | **1:** notificações (e-mail/SMS/push) sem `if/else` para decidir o canal. **2:** checkout com múltiplas formas de pagamento. |
| Abstract Factory | `src/criacionais/abstractfactory/` | **1:** kit de checkout por país (notificação + pagamento como família consistente). **2:** kit de UI por tema (botão + caixa de seleção). |
| Builder | `src/criacionais/builder/` | **1:** pedido com muitos parâmetros do mesmo tipo. **2:** hambúrguer com booleanos posicionais ilegíveis. **3:** builder aninhado (`Produto.Builder`) para encapsulamento real. **4:** construtor com todos os atributos, mas `private`. |
| Prototype | `src/criacionais/prototype/` | **1:** cópia rasa de lista mutável. **2:** clone enxergando estado interno sem getter. **3:** `Cloneable`/`clone()` não esquece campos novos. **4:** clonando uma referência cíclica. |
| Singleton | `src/criacionais/singleton/` | **1:** logger com contador de registros. **2:** configuração da aplicação. |

### Estruturais (`src/estruturais/`)

| Padrão | Pasta | Exemplos |
|---|---|---|
| Adapter | `src/estruturais/adapter/` | **1:** integrando um gateway de pagamento externo (composição). **2:** sensor de temperatura (herança). |
| Decorator | `src/estruturais/decorator/` | **1:** notificações com log e urgência. **2:** café com adicionais. |
| Facade | `src/estruturais/facade/` | **1:** fechamento de pedido (estoque, frete, pagamento, notificação). **2:** cinema em casa. |
| Composite | `src/estruturais/composite/` | **1:** catálogo de categorias e produtos. **2:** sistema de arquivos. |
| Proxy | `src/estruturais/proxy/` | **1:** carregamento preguiçoso de relatório (virtual proxy). **2:** controle de acesso (protection proxy). |

### Comportamentais (`src/comportamentais/`)

| Padrão | Pasta | Exemplos |
|---|---|---|
| Strategy | `src/comportamentais/strategy/` | **1:** cálculo de frete com regras intercambiáveis. |
| Observer | `src/comportamentais/observer/` | **1:** notificações de mudança de status do pedido. |
| Command | `src/comportamentais/command/` | **1:** controle remoto universal com desfazer. |
| State | `src/comportamentais/state/` | **1:** transições de estado do pedido. |
| Template Method | `src/comportamentais/templatemethod/` | **1:** geração de relatórios em formatos diferentes. |
| Iterator | `src/comportamentais/iterator/` | **1:** percorrendo uma playlist sem expor sua estrutura interna. |

Cada exemplo tem seu próprio `README.md` com a explicação completa
(Problema/Por que incomoda/Solução/O que mudou). Novos padrões serão
adicionados seguindo a mesma estrutura conforme as aulas avançarem.

## Como executar os exemplos

Pré-requisito: JDK instalado (11+).

**No IntelliJ IDEA** (recomendado): abra o projeto (`aulaArquitetur.iml`),
localize a classe principal do exemplo (`Cliente` ou `ClasseCliente`) e clique
no ▶ ao lado do `main` — como cada pasta é um pacote, a IDE resolve tudo
sozinha, sem configurar módulo ou classpath.

**Pelo terminal**, a partir da raiz do projeto:

```bash
javac -d out src/criacionais/factorymethod/exemplo1/depois/*.java
java -cp out criacionais.factorymethod.exemplo1.depois.Cliente
```

(troque `depois` por `antes` e `Cliente` por `ClasseCliente` para rodar a
outra versão do exemplo.)

## Como usar este repositório em aula

1. Leia o `README.md` do exemplo para entender o problema proposto.
2. Explore a versão `antes/` e identifique o que incomoda no design.
3. Compare com a versão `depois/` e veja como o padrão resolve o problema.
4. Tente estender o exemplo (ex.: adicionar um novo canal de notificação) sem
   alterar código existente — esse é o teste de que o padrão foi bem aplicado.

## Atividade prática (exercícios)

`src/exercicios/` traz 6 cenários com um problema de design cada — sem
`README.md` de solução e sem pasta `depois/`. O aluno deve identificar qual
padrão (ou combinação de padrões, como Factory Method + Strategy) resolve o
problema, refatorar o código e justificar a escolha no caderno. Veja
`src/exercicios/README.md` para as instruções completas.

O gabarito de cada exercício fica em `gabarito/`, na raiz do projeto — fora
do source root `src/`, para não ficar ao lado do material do aluno. Veja
`gabarito/README.md` para como compilá-lo.
