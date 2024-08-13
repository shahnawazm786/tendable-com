package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/features",
        glue = "steps",
        tags = "@snacks",
        plugin = {"pretty","html:test-output/cucumber-reports/cucumberreport.html",
                "json:test-output/json-resports/myjson.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }

)
public class MyRunners {

}
