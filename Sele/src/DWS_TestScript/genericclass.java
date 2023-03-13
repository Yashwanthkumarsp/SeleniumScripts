package DWS_TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genericclass {
	public static WebDriver driver;

	@BeforeMethod
	public void open() {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}
}
