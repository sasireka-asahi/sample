package testRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Feature",glue={"stepdefn"},monochrome = true, dryRun = false, plugin = { "pretty", "html:target",
"json:target/login.json" })						
public class runner 				
{		

}
