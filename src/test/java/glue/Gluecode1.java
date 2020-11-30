package glue;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;

public class Gluecode1
{
	public Shared sh;
	
	public Gluecode1(Shared sh)
	{
		this.sh=sh;
	}
		
	@Given("^launch site$")
	public void method1()
	{
		WebDriverManager.chromedriver().setup();
		sh.driver=new ChromeDriver();
		sh.driver.manage().window().maximize();
		sh.driver.get(sh.p.getProperty("url"));
		sh.hp=new Homepage(sh.driver);
		sh.wait=new WebDriverWait(sh.driver,20);
		sh.wait.until(ExpectedConditions.visibilityOf(sh.hp.newaccbtn));
	}
	
	@Then("^validate title as \"(.*)\" in homepage$")
	public void method2(String et)
	{
		String at=sh.driver.getTitle();
		if(at.contains(et))
		{
			sh.s.write("Title test passed");
			Assert.assertTrue(true);
		}
		else
		{
			byte[] b=sh.driver.getScreenshotAs(OutputType.BYTES);
			sh.s.embed(b,"Title test failed");
			Assert.assertTrue(false);
		}
	}
}
