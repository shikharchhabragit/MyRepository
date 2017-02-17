

//@SuppressWarnings(“deprecation”)
//@RunWith(Cucumber.class)
//@Cucumber.Options(format={“pretty”,”html:reports/test-report”}, features=”src/test/resources”,tags= “@smokeTest”)
//public class CucumberRunner {
//}

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/"
  ,glue={"stepdefs"}
  )

public class CucumberRunner {

}