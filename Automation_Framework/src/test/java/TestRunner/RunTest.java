package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/",glue= {"stepDefinations"},monochrome=true,
                 plugin= {"html:Reports\\HtmlReport","json:Reports\\JSONReport\\cucumber.json","junit:Reports\\JUNITReport\\cucumber.xml"},
                 dryRun=false //Mapping between feature file and steps file
                // strict=true   //It will check if any step is not defined in step def file
              //   tags="@SmokeTest or @SanityTest"
		     //  tags="@SmokeTest and @SanityTest"
              //  tags="@SmokeTest and not @SanityTest"
		     //  tags="not @SanityTest"
		)

public class RunTest {

}
