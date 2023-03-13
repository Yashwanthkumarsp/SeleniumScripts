package TY;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabswitchandclose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
	    String sele = driver.getWindowHandle();
		WebElement facebook = driver.findElement(By.xpath("//a[@aria-label='Selenium in Facebook']"));
		facebook.click();
		Thread.sleep(2000);
		Set<String> faceandsele = driver.getWindowHandles();
		faceandsele.remove(sele);
		for (String faceonly : faceandsele) {
			driver.switchTo().window(faceonly);
			driver.close();
		}
		Thread.sleep(2000);
	}
}
