# 07 - JMeter Web

## Objetivo

Projeto de testes de desempenho da aplicação Lojinha Web, utilizando Apache JMeter. O plano de testes simula múltiplos usuários realizando operações na aplicação Web, com parametrização de dados através de arquivo CSV.

## Stack utilizada

- Apache JMeter 5.6.3
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
- Parametrização de usuários e dados através de arquivo CSV
- Execução com múltiplos usuários simultâneos
- Simulação de carga
- Coleta de métricas de desempenho

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
cd QA-Automacao-de-Testes-E-commerce\07-jmeter-web
```

## Como executar no computador

### Opção 1 — Interface gráfica do JMeter

1. Abra o Apache JMeter.
2. Selecione **File > Open**.
3. Abra o arquivo:
   `Lojinha Web Testes.jmx`.
4. Confirme que o arquivo `dados-teste-web.csv` está na mesma pasta do plano de teste.
5. No plano de teste, verifique o elemento **CSV Data Set Config**.
6. Confirme que o arquivo está configurado como:
   `dados-teste-web.csv`.
7. Clique em **Run > Start**.
8. Acompanhe a execução pelos recursos de análise configurados no plano.

### Opção 2 — Executar pelo PowerShell

Abra o PowerShell dentro da pasta `07-jmeter-web`:

```powershell
cd C:\Workspace\QA-Automacao-de-Testes-E-commerce\07-jmeter-web
```

Execute:

```powershell
jmeter -n -t ".\Lojinha Web Testes.jmx" -l ".\resultados-web.jtl"
```

> Caso o comando `jmeter` não esteja disponível no PATH, execute o `jmeter.bat` utilizando o caminho completo da instalação.

Exemplo:

```powershell
& "C:\apache-jmeter-5.6.3\bin\jmeter.bat" -n -t ".\Lojinha Web Testes.jmx" -l ".\resultados-web.jtl"
```

## Configuração do teste

O plano de teste utiliza:

- Usuários virtuais configurados no plano
- Dados parametrizados pelo arquivo CSV
- Fluxo de navegação da aplicação Web
- Temporização entre requisições
- Operações de login, cadastro, consulta e logoff

O arquivo CSV contém os dados utilizados pelo teste e deve permanecer na mesma pasta do arquivo `.jmx`, salvo se o caminho do **CSV Data Set Config** for alterado.

## Relatórios

Após a execução em modo não-GUI, o arquivo `resultados-web.jtl` contém os resultados da execução.

Para gerar o relatório HTML:

```powershell
jmeter -g ".\resultados-web.jtl" -o ".\report-web"
```

Depois, abra:

```text
report-web\index.html
```

O relatório apresenta métricas de desempenho da execução, como tempo de resposta, taxa de sucesso, quantidade de requisições e throughput.

## Execução pelo Visual Studio Code

O VS Code não executa arquivos `.jmx` nativamente.

Ele pode ser utilizado para editar o README, o CSV e outros arquivos do projeto, enquanto a execução do JMeter é realizada pelo terminal integrado:

```powershell
jmeter -n -t ".\Lojinha Web Testes.jmx" -l ".\resultados-web.jtl"
```

## Documentação

- [Apache JMeter](https://jmeter.apache.org/usermanual/)
- [JMeter Downloads](https://jmeter.apache.org/download_jmeter.cgi)

## Observações

- O projeto utiliza Apache JMeter 5.6.3.
- O arquivo `dados-teste-web.csv` deve estar disponível no caminho configurado no **CSV Data Set Config**.
- Os resultados `.jtl` e os relatórios HTML são arquivos gerados durante a execução e não fazem parte da estrutura original do projeto.
- Para testes de carga, prefira a execução em modo **non-GUI**, utilizando a linha de comando.
