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

## Preparação do ambiente Android

Para executar a automação mobile, a primeira etapa é instalar o **Android Studio**.

Neste projeto, não é necessário instalar BlueStacks ou outro emulador inicialmente. O ambiente será configurado utilizando o **Android Studio Emulator (AVD)**, integrado ao Android SDK.

### 1. Instalar o Android Studio

Instale o Android Studio e conclua a configuração inicial.

Durante a configuração, mantenha os componentes recomendados pelo instalador, incluindo o **Android SDK**.

### 2. Configurar o Android SDK

No Android Studio:

1. Abra **SDK Manager**.
2. Confirme que o **Android SDK** está instalado.
3. Instale uma versão do Android compatível com a aplicação Lojinha.
4. Confirme também a instalação das ferramentas necessárias do SDK.

### 3. Criar o emulador Android

No Android Studio:

1. Abra o **Device Manager**.
2. Crie um novo dispositivo virtual (**AVD**).
3. Escolha um modelo de dispositivo Android.
4. Selecione uma imagem do Android instalada pelo SDK.
5. Conclua a criação do dispositivo virtual.
6. Inicie o emulador e confirme que o Android foi carregado corretamente.

> A configuração detalhada da versão do Android será definida durante a preparação do ambiente, de acordo com os requisitos do APK da Lojinha.

### 4. Próximas ferramentas

Depois que o Android Studio, SDK e emulador estiverem funcionando, configure:

- Appium Server;
- Appium Inspector;
- projeto de automação no IntelliJ IDEA ou Visual Studio Code.

A instalação dessas ferramentas não precisa ser feita neste primeiro passo.

## Como executar

Pré-requisitos:

- JDK 22
- Maven
- Android Studio
- Android SDK
- Emulador Android (AVD) ou dispositivo físico configurado
- Appium Server
- Appium Inspector para inspeção dos elementos

Na raiz do projeto:

```bash
mvn clean test
```

## Executar pelo IntelliJ IDEA

1. Abra a pasta `05-appium-mobile` no IntelliJ IDEA.
2. Aguarde o Maven carregar as dependências.
3. Confirme que o emulador ou dispositivo Android está disponível.
4. Inicie o Appium Server.
5. Acesse `src/test/java/modulos/produto/`.
6. Abra `ProdutoTest.java`.
7. Clique no ícone verde ▶ ao lado da classe ou de um método `@Test`.
8. Acompanhe a execução no painel **Run**.

## Executar pelo Visual Studio Code

1. Abra a pasta `05-appium-mobile` no Visual Studio Code.
2. Instale o **Extension Pack for Java**, caso ainda não esteja instalado.
3. Aguarde o carregamento do projeto Maven.
4. Confirme que o emulador/dispositivo Android e o Appium Server estão ativos.
5. Abra `ProdutoTest.java`.
6. Utilize **Run Test** acima da classe ou do método de teste.
7. Consulte o resultado no painel **Testing**.

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

O ambiente de execução mobile será preparado inicialmente com o Android Studio Emulator (AVD). Caso seja necessário reproduzir o ambiente original da mentoria, a configuração utilizada anteriormente poderá ser documentada posteriormente.
