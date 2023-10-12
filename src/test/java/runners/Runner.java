package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha okunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:TestOutput/htmlReport/cucumber.xml",
                "rerun:TestOutput/failed_scenarios.txt"
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src/test/resources/features",//features folder path
        glue = {"stepdefinitions"},   //stepdefinitions path
        tags = "@google",
        dryRun = false
)
public class Runner {
}
