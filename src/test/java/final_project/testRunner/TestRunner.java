package final_project.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "final_project.steps",
        tags = "@Regression",
        plugin = {
                "html:target/html_report/report.html"
        }
)

public class TestRunner {
}
