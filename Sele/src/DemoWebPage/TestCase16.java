package DemoWebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase16 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yashwanthsp09@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234560789");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of 3rd Album']")).click();
		driver.findElement(By.id("add-to-wishlist-button-53")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	   }
}
