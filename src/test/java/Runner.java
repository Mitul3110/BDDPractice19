import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/search.feature",
        glue = {"steps","hooks"},
        plugin ={"pretty","json:target/cucumber-reports/reports.json",
                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/cucumber-reports/reports2.html"}
)






public class Runner {
}
