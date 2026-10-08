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

A execução da automação mobile utiliza três ferramentas principais:

- **Android Studio** → instalação do ambiente Android, criação e inicialização do emulador e instalação do APK.
- **IntelliJ IDEA** → inicialização do Appium Server e execução dos testes.
- **Visual Studio Code** → inicialização do Appium Server e execução dos testes.

### 1. Android Studio

O Android Studio é utilizado para preparar o ambiente Android e disponibilizar o dispositivo que será utilizado pelo Appium.

#### 1.1 Instalar o Android Studio

Baixe e instale o Android Studio pela página oficial:

https://developer.android.com/studio

Durante a instalação, mantenha os componentes recomendados, principalmente:

- Android SDK
- Android SDK Platform
- Android SDK Platform-Tools
- Android Emulator

Após a instalação, abra o Android Studio.

#### 1.2 Configurar o Android SDK

No Android Studio:

1. Acesse **More Actions > SDK Manager**.
2. Confirme o local de instalação do **Android SDK**.
3. Na aba **SDK Platforms**, instale uma versão do Android compatível com a aplicação.
4. Na aba **SDK Tools**, confirme a instalação de:
   - Android SDK Build-Tools
   - Android SDK Platform-Tools
   - Android Emulator
5. Clique em **Apply** para instalar os componentes necessários.

#### 1.3 Criar o emulador Android

No Android Studio:

1. Acesse **More Actions > Virtual Device Manager** ou **Device Manager**.
2. Clique em **Create Virtual Device**.
3. Escolha o modelo de dispositivo desejado.
4. Clique em **Next**.
5. Selecione uma imagem do Android instalada no SDK.
6. Caso necessário, faça o download da imagem.
7. Conclua a criação do dispositivo.

Depois da criação, o dispositivo aparecerá na lista do **Device Manager**.

Clique no botão ▶ para iniciar o emulador.

#### 1.4 Identificar o nome e o ID do emulador

Com o emulador iniciado, abra um terminal e execute:

```bash
adb devices
```

O resultado será semelhante a:

```text
List of devices attached
emulator-5554    device
```

Nesse exemplo:

- **ID do dispositivo:** `emulator-5554`
- **Nome exibido no Android Studio:** corresponde ao dispositivo virtual criado, por exemplo, `Small Phone`.

O ID obtido pelo comando `adb devices` deve ser utilizado no projeto na capability:

```java
capacidades.setCapability("appium:udid", "emulator-5554");
```

O nome do dispositivo pode ser utilizado na capability:

```java
capacidades.setCapability("appium:deviceName", "Small Phone");
```

> **Importante:** os valores podem ser diferentes em cada computador. Utilize no projeto os valores correspondentes ao emulador criado no seu ambiente.

#### 1.5 Instalar o APK no emulador

Com o emulador iniciado, instale o APK da aplicação Lojinha.

Uma opção é simplesmente arrastar o arquivo `.apk` para a janela do emulador.

Após a instalação, confirme que o aplicativo **Lojinha** aparece no emulador e pode ser aberto normalmente.

O caminho do APK também precisa estar configurado no `ProdutoTest.java`:

```java
capacidades.setCapability(
        "appium:app",
        "CAMINHO_DO_APK"
);
```

No projeto, substitua o caminho pelo local onde o APK está armazenado no computador.

> **Importante:** o emulador deve permanecer ligado durante toda a execução dos testes.

### 2. IntelliJ IDEA

O IntelliJ IDEA é utilizado para iniciar o Appium Server e executar os testes automatizados.

#### 2.1 Abrir o projeto

1. Abra o **IntelliJ IDEA**.
2. Abra a pasta `05-appium-mobile`.
3. Aguarde o Maven carregar as dependências do projeto.

#### 2.2 Iniciar o Appium Server

Antes de executar os testes:

1. Confirme que o emulador Android está ligado no Android Studio.
2. Abra o **Terminal integrado** do IntelliJ IDEA.
3. Execute:

```bash
appium
```

4. Mantenha o terminal com o Appium Server em execução.

O Appium Server deverá estar disponível na porta padrão:

```text
http://127.0.0.1:4723/
```

#### 2.3 Executar os testes

Com o:

- Android Studio aberto;
- emulador Android iniciado;
- aplicativo Lojinha instalado;
- Appium Server em execução;

execute os testes:

1. Acesse `src/test/java/modulos/produto/`.
2. Abra `ProdutoTest.java`.
3. Clique no ícone verde ▶ ao lado da classe para executar todos os testes.
4. Para executar apenas um cenário, clique no ▶ ao lado do método `@Test`.
5. Acompanhe a execução no painel **Run**.

### 3. Visual Studio Code

O Visual Studio Code também pode ser utilizado para iniciar o Appium Server e executar os testes automatizados.

#### 3.1 Abrir o projeto

1. Abra o **Visual Studio Code**.
2. Abra a pasta `05-appium-mobile`.
3. Instale o **Extension Pack for Java**, caso ainda não esteja instalado.
4. Aguarde o carregamento do projeto Maven.

#### 3.2 Iniciar o Appium Server

Antes de executar os testes:

1. Confirme que o emulador Android está ligado no Android Studio.
2. Abra o **Terminal integrado** do VS Code.
3. Execute:

```bash
appium
```

4. Mantenha o Appium Server em execução.

#### 3.3 Executar os testes

Com o emulador Android e o Appium Server em execução:

1. Abra `src/test/java/modulos/produto/ProdutoTest.java`.
2. Utilize **Run Test** acima da classe ou do método `@Test`.

Também é possível executar todos os testes pelo terminal.

Abra um **novo terminal integrado**, mantendo o terminal do Appium em execução, e execute:

```bash
mvn test
```

O resultado da execução será apresentado no terminal.

> **Importante:** o Android Studio deve permanecer com o emulador ligado durante toda a execução dos testes, tanto pelo IntelliJ IDEA quanto pelo Visual Studio Code.

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