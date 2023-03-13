package DWS_TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWS_pom.login;

public class DWS_login extends genericclass
{
	@Test
	public void script() throws InterruptedException 
	{
		login l = new login(driver);
		l.loglink();
		l.emailtxtfield("yashwanthsp09@gmail.com");
		l.passtxtfield("1234560789");
		l.logbutton();
		Thread.sleep(2000);
	}
}
