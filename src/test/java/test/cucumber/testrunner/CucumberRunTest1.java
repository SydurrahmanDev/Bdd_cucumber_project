package test.cucumber.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={ "src/test/java/test/cucumber/features/"},
        glue = {"test/cucumber/stepsdefinition"},
        plugin = {"pretty", "html:report/Cucumber-report.html"},
        monochrome = true,
        dryRun = false,
        tags = "@Costco",
        publish = true
)
public class CucumberRunTest1 {
}
