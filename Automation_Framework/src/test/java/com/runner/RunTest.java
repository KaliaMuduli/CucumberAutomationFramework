package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com.StepDefinations"},monochrome=true,
                 plugin= {"html:Reports\\HtmlReport","json:Reports\\JSONReport\\cucumber.json","junit:Reports\\JUNITReport\\cucumber.xml"},
                 dryRun=false
                 
		
		)

public class RunTest {

}
