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

## Como executar pelo Apache JMeter

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

## Executar pelo Visual Studio Code

O VS Code não executa arquivos `.jmx` nativamente. Ele pode ser utilizado para editar o projeto e executar o JMeter pelo terminal integrado.

Exemplo:

```bash
jmeter -n -t "Lojinha Web Testes.jmx" -l resultados-web.jtl
```

Para criar ou visualizar o plano de teste graficamente, utilize o Apache JMeter.

## IntelliJ IDEA

O IntelliJ IDEA não é necessário para este projeto. A execução do plano de teste é realizada pelo Apache JMeter, em modo gráfico ou por linha de comando.

## Relatórios

Gerar relatório HTML:

```bash
jmeter -g resultados-web.jtl -o report-web
```

O relatório será criado em `report-web/`.

## Documentação

- [Apache JMeter](https://jmeter.apache.org/usermanual/)
- [JMeter Downloads](https://jmeter.apache.org/download_jmeter.cgi)
