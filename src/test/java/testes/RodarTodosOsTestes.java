package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/"
        , glue = {""}
        , plugin = { "pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "html:target/site/cucumber-pretty",
        "junit:src/test/java/reports/RelatorioCucumber.xml"})


public class RodarTodosOsTestes {

}
