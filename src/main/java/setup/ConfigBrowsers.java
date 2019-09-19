package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ConfigBrowsers {
    public static WebDriver driver;
    private static ListaDeBrowsers.ListaBrowsers listaBrowser;



    public static WebDriver obterDriver(ListaDeBrowsers.ListaBrowsers browser) throws Exception{
        listaBrowser = browser;
        if (browser.equals(browser.FIREFOX)){
            System.setProperty("webdriver.gecko.driver", "src/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        else{
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        return driver;
    }
}
