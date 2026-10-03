# 01 - Lojinha

## Objetivo

Projeto de nivelamento técnico em Java com foco nos fundamentos de Programação Orientada a Objetos (POO), utilizando uma aplicação simples de loja para praticar classes, objetos, construtores, encapsulamento, herança, polimorfismo, interfaces, enumerações, listas, condicionais e tratamento de exceções.

## Stack utilizada

- Java 22
- Maven
- Programação Orientada a Objetos (POO)

O projeto não possui dependências externas declaradas no pom.xml.

## Estrutura do projeto

```text
01-java-poo/
├── README.md
├── pom.xml
├── .gitignore
└── src/
    └── main/
        └── java/
            ├── br/com/lojinha/
            │   ├── LojinhaApp.java
            │   ├── enuns/
            │   │   └── Tamanho.java
            │   ├── interfaces/
            │   │   └── Favorito.java
            │   └── pojo/
            │       ├── ItemIncluso.java
            │       ├── Produto.java
            │       ├── ProdutoInternacional.java
            │       └── ProdutoNacional.java
            └── org/example/
                └── Main.java
```

## Como executar

Pré-requisitos:

- JDK 22 instalado e configurado no PATH
- Maven instalado e configurado no PATH

Na raiz deste projeto:

```bash
mvn clean compile
```

Para executar a aplicação principal após a compilação:

```bash
java -cp target/classes br.com.lojinha.LojinhaApp
```

## Executar pelo IntelliJ IDEA

1. Abra a pasta `01-java-poo` no IntelliJ IDEA.
2. Aguarde o Maven carregar o projeto e as dependências.
3. No painel **Project**, acesse `src/main/java/br/com/lojinha/`.
4. Abra a classe `LojinhaApp.java`.
5. Clique no ícone verde ▶ ao lado do método `main`.
6. Selecione **Run 'LojinhaApp.main()'**.
7. Acompanhe a execução no painel **Run**.

O IntelliJ IDEA também permite executar a classe diretamente pelo editor ou criar uma configuração de execução. citeturn0search0turn0search1

## Executar pelo Visual Studio Code

1. Abra a pasta `01-java-poo` no Visual Studio Code.
2. Instale o **Extension Pack for Java**, caso ainda não esteja instalado.
3. Aguarde o carregamento do projeto Maven.
4. Abra `src/main/java/br/com/lojinha/LojinhaApp.java`.
5. Clique em **Run** acima do método `main`.

Como alternativa, utilize o terminal integrado do VS Code:

```bash
mvn clean compile
java -cp target/classes br.com.lojinha.LojinhaApp
```

O suporte Java do VS Code permite executar aplicações Java diretamente pelo editor quando o ambiente está configurado. 

## Testes e relatórios

Este projeto é um exercício de Java/POO e não possui framework de testes automatizados ou plugin de geração de relatórios configurado no pom.xml.

Por isso:

- não há comando de execução de testes automatizados;
- não há relatório automatizado de testes configurado;
- `mvn clean compile` pode ser utilizado para validar a compilação do projeto.

## Documentação

- [Java SE Documentation](https://docs.oracle.com/en/java/javase/22/)
- [Maven Documentation](https://maven.apache.org/guides/)

## Observações

O código foi mantido conforme o projeto original para preservar o material desenvolvido durante a Mentoria 1.0. O objetivo desta consolidação é organizar os projetos em um único repositório de portfólio, sem alterar o conteúdo funcional do projeto original.
