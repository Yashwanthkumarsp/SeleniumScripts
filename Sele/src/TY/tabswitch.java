package TY;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabswitch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//i[@class='fab fa-github']")).click();
		Set<String> wh = driver.getWindowHandles();
		String t1="GitHub - SeleniumHQ/selenium: A browser automation framework and ecosystem.";
		for (String git : wh) 
		{
				 driver.switchTo().window(git);
				 String d = driver.getTitle();
				 if(d.equals(t1))
				 {
				  driver.findElement(By.partialLinkText("Sign in")).click();
				  driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("XYZ");
				  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
				  driver.findElement(By.xpath("//input[@type='submit']")).click();
				 }
		}
	}

}
