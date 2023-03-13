package TY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://snowcityblr.com/contact-us/");
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//div[@class='icon navigate-icon']")).click(); 
	}
}
