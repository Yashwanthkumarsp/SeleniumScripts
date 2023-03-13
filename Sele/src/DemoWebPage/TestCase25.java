package DemoWebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase25 {
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
		driver.findElement(By.xpath("(//a[@href='/gift-cards'])[1]")).click();
		driver.findElement(By.xpath("//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000014_5-virtual-gift-card_125.jpeg']")).click();
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Yash");
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("yashwanthsp09@gmail.com");
		driver.findElement(By.id("add-to-wishlist-button-1")).click();
		driver.findElement(By.xpath("(//a[@href='/wishlist'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.name("addtocartbutton")).click();
		driver.findElement(By.xpath("(//a[@href='/cart'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
