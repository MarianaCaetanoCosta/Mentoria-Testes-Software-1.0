# 🛒 Lojinha API — Testes Automatizados com JMeter

Projeto de **automação de testes de API** da aplicação Lojinha, desenvolvido utilizando o **Apache JMeter** e o **Swagger** como apoio para identificação e validação dos endpoints.

O projeto tem como objetivo demonstrar a criação, parametrização e execução de testes de API, utilizando requisições HTTP, autenticação por token, dados parametrizados, cabeçalhos HTTP, extração de dados JSON e validação das respostas da API.

---

## 🎯 Objetivo

Automatizar e validar o fluxo de autenticação e cadastro de produtos através da API, verificando a comunicação entre as requisições e o correto gerenciamento do token de acesso.

---

## 🧪 Cenários automatizados

O plano de testes contempla:

1. 🔐 Login na API;
2. 🎫 Captura do token de autenticação;
3. 📦 Cadastro de produto;
4. 🔗 Utilização do token na requisição autenticada;
5. 📋 Validação das respostas da API.

---

# ▶️ Como executar

### 1. Instalar o Apache JMeter

Instale o [Apache JMeter](https://jmeter.apache.org/download_jmeter.cgi) na versão utilizada no projeto.

### 2. Instalar o JMeter Plugins Manager

Instale o **JMeter Plugins Manager** e habilite os plugins necessários para os gráficos utilizados no projeto.

### 3. Clonar o projeto

```bash
git clone <URL_DO_REPOSITORIO>
```

### 4. Abrir o plano de teste

Abra o arquivo:

```text
Lojinha Web Testes.jmx
```

no Apache JMeter.

### 5. Conferir o arquivo de dados

Verifique se o caminho configurado no **CSV Data Set Config** corresponde ao arquivo:

```text
dados-teste-api.csv
```

### 6. Executar

Execute o plano de testes e acompanhe os resultados através dos relatórios configurados.

---

## 👩‍💻 Sobre o projeto

Projeto desenvolvido como parte do meu portfólio de **Qualidade de Software e Automação de Testes**, com foco na aplicação prática do Apache JMeter para criação e execução de testes de desempenho.

Projeto desenvolvido para demonstrar conhecimentos práticos em **automação de testes de APIs REST utilizando Apache JMeter**, incluindo autenticação, captura e reutilização de tokens, parametrização de dados e análise das respostas das requisições.

---

⭐ **Projeto desenvolvido para estudos e demonstração de conhecimentos em testes de desempenho e automação com Apache JMeter.**

