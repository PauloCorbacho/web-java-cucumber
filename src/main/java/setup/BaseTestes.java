package setup;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.UtilRelatorio;

public class BaseTestes {

    public static WebDriver driver;
    @Before
    public void inicia(Scenario scenario) throws Exception {
        driver = ConfigBrowsers.obterDriver(ListaDeBrowsers.ListaBrowsers.CHROME);
    }

    @After
    public void termina(Scenario scenario) throws Exception {
        UtilRelatorio.gerarRelatorio(scenario.getName());
        driver.quit();
    }
    public static WebDriver obterDriver() {
        return driver;
    }
}