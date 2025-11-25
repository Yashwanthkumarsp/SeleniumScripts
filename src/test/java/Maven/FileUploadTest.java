package Maven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest {
	@Test 
	public void notification() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://smallpdf.com/pdf-to-word");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Choose Files']")).click();
		Runtime.getRuntime().exec("./AutoIT/UploadPopUp.exe");
					
		Thread.sleep(5000);		
		
		driver.quit();
	}
}
