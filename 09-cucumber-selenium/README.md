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
