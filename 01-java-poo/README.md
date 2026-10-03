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

Também é possível executar a classe LojinhaApp diretamente pela IDE.

## Testes e relatórios

Este projeto é um exercício de Java/POO e não possui framework de testes automatizados ou plugin de geração de relatórios configurado no pom.xml.

Por isso:

- não há comando de execução de testes automatizados;
- não há relatório automatizado de testes configurado;
- mvn clean compile pode ser utilizado para validar a compilação do projeto.

## Documentação

- [Java SE Documentation](https://docs.oracle.com/en/java/javase/22/)
- [Maven Documentation](https://maven.apache.org/guides/)

## Observações

O código foi mantido conforme o projeto original para preservar o material desenvolvido durante a Mentoria 1.0. O objetivo desta consolidação é organizar os projetos em um único repositório de portfólio, sem alterar o conteúdo funcional do projeto original.
