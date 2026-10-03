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
- IntelliJ IDEA
- Visual Studio Code

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

## Executar pelo IntelliJ IDEA

1. Abra a pasta `04-selenium-web` no IntelliJ IDEA.
2. Aguarde o Maven carregar as dependências.
3. Acesse `src/test/java/modulos/produtos/`.
4. Abra `ProdutosTest.java`.
5. Clique no ícone verde ▶ ao lado da classe para executar todos os testes.
6. Para executar um cenário específico, utilize o ▶ ao lado do método `@Test`.
7. Acompanhe a execução e os resultados no painel **Run**.

O IntelliJ IDEA permite executar testes JUnit diretamente pelo editor. citeturn0search0turn0search1

## Executar pelo Visual Studio Code

1. Abra a pasta `04-selenium-web` no Visual Studio Code.
2. Instale o **Extension Pack for Java**, caso ainda não esteja instalado.
3. Aguarde o carregamento do projeto Maven.
4. Abra `ProdutosTest.java`.
5. Utilize **Run Test** acima da classe ou do método de teste.
6. Consulte o resultado no painel **Testing**.

O Java Test Runner do VS Code oferece suporte a JUnit 5 e permite executar e depurar os testes. citeturn0search3

Também é possível executar pelo terminal integrado:

```bash
mvn test
```

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

## Observações

O `pom.xml` original declara a API do JUnit Jupiter, mas não configura explicitamente um engine JUnit 5. A configuração original foi preservada.
