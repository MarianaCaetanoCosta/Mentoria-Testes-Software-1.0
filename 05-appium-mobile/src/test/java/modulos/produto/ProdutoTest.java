package modulos.produto;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import telas.LoginTela;

import java.net.MalformedURLException;
import java.net.URL;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Testes Mobile do Módulo de Produto")
public class ProdutoTest {

    private WebDriver app;

    @BeforeEach //O que é comum a todos
    public void beforeEach() throws MalformedURLException {
        // Abrir o App
        DesiredCapabilities capacidades = new DesiredCapabilities();

        capacidades.setCapability("appium:deviceName", "Small Phone");
        capacidades.setCapability("appium:platformName", "Android");
        capacidades.setCapability("appium:automationName", "UiAutomator2");
        capacidades.setCapability("appium:udid", "emulator-5554");

        capacidades.setCapability("appium:appPackage", "com.lojinha");
        capacidades.setCapability("appium:appActivity", "com.lojinha.ui.MainActivity");

        capacidades.setCapability("appium:app", "C:\\Workspace\\1-Mentoria-Teste-Software-2.0-JulioDeLima-09-2026\\QA-Automacao-de-Testes-E-commerce-main\\projetos\\lojinha-mobile\\lojinha-android-nativa\\lojinha-nativa.apk");

        this.app = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capacidades);

        // Aguarda 10 segundos para execução de cada comando.
        this.app.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Order(1)
    @DisplayName("Validação do Valor de Produto não permitido")
    @Test
    public void testValidacaoDoValorDeProdutoNaoPermitido() {

        String mensagemApresentada = new LoginTela(app)
                .preencherUsuario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaAdicaoProduto()
                .preencherNomeProduto("iPhone")
                .preencherValorProduto("700001")
                .preencherCoresProduto("Azul, Verde")
                .submissaoComErro()
                .obterMensagemErroProdutoComValorNaoPermitido();

        // Validar que a mensagem de valor inválido foi apresentada
        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }

    @Order(2)
    @DisplayName("Validação do Valor de Produto permitido")
    @Test
    public void testValidacaoDoValorDeProdutoPermitido() {

        String mensagemApresentada = new LoginTela(app)
                .preencherUsuario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaAdicaoProduto()
                .preencherNomeProduto("Samsung M32")
                .preencherValorProduto("350000")
                .preencherCoresProduto("Preto, Branco")
                .submissaoComErro()
                .obterMensagemErroProdutoComValorNaoPermitido();

        // Validar que a mensagem de sucesso foi apresentada
        Assertions.assertEquals("Produto adicionado com sucesso", mensagemApresentada);
    }

    @Order(3)
    @DisplayName("Validação Editar Produto Cadastrado")
    @Test
    public void testValidacaoEditarProduto() {

        String mensagemApresentada = new LoginTela(app)
                .preencherUsuario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaEditarProduto()
                .alterarNomeProduto("Motorola X")
                .alterarValorProduto("310000")
                .alterarCorProduto("Cinza, Azul")
                .submissaoSucessoEditarProduto()
                .obterMensagemSucesso();

        Assertions.assertEquals("Produto alterado com sucesso", mensagemApresentada);
    }

    @Order(4)
    @DisplayName("Validação Adicionar Componente")
    @Test
    public void testValidacaoAdicionarComponente() {

        String mensagemApresentada = new LoginTela(app)
                .preencherUsuario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaEditarProduto()
                .abrirTelaAdicionarComponente()
                .preencherNomeComponente("Carregador")
                .preencherQuantidadeComponente("1")
                .submissaoSucessoAdicionarProduto()
                .obterMensagemSucessoAdicionarComponente();

        Assertions.assertEquals("Componente de produto adicionado com sucesso", mensagemApresentada);
    }

    @Order(5)
    @DisplayName("Validação Excluir Componente Cadastrado")
    @Test
    public void testValidacaoExcluirComponente() {

        String mensagemApresentada = new LoginTela(app)
                .preencherUsuario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaEditarProduto()
                .excluirComponente()
                .obterMensagemSucessoExcluirComponente();

        Assertions.assertEquals("Apagado!", mensagemApresentada);
    }

    @Order(6)
    @DisplayName("Validação Excluir Produto Cadastrado")
    @Test
    public void testValidacaoExcluirProduto() {

        String mensagemApresentada = new LoginTela(app)
                .preencherUsuario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaEditarProduto()
                .excluirProduto()
                .obterMensagemSucessoExcluirProduto();

        Assertions.assertEquals("Apagado!", mensagemApresentada);
    }

    @AfterEach
    public void afterEach() {
        app.quit();
    }
}