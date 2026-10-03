package pages;

import core.Driver;
import maps.LoginMaps;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMaps {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void realizarLogin(String login, String senha) {
        inpLogin.sendKeys(login);
        inpSenha.sendKeys(senha);
        btnEntrar.click();
    }

    public String obterMensagemBoasVindas() {
        return linkBoasVindas.getText();
    }
}
