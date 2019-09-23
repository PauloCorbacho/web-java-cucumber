package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class ConfigBrowsers {
    public static WebDriver driver;
    private static ListaDeBrowsers.ListaBrowsers listaBrowser;

    public static WebDriver obterDriver(ListaDeBrowsers.ListaBrowsers browser) throws Exception {
        listaBrowser = browser;
        switch (browser) {
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "src/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case IE:
                System.setProperty("webdriver.ie.driver", "src/resources/drivers/msedgedriver.exe");
                driver = new InternetExplorerDriver();
                break;
            default:
                System.out.println("browser : " + listaBrowser + " nevegador não encontrado, usaremos o Firefox para rodar os testes!");
                driver = new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return driver;
    }
}
