package massagebooktestrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Feature",
		glue = "massagebooksteps",
		tags= "@createMembers"
			
		//monochrome = true, 
		//plugin = {"pretty",
				//"html:target/HtmlReports.html",
				//"json:target/JSONReports/report.json",
		        // "junit:target/JUNITReports/report.xml"}
		)

public class MassagebookTestrunner extends AbstractTestNGCucumberTests {

}
