package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.POM_concept;

public class Data 
{
	@Test
	public void facebook() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		POM_concept p=new POM_concept(driver);
		p.ph("Pallav0");
		p.pass("23546789");
		p.log();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.log();
		
	}
}
