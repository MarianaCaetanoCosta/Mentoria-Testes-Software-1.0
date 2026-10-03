# 06 - JMeter API

## Objetivo

Projeto de automação e testes de desempenho de API REST da aplicação Lojinha, utilizando Apache JMeter e Swagger como apoio para identificação dos endpoints.

## Stack utilizada

- Apache JMeter
- HTTP / REST
- JSON
- Swagger
- CSV Data Set Config
- Autenticação por token

## Estrutura do projeto

```text
06-jmeter-api/
├── README.md
├── Lojinha API Testes.jmx
└── dados-teste-api.csv
```

## Cenários automatizados

- Login na API
- Captura e reutilização de token
- Cadastro de produto
- Parametrização de dados via CSV
- Validação das respostas da API

## Como executar

Abra `Lojinha API Testes.jmx` no Apache JMeter.

Para execução em modo GUI:

```bash
jmeter
```

Para execução em linha de comando:

```bash
jmeter -n -t "Lojinha API Testes.jmx" -l resultados-api.jtl
```

Verifique no plano de teste se o caminho do `CSV Data Set Config` aponta para `dados-teste-api.csv`.

## Relatórios

Gerar relatório HTML a partir do arquivo JTL:

```bash
jmeter -g resultados-api.jtl -o report-api
```

O relatório será criado em `report-api/`.

## Documentação

- [Apache JMeter](https://jmeter.apache.org/usermanual/)
- [JMeter Downloads](https://jmeter.apache.org/download_jmeter.cgi)
- [Swagger](https://swagger.io/docs/)
