package DemoWebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase14 {
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
		WebElement move = driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(move).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/notebooks'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//a[.='Shopping cart']")).click();
		WebElement qauntity = driver.findElement(By.xpath("//input[@value='1']"));
		qauntity.sendKeys(Keys.CONTROL+"a");
		qauntity.sendKeys(Keys.DELETE);
		qauntity.sendKeys("2");
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	   }
}
