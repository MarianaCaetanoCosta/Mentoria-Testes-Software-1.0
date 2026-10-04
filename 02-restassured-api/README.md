# 02 - Lojinha API Automação

## Objetivo

Projeto de automação de testes de API REST da Lojinha, desenvolvido com Java, JUnit e RestAssured.

Os testes validam regras de negócio do módulo de produtos, utilizando autenticação, classes POJO e Data Factory para preparação dos dados.

## Stack utilizada

- Java 22
- Maven
- JUnit Jupiter 5.11.0-M2
- Maven Surefire 3.2.5
- RestAssured 5.5.0
- Jackson Databind 2.17.2
- API REST / JSON
- IntelliJ IDEA
- Visual Studio Code

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

## Executar pelo IntelliJ IDEA

1. Abra a pasta `02-restassured-api` no IntelliJ IDEA.
2. Aguarde o Maven carregar as dependências do `pom.xml`.
3. Acesse `src/test/java/modulos/produto/`.
4. Abra a classe `ProdutoTest.java`.
5. Clique no ícone verde ▶ ao lado da classe para executar todos os testes.
6. Para executar apenas um cenário, clique no ▶ ao lado do respectivo método `@Test`.
7. Consulte o resultado no painel **Run**.

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

## Relatórios

Os testes são executados pelo **JUnit 5** utilizando o **Maven Surefire Plugin**.

Após a execução com Maven, os relatórios ficam em:

~~~text
target/surefire-reports/
~~~

Nessa pasta são gerados arquivos `.txt` e `.xml` com os resultados da execução dos testes.

O relatório é gerado automaticamente quando os testes são executados pelo Maven, por exemplo:

~~~bash
mvn clean test
~~~

## Documentação

- [Java 22 Documentation](https://docs.oracle.com/en/java/javase/22/)
- [Maven Documentation](https://maven.apache.org/guides/)
- [JUnit 5 Documentation](https://docs.junit.org/5.11.0/)
- [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/)
- [RestAssured](https://rest-assured.io/)
- [Jackson Databind](https://github.com/FasterXML/jackson-databind)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Visual Studio Code](https://code.visualstudio.com/)

## Observações

O conteúdo funcional dos testes foi preservado durante a consolidação. A configuração adicionada ao `pom.xml` serve para permitir a execução dos testes JUnit 5 pelo Maven e a geração dos relatórios do Surefire. O repositório original da Mentoria 1.0 não foi alterado.
