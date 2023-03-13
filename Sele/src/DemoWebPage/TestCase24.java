package DemoWebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase24 {
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
		driver.findElement(By.xpath("(//a[@href='/customer/info'])[2]")).click();
		driver.findElement(By.xpath("(//a[@href='/customer/addresses'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='button-1 add-address-button']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("Yash");
		driver.findElement(By.id("Address_LastName")).sendKeys("S P");
		driver.findElement(By.id("Address_Email")).sendKeys("yashwanthsp09@gamil.com");
		WebElement drop = driver.findElement(By.id("Address_CountryId"));
		org.openqa.selenium.support.ui.Select sc= new org.openqa.selenium.support.ui.Select(drop);
		sc.selectByVisibleText("India");
		driver.findElement(By.id("Address_City")).sendKeys("Banglore");
	    driver.findElement(By.id("Address_Address1")).sendKeys("Rajajinagar");
	    driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("123456");
	    driver.findElement(By.id("Address_PhoneNumber")).sendKeys("8528528520");
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	    driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
