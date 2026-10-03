# 04 - Selenium Web

## Objetivo

Projeto de automação de testes Web da aplicação Lojinha, utilizando Java, JUnit e Selenium WebDriver. Os cenários aplicam Partições de Equivalência, Valores Limite, Page Object Model e Fluent Page Object Model.

## Stack utilizada

- Java 22
- Maven
- JUnit Jupiter API 5.11.0-M2
- Selenium Java 4.23.0
- Selenium WebDriver
- Page Object Model
- Fluent Page Object Model

## Estrutura do projeto

```text
04-selenium-web/
├── README.md
├── pom.xml
├── .gitignore
└── src/
    ├── main/java/org/example/Main.java
    └── test/java/
        ├── modulos/produtos/ProdutosTest.java
        └── paginas/
            ├── BasePage.java
            ├── FormularioDeAdicaoDeProdutoPage.java
            ├── FormularioDeEdicaoDeProdutoPage.java
            ├── ListaDeProdutosPage.java
            └── LoginPage.java
```

## Cenários automatizados

- Login
- Cadastro de produto
- Cadastro de componente
- Listagem de produtos
- Edição de produto
- Fluxos de saída e navegação

## Como executar

Pré-requisitos:

- JDK 22
- Maven
- Lojinha Web disponível para teste
- Navegador compatível com o ambiente

Na raiz do projeto:

```bash
mvn clean test
```

Também é possível executar `ProdutosTest` diretamente pelo IntelliJ IDEA.

Observação: o `pom.xml` original declara a API do JUnit Jupiter, mas não configura explicitamente um engine JUnit 5. A configuração original foi preservada.

## Relatórios

Quando gerados pelo Maven Surefire:

```text
target/surefire-reports/
```

## Documentação

- [Selenium](https://www.selenium.dev/documentation/)
- [JUnit 5](https://docs.junit.org/5.11.0/)
- [Maven](https://maven.apache.org/guides/)
- [Java](https://docs.oracle.com/en/java/javase/22/)
