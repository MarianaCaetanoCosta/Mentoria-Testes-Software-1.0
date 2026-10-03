package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private LoginPage loginPage;
    private String usuario;

    @Before
    public void inicializaTeste() {
        Driver.inicializaNavegador();
    }

    @Dado("que esteja na pagina da lojinha")
    public void queEstejaNaPaginaDaLojinha() {
        Driver.getDriver().get("http://165.227.93.41/lojinha-web/v2/");
        loginPage = new LoginPage();
    }


    @Quando("o login for realizado com os seguintes dados")
    public void oLoginForRealizadoComOsSeguintesDados(Map<String, String> map) {
        loginPage.realizarLogin(map.get("usuario"), map.get("senha"));
        usuario = map.get("usuario");
    }

    @Entao("valido que o login foi realizado")
    public void validoQueOLoginFoiRealizado() {
        assertEquals("Boas vindas, "+ usuario +"!", loginPage.obterMensagemBoasVindas());

    }
    @After
    public void finalizaTeste(){
        Driver.getDriver().quit();
    }
}
