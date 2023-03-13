package DemoWebPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase22 
{
	public static void main(String[] args) throws InterruptedException, AWTException {
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
		WebElement ele = driver.findElement(By.xpath("(//a[@href='/electronics'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(move).perform();
		Thread.sleep(2000);
		act.moveToElement(ele).perform();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(1000,1477)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(936,0)");
		Thread.sleep(2000);
		WebElement jew = driver.findElement(By.partialLinkText("Jewelry"));
		js.executeScript("arguments[0].scrollIntoView(true);", jew);
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
