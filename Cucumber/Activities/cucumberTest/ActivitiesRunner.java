package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
    			 glue = "stepDefinitions"
    			 //plugin = {"pretty"},
    			 //plugin = {"html: test-reports"},
    			 //plugin = {"json: test-reports/json-report.json"},
    		     //monochrome = true
    			 )

public class ActivitiesRunner {
    //empty
}
