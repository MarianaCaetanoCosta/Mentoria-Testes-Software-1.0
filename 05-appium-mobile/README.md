# 05 - Appium Mobile

## Objetivo

Projeto de automação de testes Mobile da aplicação Lojinha, utilizando Java, JUnit 5 e Appium. Os cenários aplicam Page Object Model, validação de regras de negócio, interação com elementos Android e execução em emulador.

## Stack utilizada

- Java 22
- Maven
- JUnit Jupiter API 5.11.0-M2
- Appium Java Client 9.2.3
- Selenium 4.27.0
- Appium Server
- UiAutomator2
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
- Validação de valor de produto
- Cadastro de produto
- Edição de produto
- Cadastro de componente
- Exclusão de componente
- Exclusão de produto
- Navegação entre telas
- Validação de mensagens apresentadas pela aplicação

## Preparação do ambiente

### Android Studio

O Android Studio é utilizado para configurar o Android SDK, criar e iniciar o emulador que será controlado pelo Appium.

1. Instale o **Android Studio**.
2. Configure o **Android SDK**.
3. Abra o **Device Manager**.
4. Crie um dispositivo virtual (**AVD**).
5. Inicie o emulador.

Para identificar o dispositivo conectado, execute:

```bash
adb devices
```

Exemplo:

```text
List of devices attached
emulator-5554    device
```

Neste projeto, o ID do emulador é utilizado na capability:

```java
capacidades.setCapability("appium:udid", "emulator-5554");
capacidades.setCapability("appium:deviceName", "Small Phone");
```

> Os valores podem ser diferentes em cada ambiente. Utilize o ID e o nome correspondentes ao seu emulador.

### APK da aplicação

Com o emulador iniciado, instale o APK da aplicação Lojinha.

O APK pode ser instalado arrastando o arquivo para a janela do emulador.

O caminho do APK deve ser configurado no `ProdutoTest.java`:

```java
capacidades.setCapability("appium:app", "CAMINHO_DO_APK");
```

### Appium Server

Após instalar o Node.js, instale o Appium pelo terminal:

```bash
npm install -g appium
```

Instale o driver Android:

```bash
appium driver install uiautomator2
```

Inicie o servidor:

```bash
appium
```

O Appium Server será executado na porta padrão:

```text
http://127.0.0.1:4723/
```

## Como executar

### IntelliJ IDEA

1. Abra a pasta `05-appium-mobile` no IntelliJ IDEA.
2. Aguarde o Maven carregar as dependências.
3. Confirme que o emulador Android está iniciado.
4. Inicie o Appium Server pelo terminal:

```bash
appium
```

5. Acesse `src/test/java/modulos/produto/`.
6. Abra `ProdutoTest.java`.
7. Clique no ícone verde ▶ ao lado da classe para executar todos os testes.
8. Para executar um cenário específico, utilize o ▶ ao lado do método `@Test`.
9. Acompanhe a execução no painel **Run**.

### Visual Studio Code

1. Abra a pasta `05-appium-mobile` no Visual Studio Code.
2. Instale o **Extension Pack for Java**, caso ainda não esteja instalado.
3. Confirme que o emulador Android está iniciado.
4. Inicie o Appium Server pelo terminal:

```bash
appium
```

5. Abra `ProdutoTest.java`.
6. Utilize **Run Test** acima da classe ou do método de teste.

Também é possível executar pelo terminal integrado:

```bash
mvn test
```

> **Importante:** mantenha o emulador Android e o Appium Server em execução durante os testes.

## Execução dos testes

Os testes utilizam **JUnit 5**, **Appium Server**, **UiAutomator2** e **Page Object Model**.

A classe `ProdutoTest` utiliza `@TestMethodOrder` e `@Order` para manter a sequência necessária dos cenários.

Para executar todos os testes pelo Maven:

```bash
mvn clean test
```

O projeto não utiliza Allure ou relatórios adicionais. O foco deste módulo é a automação funcional Mobile com Appium.

## Documentação

- [Appium](https://appium.io/docs/en/latest/)
- [Appium Java Client](https://github.com/appium/java-client)
- [Appium Inspector](https://github.com/appium/appium-inspector)
- [UiAutomator2 Driver](https://github.com/appium/appium-uiautomator2-driver)
- [Android Studio](https://developer.android.com/studio)
- [Android SDK](https://developer.android.com/tools)
- [JUnit 5](https://docs.junit.org/5.11.0/)
- [Maven](https://maven.apache.org/guides/)

## Observações

O `pom.xml` utiliza o Selenium BOM 4.27.0 para manter a compatibilidade com o Appium Java Client 9.2.3.

A execução foi configurada para o emulador Android utilizado no projeto, com automação via UiAutomator2.
