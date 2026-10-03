# 02 - Lojinha API Automação

## Objetivo

Projeto de automação de testes de API REST da Lojinha, desenvolvido com Java, JUnit e RestAssured.

Os testes validam regras de negócio do módulo de produtos, utilizando autenticação, classes POJO e Data Factory para preparação dos dados.

## Stack utilizada

- Java 22
- Maven
- JUnit Jupiter API 5.11.0-M2
- RestAssured 5.5.0
- Jackson Databind 2.17.2
- API REST / JSON
- IntelliJ IDEA

## Estrutura do projeto

~~~text
02-restassured-api/
├── README.md
├── pom.xml
├── .gitignore
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/example/
│   │           └── Main.java
│   └── test/
│       └── java/
│           ├── dataFactory/
│           │   ├── ProdutoDataFactory.java
│           │   └── UsuarioDataFactory.java
│           ├── modulos/
│           │   └── produto/
│           │       └── ProdutoTest.java
│           └── pojo/
│               ├── ComponentePojo.java
│               ├── ProdutoPojo.java
│               └── UsuarioPojo.java
~~~

## Testes automatizados

Os testes do módulo de Produto validam partições de equivalência relacionadas ao valor do produto.

Cenários implementados:

- valor igual a R$ 0,00 deve ser rejeitado;
- valor igual a R$ 7.000,01 deve ser rejeitado;
- validação da mensagem de erro;
- validação do status HTTP 422;
- autenticação prévia para obtenção do token utilizado nos testes.

A preparação dos dados utiliza ProdutoDataFactory e UsuarioDataFactory, enquanto os objetos enviados à API são representados por POJOs.

## Como executar

Pré-requisitos:

- JDK 22 instalado e configurado no PATH;
- Maven instalado e configurado no PATH;
- acesso à API utilizada pelos testes.

Na raiz deste projeto:

~~~bash
mvn clean test
~~~

Para executar apenas os testes:

~~~bash
mvn test
~~~

## Relatórios

Após a execução dos testes com Maven, os relatórios do Surefire ficam, quando gerados, em:

~~~text
target/surefire-reports/
~~~

Os arquivos TXT e XML do Surefire podem ser consultados nessa pasta.

Observação: o pom.xml original declara a API do JUnit Jupiter, mas não configura explicitamente o mecanismo de execução do JUnit 5 nem uma versão do Maven Surefire compatível com JUnit 5. O projeto foi mantido conforme o original, sem alterar essa configuração.

## Documentação

- Java 22: https://docs.oracle.com/en/java/javase/22/
- Maven: https://maven.apache.org/guides/
- JUnit 5: https://docs.junit.org/5.11.0/
- RestAssured: https://rest-assured.io/
- Jackson Databind: https://github.com/FasterXML/jackson-databind
- IntelliJ IDEA: https://www.jetbrains.com/idea/

## Observações

O conteúdo funcional foi preservado durante a consolidação. O objetivo é organizar os projetos da Mentoria 1.0 em um único repositório de portfólio, sem alterar o repositório original.
