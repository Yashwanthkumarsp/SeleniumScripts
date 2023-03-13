package DemoWebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yashwanthsp09@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234560789");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("(//a[@href='/jewelry'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of Diamond Pave Earrings']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Add your review')]")).click();
		driver.findElement(By.xpath("//input[@id='AddProductReview_Title']")).sendKeys("Good");
		driver.findElement(By.xpath("//textarea[@id='AddProductReview_ReviewText']")).sendKeys("Nice");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
