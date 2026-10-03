#language:pt

  Funcionalidade: Login

    Cenario: Realizar Login
      Dado que esteja na pagina da lojinha
      Quando o login for realizado com o s seguintes dados
        | usuario | admin |
        | senha | admin |
      Entao valido que o login foi realizado

    @loginEsquema
    Esquema do Cenario: Realizar Login com <usuario>
      Dado que esteja na pagina da lojinha
      Quando o login for realizado com os seguintes dados
        | usuario | <usuario> |
        | senha | <senha> |
      Entao valido que o login foi realizado

      Exemplos:
        | usuario | senha |
        | admin | admin |
        | mariana | 27021987 |

