package glue;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.Homepage;

public class Shared 
{
	//Declare global objects
	Scenario s;
	Properties p;
	RemoteWebDriver driver;
	WebDriverWait wait;
	Homepage hp;
	
	@Before
	public void method(Scenario s) throws Exception
	{
		this.s=s;
		File f=new File("E:\\Automation\\AutomationNested\\com.bddtddHYBRID.gui.facebook\\src\\test\\resources\\properties\\config.properties");
		FileInputStream fi=new FileInputStream(f);
		p=new Properties();
		p.load(fi);
	}
}
