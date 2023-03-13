package TY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class HandDiseable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement move = driver.findElement(By.id("java8-doc-download"));
		js.executeScript("arguments[0].scrollIntoView(false);", move);
		driver.findElement(By.xpath("//a[@data-lbl='lightbox-open-jdk-8u361-linux-x64.tar.gz']")).click();
		WebElement clicking =driver.findElement(By.xpath("//a[@class='download-file icn-lock']"));
		js.executeScript("arguments[0].click();", clicking);
		Thread.sleep(2000);
		driver.quit();
 }
}
