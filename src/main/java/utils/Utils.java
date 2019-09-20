package utils;

import org.openqa.selenium.WebDriver;
import setup.BaseTestes;

public class Utils {
    protected static WebDriver driver;
    public Utils() {
        driver = BaseTestes.obterDriver();
    }


}
