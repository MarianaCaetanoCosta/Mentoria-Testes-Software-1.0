# 03 - Postman API

## Objetivo

Projeto de automação de testes de API REST com Postman, validando autenticação, produtos, componentes, métodos HTTP, códigos de resposta e regras de negócio.

## Stack utilizada

- Postman
- REST / HTTP
- JSON
- JavaScript para scripts de teste e visualização
- Postman Collection v2.0

## Estrutura do projeto

```text
03-postman-api/
├── README.md
└── Lojinha-API.postman_collection.json
```

## Variáveis de ambiente

A collection utiliza a variável de ambiente `base_url` para a URL da API. O token de autenticação também deve ser mantido como variável do ambiente ou da collection, evitando credenciais e tokens fixos no arquivo versionado.

Exemplo:

```text
base_url = http://<host-da-api>
usuario_nome = <nome-do-usuario>
usuario_login = <login-do-usuario>
usuario_senha = <senha-do-usuario>
token = <token-gerado-no-login>
```

As credenciais e o token ficam fora dos dados fixos da collection versionada. Configure esses valores no ambiente do Postman antes da execução.

## Cenários automatizados

- Cadastro de usuário
- Login e obtenção de token
- Cadastro de produto
- Alteração de produto
- Listagem de produtos
- Consulta de produto
- Filtros de produtos
- Exclusão de produto
- Consulta e cadastro de componentes
- Validação de respostas HTTP

## Como executar pelo Postman

1. Instale e abra o Postman.
2. Importe `Lojinha-API.postman_collection.json`.
3. Configure o ambiente com `base_url` e as demais variáveis necessárias.
4. Execute o login para obter um token válido.
5. Execute a collection pelo **Collection Runner**.
6. Consulte os resultados da execução no próprio Postman.

## Executar pelo Visual Studio Code

O VS Code não substitui o Postman para a execução visual da collection. Entretanto, a collection pode ser executada pelo terminal integrado utilizando o Newman.

Com o Newman instalado:

```bash
newman run "Lojinha-API.postman_collection.json"
```

Para gerar relatório HTML:

```bash
newman run "Lojinha-API.postman_collection.json" -r cli,html
```

Nesse caso, o VS Code é utilizado como ambiente de edição e terminal; a execução da collection é realizada pelo Newman.

## IntelliJ IDEA

O IntelliJ IDEA não é necessário para este projeto, pois a automação é executada pelo Postman ou Newman.

## Relatórios

Pelo Postman:

- Execute a collection pelo Collection Runner e consulte o resultado da execução.

Pela linha de comando, utilizando Newman:

```bash
newman run "Lojinha-API.postman_collection.json"
```

Para gerar relatório HTML, com o reporter instalado:

```bash
newman run "Lojinha-API.postman_collection.json" -r cli,html
```

## Documentação

- [Postman Documentation](https://learning.postman.com/docs/)
- [Newman Documentation](https://learning.postman.com/docs/collections/using-newman-cli/)
- [HTTP Semantics](https://httpwg.org/specs/)
