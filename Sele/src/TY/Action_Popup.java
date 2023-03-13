package TY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Popup 
{
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rc = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act= new Actions(driver);
		act.contextClick(rc).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Edit']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		driver.quit();
	}
}
