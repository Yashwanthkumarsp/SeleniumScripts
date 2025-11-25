package Facebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
@Test(dataProvider = "test")
public void test1(String UN , String Password) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(op);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.instagram.com/accounts/login/");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
driver.quit();
}
@DataProvider(name = "test")
public Object[][] testing() throws EncryptedDocumentException, IOException
{
	return ExcelData.test("Facebook");
}
}
