package Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/downloads/");
	    String Pb = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://snowcityblr.com/contact-us/");
		String Pb1 = driver.getWindowHandle();
		driver.switchTo().window(Pb);
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.switchTo().window(Pb1);
		driver.manage().window().minimize();
		
		
	}
}
