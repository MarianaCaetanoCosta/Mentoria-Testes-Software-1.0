# 09 - Cucumber Selenium

## Objetivo

Projeto de automação Web com Selenium e Cucumber, utilizando BDD/Gherkin para validar o fluxo de login da aplicação Lojinha.

## Stack utilizada

- Java 22
- Maven
- Selenium Java 4.24.0
- Cucumber JVM 7.18.1
- Cucumber JUnit 7.18.1
- Gherkin
- Page Object
- JUnit
- IntelliJ IDEA
- Visual Studio Code

## Estrutura do projeto

```text
09-cucumber-selenium/
├── README.md
├── pom.xml
├── .gitignore
└── src/
    ├── main/java/org/mcc/com/br/Main.java
    └── test/
        ├── java/
        │   ├── core/Driver.java
        │   ├── maps/LoginMaps.java
        │   ├── pages/LoginPage.java
        │   ├── runner/RunnerTest.java
        │   └── steps/LoginSteps.java
        └── resources/features/login.feature
```

## Cenários automatizados

- Login na aplicação Lojinha
- Cenário escrito em Gherkin
- Steps implementados com Cucumber
- Controle do navegador com Selenium
- Organização utilizando Page Object

## Como executar

Pré-requisitos:

- JDK 22
- Maven
- Navegador compatível
- Lojinha Web disponível para teste

Executar os testes:

```bash
mvn test
```

Executar o ciclo completo, incluindo a geração configurada do relatório:

```bash
mvn verify
```

## Executar pelo IntelliJ IDEA

1. Abra a pasta `09-cucumber-selenium` no IntelliJ IDEA.
2. Aguarde o Maven carregar as dependências.
3. Acesse `src/test/java/runner/`.
4. Abra `RunnerTest.java`.
5. Clique no ícone verde ▶ ao lado da classe para executar o cenário.
6. Acompanhe a execução do navegador e os resultados no painel **Run**.

O IntelliJ IDEA permite executar testes diretamente pelo editor e acompanhar os resultados no painel de execução. citeturn0search0

Também é possível executar pelo terminal integrado do IntelliJ:

```bash
mvn test
```

## Executar pelo Visual Studio Code

1. Abra a pasta `09-cucumber-selenium` no Visual Studio Code.
2. Instale o **Extension Pack for Java**, caso ainda não esteja instalado.
3. Aguarde o carregamento do projeto Maven.
4. Abra `RunnerTest.java`.
5. Execute o teste pelo comando **Run Test**, quando disponibilizado pela extensão.
6. Como alternativa, utilize o terminal integrado:

```bash
mvn test
```

7. Para gerar o relatório configurado:

```bash
mvn verify
```

O VS Code possui suporte a testes Java com JUnit e integração com o Testing Explorer. citeturn0search3

## Relatórios

O plugin configurado no `pom.xml` gera os relatórios em:

```text
target/reports/cucumber-html-reports/
```

O arquivo JSON utilizado pelo relatório fica em:

```text
target/reports/CucumberReports.json
```

Os artefatos `target/` existentes no repositório original não foram migrados porque são resultados gerados; eles podem ser recriados com `mvn verify`.

## Documentação

- [Selenium](https://www.selenium.dev/documentation/)
- [Cucumber](https://cucumber.io/docs/)
- [Gherkin](https://cucumber.io/docs/gherkin/)
- [Maven](https://maven.apache.org/guides/)

