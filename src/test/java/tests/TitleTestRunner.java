package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"E:\\Automation\\AutomationNested\\com.bddtddHYBRID.gui.facebook\\src\\test\\resources\\features\\feature1.feature"},
				 monochrome=true,
				 glue= {"glue"},
				 plugin= {"pretty","html:target\\titletestresults","rerun:target\\titletestfailed.txt"}
)
public class TitleTestRunner extends AbstractTestNGCucumberTests
{
}
