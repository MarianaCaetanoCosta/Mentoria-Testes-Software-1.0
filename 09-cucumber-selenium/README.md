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
- Cenário descrito em Gherkin
- Cenário parametrizado com diferentes dados de usuário
- Implementação dos steps com Cucumber
- Controle do navegador com Selenium
- Organização utilizando Page Object
- Geração de relatório de execução

## Preparação do ambiente

### Java

Verifique se o JDK 22 está instalado:

```bash
java -version
```

### Maven

Verifique se o Maven está disponível:

```bash
mvn -version
```

### Aplicação

A aplicação Lojinha Web deve estar disponível para que os testes de login possam ser executados.

## Como executar

Acesse o diretório do projeto:

```bash
cd 09-cucumber-selenium
```

Execute os testes:

```bash
mvn test
```

Para executar o ciclo completo e gerar o relatório configurado:

```bash
mvn verify
```

A execução pode ser realizada pelo terminal ou por qualquer ambiente de desenvolvimento compatível com projetos Java/Maven. Não há dependência de uma IDE específica.

## Execução pelas IDEs

### IntelliJ IDEA

O projeto pode ser executado diretamente pelo IntelliJ IDEA, utilizando o suporte a testes Java/Cucumber e o runner `RunnerTest.java`. O IntelliJ IDEA oferece suporte à execução de testes e ao Cucumber mediante o plugin correspondente. citeturn0search4turn0search8

Também é possível executar pelo terminal integrado:

```bash
mvn test
```

### Visual Studio Code

O projeto também pode ser executado no Visual Studio Code. O suporte a testes Java permite executar e depurar testes JUnit 4, utilizado pelo `RunnerTest.java`, por meio do Extension Pack for Java. citeturn0search5

Como alternativa, utilize o terminal integrado:

```bash
mvn test
```

## Relatórios

O projeto utiliza o plugin `maven-cucumber-reporting` para gerar o relatório durante a fase `verify`.

O relatório utiliza o arquivo JSON gerado pelo Cucumber:

```text
target/reports/CucumberReports.json
```

Os relatórios gerados ficam em:

```text
target/reports/
```

Os artefatos `target/` existentes no repositório original não foram migrados, pois são resultados gerados durante a execução. Eles podem ser recriados localmente com:

```bash
mvn verify
```

## Documentação

- [Selenium](https://www.selenium.dev/documentation/)
- [Cucumber](https://cucumber.io/docs/)
- [Gherkin](https://cucumber.io/docs/gherkin/)
- [Maven](https://maven.apache.org/guides/)

## Observações

- A versão do Java utilizada pelo projeto é a 22.
- As versões das dependências estão definidas no `pom.xml`.
- A aplicação Lojinha Web precisa estar disponível para a execução dos testes.
- O projeto utiliza Cucumber com JUnit e Selenium para automação Web.
