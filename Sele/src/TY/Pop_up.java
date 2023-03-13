package TY;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up 
{
	public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("file:///C:/Users/Admin/Downloads/MultipleWindow.html");
			driver.manage().window().maximize();
			String parent = driver.getWindowHandle();
			driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			Thread.sleep(2000);
			Set<String> winhand = driver.getWindowHandles();
			winhand.remove(parent);
			for (String handle : winhand) {
				driver.switchTo().window(handle);
				driver.close();
				Thread.sleep(2000);
			}
	}
}
