# 07 - JMeter Web

## Objetivo

Projeto de testes de desempenho da aplicação Lojinha Web, utilizando Apache JMeter para avaliar comportamento sob diferentes condições de carga.

## Stack utilizada

- Apache JMeter
- HTTP
- CSV Data Set Config
- Usuários virtuais
- Temporização
- Relatórios de desempenho

## Estrutura do projeto

```text
07-jmeter-web/
├── README.md
├── Lojinha Web Testes.jmx
└── dados-teste-web.csv
```

## Cenários automatizados

- Login
- Cadastro de produto
- Cadastro de componente
- Listagem de produtos
- Logoff
- Parametrização de usuários e dados via CSV

## Como executar

Abra `Lojinha Web Testes.jmx` no Apache JMeter.

Para execução em modo GUI:

```bash
jmeter
```

Para execução em linha de comando:

```bash
jmeter -n -t "Lojinha Web Testes.jmx" -l resultados-web.jtl
```

Verifique no plano de teste se o `CSV Data Set Config` aponta para `dados-teste-web.csv`.

## Relatórios

Gerar relatório HTML:

```bash
jmeter -g resultados-web.jtl -o report-web
```

O relatório será criado em `report-web/`.

## Documentação

- [Apache JMeter](https://jmeter.apache.org/usermanual/)
- [JMeter Downloads](https://jmeter.apache.org/download_jmeter.cgi)
