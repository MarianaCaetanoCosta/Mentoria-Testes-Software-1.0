package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTela {
    protected WebDriver app;

    public BaseTela(WebDriver app){
        this.app = app;
    }

    //O método Toast pode estar em várias telas então é viável que fique aqui
    public String capturarToast(){
        WebDriverWait wait = new WebDriverWait(app, Duration.ofSeconds(10));
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//android.widget.Toast")
                )
        ).getText();
    }
}