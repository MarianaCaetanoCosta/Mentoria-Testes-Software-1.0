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
- IntelliJ IDEA
- Visual Studio Code

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

## Executar pelo IntelliJ IDEA

1. Abra a pasta `05-appium-mobile` no IntelliJ IDEA.
2. Aguarde o Maven carregar as dependências.
3. Confirme que o dispositivo ou emulador Android está disponível.
4. Inicie o Appium Server.
5. Acesse `src/test/java/modulos/produto/`.
6. Abra `ProdutoTest.java`.
7. Clique no ícone verde ▶ ao lado da classe ou de um método `@Test`.
8. Acompanhe a execução no painel **Run**.

O IntelliJ IDEA permite executar testes JUnit diretamente pela classe ou por métodos individuais. citeturn0search0turn0search1

## Executar pelo Visual Studio Code

1. Abra a pasta `05-appium-mobile` no Visual Studio Code.
2. Instale o **Extension Pack for Java**, caso ainda não esteja instalado.
3. Aguarde o carregamento do projeto Maven.
4. Confirme que o dispositivo/emulador Android e o Appium Server estão ativos.
5. Abra `ProdutoTest.java`.
6. Utilize **Run Test** acima da classe ou do método de teste.
7. Consulte o resultado no painel **Testing**.

O VS Code possui suporte a JUnit 5 pelo Java Test Runner. citeturn0search3

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

- [Appium](https://appium.io/docs/en/latest/)
- [Appium Java Client](https://github.com/appium/java-client)
- [Android Studio](https://developer.android.com/studio)
- [Android SDK](https://developer.android.com/tools)
- [JUnit 5](https://docs.junit.org/5.11.0/)
- [Maven](https://maven.apache.org/guides/)

## Observações

O `pom.xml` original declara a API do JUnit Jupiter, mas não configura explicitamente um engine JUnit 5. A configuração original foi preservada.
