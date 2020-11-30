package glue;

import io.cucumber.java.en.When;

public class Gluecode2
{
	public Shared sh;
	
	public Gluecode2(Shared sh)
	{
		this.sh=sh;
	}
		
	@When("^close site$")
	public void method3()
	{
		sh.driver.close();
	}
}
