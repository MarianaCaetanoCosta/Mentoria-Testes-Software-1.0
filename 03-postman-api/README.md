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
└── Loginha Api.postman_collection.json
```

## Variáveis de ambiente

A collection utiliza a variável de ambiente `base_url` para a URL da API. O token de autenticação também deve ser mantido como variável do ambiente ou da collection, evitando credenciais e tokens fixos no arquivo versionado.

Exemplo:

```text
base_url = http://<host-da-api>
token = <token-gerado-no-login>
```

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

## Como executar

1. Instale o Postman.
2. Importe `Loginha Api.postman_collection.json`.
3. Configure o ambiente com `base_url`.
4. Execute o login para obter um token válido.
5. Execute a collection pelo Collection Runner.

## Relatórios

Pelo Postman:

- Execute a collection pelo Collection Runner e consulte o resultado da execução.

Pela linha de comando, utilizando Newman:

```bash
newman run "Loginha Api.postman_collection.json"
```

Para gerar relatório HTML, com o reporter instalado:

```bash
newman run "Loginha Api.postman_collection.json" -r cli,html
```

## Documentação

- [Postman Documentation](https://learning.postman.com/docs/)
- [Newman Documentation](https://learning.postman.com/docs/collections/using-newman-cli/)
- [HTTP Semantics](https://httpwg.org/specs/)
