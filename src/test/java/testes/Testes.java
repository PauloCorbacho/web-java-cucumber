package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features"
        , glue = {""}
        , plugin = {"pretty", "junit:src/test/java/reports/Cucumber.xml"})

public class Testes {

}
