package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void inicializaNavegador() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
