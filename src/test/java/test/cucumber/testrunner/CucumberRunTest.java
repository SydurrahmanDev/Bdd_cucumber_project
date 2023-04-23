package test.cucumber.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/test/cucumber/features"},
        glue = {"test/cucumber/stepsdefinition"}
)
public class CucumberRunTest {
}
