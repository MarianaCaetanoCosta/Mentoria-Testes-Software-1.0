# 06 - JMeter API

## Objetivo

Projeto de testes de desempenho de API REST da aplicação Lojinha, utilizando Apache JMeter. O plano de testes simula múltiplos usuários realizando autenticação e cadastro de produtos, com parametrização de dados e reutilização de token.

## Stack utilizada

- Apache JMeter 5.6.3
- HTTP / REST
- JSON
- CSV Data Set Config
- JSON Extractor
- Autenticação por token
- HTTP Client 4
- Swagger

## Estrutura do projeto

```text
06-jmeter-api/
├── README.md
├── Lojinha API Testes.jmx
└── dados-teste-api.csv
```

## Cenários automatizados

- Login na API
- Captura do token retornado pelo login
- Reutilização do token em requisições autenticadas
- Cadastro de produtos
- Parametrização de dados através de arquivo CSV
- Execução com múltiplos usuários simultâneos
- Simulação de carga com ramp-up
- Validação das respostas da API
- Coleta de métricas de tempo de resposta e transações por segundo

## Configuração do ambiente

### 1. Instalar o Java

O JMeter precisa do Java instalado.

No PowerShell, valide a instalação:

```powershell
java -version
```

Se o comando retornar a versão do Java, o ambiente está pronto para essa etapa.

### 2. Instalar o Apache JMeter

Baixe e extraia o Apache JMeter no Windows.

Depois, localize a pasta `bin`, por exemplo:

```text
C:\apache-jmeter-5.6.3\bin
```

Você pode executar o JMeter diretamente pelo arquivo:

```text
jmeter.bat
```

Ou adicionar a pasta `bin` do JMeter ao PATH do Windows para permitir a execução do comando `jmeter` em qualquer terminal.

Valide:

```powershell
jmeter --version
```

### 3. Baixar o projeto

Clone o repositório:

```powershell
git clone https://github.com/MarianaCaetanoCosta/QA-Automacao-de-Testes-E-commerce.git
```

Entre na pasta do projeto:

```powershell
cd QA-Automacao-de-Testes-E-commerce\06-jmeter-api
```

## Como executar no computador

### Opção 1 — Interface gráfica do JMeter

1. Abra o Apache JMeter.
2. Selecione **File > Open**.
3. Abra o arquivo:
   `Lojinha API Testes.jmx`.
4. Confirme que o arquivo `dados-teste-api.csv` está na mesma pasta do plano de teste.
5. No plano de teste, verifique o elemento **Configuração dos dados CSV**.
6. Confirme que o arquivo está configurado como:
   `dados-teste-api.csv`.
7. Clique em **Run > Start**.
8. Acompanhe a execução pelos listeners configurados no plano.

### Opção 2 — Executar pelo PowerShell

Abra o PowerShell dentro da pasta `06-jmeter-api`:

```powershell
cd C:\Workspace\QA-Automacao-de-Testes-E-commerce\06-jmeter-api
```

Execute:

```powershell
jmeter -n -t ".\Lojinha API Testes.jmx" -l ".\resultados-api.jtl"
```

> Caso o comando `jmeter` não esteja disponível no PATH, execute o `jmeter.bat` utilizando o caminho completo da instalação.

Exemplo:

```powershell
& "C:\apache-jmeter-5.6.3\bin\jmeter.bat" -n -t ".\Lojinha API Testes.jmx" -l ".\resultados-api.jtl"
```

## Configuração do teste

O plano de teste está configurado com:

- **50 usuários virtuais**
- **Ramp-up de 3 segundos**
- **1 iteração por usuário**
- Timer aleatório entre as requisições
- Dados parametrizados pelo arquivo CSV
- Autenticação realizada antes do cadastro do produto

O arquivo CSV contém os dados utilizados pelo teste e deve permanecer na mesma pasta do arquivo `.jmx`, salvo se o caminho do **CSV Data Set Config** for alterado.

## Relatórios

Após a execução em modo não-GUI, o arquivo `resultados-api.jtl` contém os resultados da execução.

Para gerar o relatório HTML:

```powershell
jmeter -g ".\resultados-api.jtl" -o ".\report-api"
```

Depois, abra:

```text
report-api\index.html
```

O relatório apresenta métricas como:

- Tempo de resposta
- Latência
- Taxa de sucesso
- Quantidade de requisições
- Throughput
- Transações por segundo
- Número de usuários/threads
- Dados enviados e recebidos

## Visualizações configuradas no JMeter

O plano também possui visualizações para análise de desempenho:

- Aggregate Report
- Summary Report
- Active Threads Over Time
- Response Times Over Time
- Transactions per Second

## Execução pelo Visual Studio Code

O VS Code não executa arquivos `.jmx` nativamente.

Ele pode ser utilizado para editar o README, o CSV e outros arquivos do projeto, enquanto a execução do JMeter é realizada pelo terminal integrado:

```powershell
jmeter -n -t ".\Lojinha API Testes.jmx" -l ".\resultados-api.jtl"
```

## IntelliJ IDEA

O IntelliJ IDEA não é necessário para este projeto.

A ferramenta principal para execução e análise dos testes é o Apache JMeter.

## Documentação

- [Apache JMeter](https://jmeter.apache.org/usermanual/)
- [JMeter Downloads](https://jmeter.apache.org/download_jmeter.cgi)
- [Swagger](https://swagger.io/docs/)

## Observações

- O projeto foi criado utilizando JMeter 5.6.3.
- O arquivo `dados-teste-api.csv` deve estar disponível no caminho configurado no **CSV Data Set Config**.
- Os resultados `.jtl` e os relatórios HTML são arquivos gerados durante a execução e não fazem parte da estrutura original do projeto.
- Para testes de carga, prefira a execução em modo **non-GUI**, utilizando a linha de comando.
- O endereço da API configurado no plano de teste pode depender da disponibilidade do ambiente utilizado pelo projeto.
