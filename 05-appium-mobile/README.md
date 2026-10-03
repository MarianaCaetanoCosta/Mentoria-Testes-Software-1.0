# 05 - Appium Mobile

## Objetivo

Projeto de automação de testes mobile da aplicação Lojinha, utilizando Java, JUnit e Appium, com foco em login, cadastro de produto e validação de regras de negócio.

## Stack utilizada

- Java 22
- Maven
- JUnit Jupiter API 5.11.0-M2
- Appium Java Client 9.2.3
- Android Studio
- Android SDK
- Appium Inspector
- Page Object Model

## Estrutura do projeto

```text
05-appium-mobile/
├── README.md
├── pom.xml
├── .gitignore
└── src/test/java/
    ├── modulos/produto/
    │   └── ProdutoTest.java
    └── telas/
        ├── BaseTela.java
        ├── FormularioAdicaoProdutoTela.java
        ├── FormularioAdicionarComponenteTela.java
        ├── FormularioEditarProdutoTela.java
        ├── ListagemDeProdutosTela.java
        └── LoginTela.java
```

## Cenários automatizados

- Login
- Cadastro de produto
- Validação de valor do produto
- Navegação entre telas

## Como executar

Pré-requisitos:

- JDK 22
- Maven
- Android Studio e Android SDK
- Dispositivo ou emulador Android configurado
- Appium Server
- Appium Inspector para inspeção dos elementos

Na raiz do projeto:

```bash
mvn clean test
```

Também é possível executar `ProdutoTest` diretamente pelo IntelliJ IDEA.

Observação: o `pom.xml` original declara a API do JUnit Jupiter, mas não configura explicitamente um engine JUnit 5. A configuração original foi preservada.

## Relatórios

Quando gerados pelo Maven Surefire:

```text
target/surefire-reports/
```

## Documentação

- [Appium](https://appium.io/docs/en/latest/)
- [Appium Java Client](https://github.com/appium/java-client)
- [Android Studio](https://developer.android.com/studio)
- [Android SDK](https://developer.android.com/tools)
- [JUnit 5](https://docs.junit.org/5.11.0/)
- [Maven](https://maven.apache.org/guides/)
