package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMaps {
    @FindBy(id = "usuario")
    protected WebElement inpLogin;
    @FindBy(id = "senha")
    protected WebElement inpSenha;
    @FindBy(id = "btn-entrar")
    protected WebElement btnEntrar;
    @FindBy(css = "#nav-mobile > li:nth-child(1) > a")
    protected WebElement linkBoasVindas;
}
