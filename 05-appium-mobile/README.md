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
- Appium Server
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

### Downloads

Utilize preferencialmente as páginas oficiais para instalar as ferramentas:

| Ferramenta | Finalidade | Download / documentação |
|---|---|---|
| **Android Studio** | IDE, Android SDK e criação do emulador AVD | [Download Android Studio](https://developer.android.com/studio) |
| **Node.js** | Necessário para instalar o Appium Server via npm | [Download Node.js](https://nodejs.org/en/download) |
| **Appium Server** | Servidor que recebe e executa os comandos de automação | [Appium Documentation](https://appium.io/docs/en/latest/) |
| **Appium Inspector** | Inspeção dos elementos da aplicação mobile | [Appium Inspector](https://github.com/appium/appium-inspector/releases) |
| **Appium UiAutomator2 Driver** | Driver utilizado para automação Android | [UiAutomator2 Driver](https://github.com/appium/appium-uiautomator2-driver) |

> **Importante:** o Appium Server atualmente é instalado pelo **npm**, e não por um instalador separado. Após instalar o Node.js, utilize:
>
> ```bash
> npm install -g appium
> ```
>
> O Appium é instalado pelo npm e, depois, é necessário instalar o driver da plataforma Android.

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

### 4. Instalar o Appium Server

Depois que o Android Studio, SDK e emulador estiverem funcionando:

1. Instale o **Node.js**.
2. Abra o terminal.
3. Execute:
   
```bash
npm install -g appium
```

4. Instale o driver Android utilizado pelo Appium:

```bash
appium driver install uiautomator2
```

5. Verifique os drivers instalados:

```bash
appium driver list --installed
```

6. Inicie o Appium Server:

```bash
appium
```

O servidor será iniciado na porta padrão **4723**.

### 5. Instalar o Appium Inspector

Baixe e instale o **Appium Inspector** pela página oficial de releases.

O Inspector será utilizado posteriormente para identificar os elementos da aplicação Lojinha e auxiliar na criação/manutenção dos testes.

## Como executar

> **Importante:** o **Android Studio não é utilizado para executar os testes Java deste projeto**. Ele é utilizado para instalar/configurar o Android SDK, criar e iniciar o emulador Android (AVD) e disponibilizar o dispositivo para o Appium. Os testes automatizados são executados pelo **IntelliJ IDEA**, **Visual Studio Code** ou Maven.

### Ordem recomendada para executar os testes

1. Inicie o emulador Android pelo **Android Studio > Device Manager**.
2. Confirme que o aplicativo Lojinha está instalado no emulador.
3. Inicie o **Appium Server** com o comando `appium`.
4. Abra este projeto no **IntelliJ IDEA** ou **Visual Studio Code**.
5. Execute o `ProdutoTest.java` pela IDE ou utilize `mvn test` no terminal.

### Pré-requisitos


- JDK 22
- Maven
- Android Studio
- Android SDK
- Node.js e npm
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

## Execução dos testes

Os testes são executados com **JUnit 5** e utilizam o **Appium Server** para controlar o emulador Android.

A classe `ProdutoTest` utiliza `@TestMethodOrder` e `@Order` para manter a sequência necessária dos cenários, pois alguns testes dependem do estado dos dados criado pelos cenários anteriores.

A execução pode ser feita pela IDE ou pelo Maven:

```bash
mvn clean test
```

O projeto não utiliza Allure ou relatórios adicionais. O foco deste módulo é a automação funcional mobile com Appium, JUnit 5 e Page Object Model.

## Documentação

- [Appium](https://appium.io/docs/en/latest/)
- [Appium Java Client](https://github.com/appium/java-client)
- [Appium Inspector](https://github.com/appium/appium-inspector)
- [UiAutomator2 Driver](https://github.com/appium/appium-uiautomator2-driver)
- [Android Studio](https://developer.android.com/studio)
- [Android SDK](https://developer.android.com/tools)
- [Node.js](https://nodejs.org/en/download)
- [JUnit 5](https://docs.junit.org/5.11.0/)
- [Maven](https://maven.apache.org/guides/)

## Observações

O `pom.xml` utiliza o Selenium BOM 4.27.0 para manter a compatibilidade com o Appium Java Client 9.2.3.

Os testes foram configurados para execução no emulador Android utilizado no projeto, com automação via UiAutomator2.