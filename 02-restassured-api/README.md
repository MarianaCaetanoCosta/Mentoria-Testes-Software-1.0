# 02 - Lojinha API Automação

## Objetivo

Projeto de automação de testes de API REST da Lojinha, desenvolvido com Java, JUnit 5 e RestAssured.

Os testes validam regras de negócio do módulo de produtos, utilizando autenticação, classes POJO e Data Factory para preparação dos dados.

## Stack utilizada

- Java 22
- Maven
- JUnit Jupiter 5.14.4
- Maven Surefire 3.2.5
- RestAssured 5.5.0
- Jackson Databind 2.21.7
- Allure Report
- AspectJ 1.9.25
- API REST / JSON
- IntelliJ IDEA
- Visual Studio Code

## Estrutura do projeto

A estrutura abaixo representa os principais arquivos do projeto e os relatórios gerados após a execução dos testes. O diretório `target/` é gerado pelo Maven e não é versionado no GitHub.

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
└── target/
    ├── allure-results/
    ├── surefire-reports/
    └── site/
        ├── surefire-report.html
        └── allure-maven-plugin/
            └── index.html
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

## Executar pelo IntelliJ IDEA

1. Abra a pasta `02-restassured-api` no IntelliJ IDEA.
2. Aguarde o Maven carregar as dependências do `pom.xml`.
3. Acesse `src/test/java/modulos/produto/`.
4. Abra a classe `ProdutoTest.java`.
5. Clique no ícone verde ▶ ao lado da classe para executar todos os testes.
6. Para executar apenas um cenário, clique no ▶ ao lado do respectivo método `@Test`.
7. Consulte o resultado no painel **Run**.

Para gerar o relatório Allure pelo Maven, consulte a seção **Relatórios**.

## Executar pelo Visual Studio Code

1. Abra a pasta `02-restassured-api` no Visual Studio Code.
2. Instale o **Extension Pack for Java**, caso ainda não esteja instalado.
3. Aguarde o carregamento do projeto Maven.
4. Abra `ProdutoTest.java`.
5. Utilize **Run Test** acima da classe ou do método de teste.
6. Consulte o resultado no painel **Testing**.

Também é possível executar pelo terminal integrado:

~~~bash
mvn test
~~~

Para gerar os relatórios, consulte a seção **Relatórios**.

## Relatórios

### Maven Surefire

O projeto utiliza o **Maven Surefire Plugin** para executar os testes JUnit 5 e gerar os resultados da execução.

Após executar os testes, os arquivos do Surefire ficam em:

~~~text
target/surefire-reports/
~~~

Nessa pasta são gerados arquivos `.txt` e `.xml` com os resultados dos testes.

Para visualizar o relatório em HTML, execute:

~~~bash
mvn surefire-report:report
~~~

Depois, abra no navegador:

~~~text
target/site/surefire-report.html
~~~

### Allure Report

O projeto utiliza **Allure Report** para apresentar os resultados dos testes de forma visual.

Para executar os testes de Produto e gerar o relatório:

~~~bash
mvn -Dtest=ProdutoTest test allure:report
~~~

O relatório HTML será gerado em:

~~~text
target/site/allure-maven-plugin/index.html
~~~

Para visualizar o relatório, **abra diretamente o arquivo `index.html` no navegador**.

Os arquivos de resultados utilizados pelo Allure ficam em:

~~~text
target/allure-results/
~~~

A configuração utiliza `allure-jupiter` para integração com JUnit 5, `allure-rest-assured` para integração com RestAssured e AspectJ para instrumentação necessária à geração dos resultados.

## Documentação

- [Java 22 Documentation](https://docs.oracle.com/en/java/javase/22/)
- [Maven Documentation](https://maven.apache.org/guides/)
- [JUnit 5 Documentation](https://docs.junit.org/5.14.4/)
- [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/)
- [RestAssured](https://rest-assured.io/)
- [Allure Report](https://allurereport.org/)
- [Jackson Databind](https://github.com/FasterXML/jackson-databind)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Visual Studio Code](https://code.visualstudio.com/)

## Observações

O conteúdo funcional dos testes foi preservado durante a consolidação. A configuração do `pom.xml` foi atualizada para execução com JUnit 5, geração dos resultados do Allure e geração do relatório HTML pelo Maven.
