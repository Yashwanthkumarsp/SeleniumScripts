package Maven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationhandleTest{
	@SuppressWarnings("deprecation")
	@Test 
	public void notification() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		//ChromeOptions op=new ChromeOptions();
		//op.addArguments("--incognito");
		//op.addArguments("--disable-notifications");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoIT/NotificationPopUp.exe");
					
		Thread.sleep(5000);		
		
		driver.quit();
	}
}
