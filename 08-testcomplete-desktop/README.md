# 08 - TestComplete Desktop

## Objetivo

Projeto de testes da aplicação Lojinha Desktop, iniciando com checklist de validação e evoluindo para automação com TestComplete.

## Stack utilizada

- TestComplete
- Automação de aplicações Desktop
- Keyword Tests
- Name Mapping
- Testes funcionais
- Regressão visual

## Estrutura do projeto

```text
08-testcomplete-desktop/
├── README.md
└── TestComplete 15 Projects/
    └── TestProject1/
        ├── LojinhaDesktop.pjs
        └── LojinhaDesktop/
            ├── KeywordTests/
            ├── NameMapping/
            ├── Script/
            └── TestedApps/
```

## Checklist de testes

- Regras de negócio
- Listagem de registros
- Licenciamento
- Portabilidade
- Regressão visual
- Interceptação de requisições
- Mensagens de erro
- Atualização após ações
- Comandos de teclado
- Elementos estruturais das telas
- Internacionalização
- Ordem de foco dos campos
- Comportamento sem conexão com a internet

## Como executar pelo TestComplete

1. Instale e abra o TestComplete.
2. Abra o projeto `LojinhaDesktop.pjs`.
3. Verifique a configuração de `TestedApps` e do `NameMapping`.
4. Execute os testes pelo TestComplete.

Não há comando de execução via Maven ou script de linha de comando configurado neste projeto.

## IntelliJ IDEA

O IntelliJ IDEA não é utilizado para executar este projeto. A automação depende do ambiente do TestComplete e de sua configuração de aplicação, objetos e Name Mapping.

## Visual Studio Code

O VS Code pode ser utilizado apenas para visualizar ou editar arquivos de texto do projeto. Ele não substitui o TestComplete para executar os testes automatizados deste projeto.

## Relatórios

Os relatórios são gerados pelo próprio TestComplete durante a execução dos testes. O diretório de relatórios gerados no repositório original não foi migrado, pois corresponde a artefatos de execução; os testes podem gerar novos resultados localmente.

## Documentação

- [TestComplete](https://support.smartbear.com/testcomplete/docs/)
- [Keyword Tests](https://support.smartbear.com/testcomplete/docs/testing-with/keyword-tests/)
- [Name Mapping](https://support.smartbear.com/testcomplete/docs/testing-with/object-identification/name-mapping/)
