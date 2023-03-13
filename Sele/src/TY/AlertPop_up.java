package TY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop_up {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(2000);
		driver.quit();
	}
}
