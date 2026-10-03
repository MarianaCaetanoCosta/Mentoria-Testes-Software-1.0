function validarMensagemErro(mensagem){
    aqObject.CheckProperty(Aliases.Lojinha.dlgLojinha.Static, "WndCaption", cmpEqual, "O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.");
}

function fecharMensagemErro(){
  Aliases.Lojinha.dlgLojinha.btnOK.Click();  
}
module.exports.validarMensagemErro = validarMensagemErro;
module.exports.fecharMensagemErro = fecharMensagemErro;