package TY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Downloads/iframe.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("(//img[@alt='Autocar India Instagram Page'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[.='Google']")).click();
		Thread.sleep(2000);
		
	}
}
