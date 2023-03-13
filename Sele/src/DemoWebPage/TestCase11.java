package DemoWebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase11 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com");
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yashwanthsp09@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234560789");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.findElement(By.xpath("(//a[@href='/customer/info'])[2]")).click();
	WebElement ln = driver.findElement(By.xpath("//input[@id='LastName']"));
	ln.sendKeys(Keys.CONTROL+"a");
	ln.sendKeys(Keys.DELETE);
	ln.sendKeys("SP");
	driver.findElement(By.name("save-info-button")).click();
	driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	Thread.sleep(2000);
	driver.quit();
   }
}
