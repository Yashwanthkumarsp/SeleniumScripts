package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shadow_Dom {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		//for selenium 4
		//1st shadow
		WebElement shadowhost = driver.findElement(By.id("shadow_host"));
		SearchContext shadowRoot = shadowhost.getShadowRoot();
		System.out.println(shadowRoot.findElement(By.cssSelector("span[id='shadow_content'] > span")).getText());
		
		//2nd shadow
		WebElement nestedShadowhost = shadowRoot.findElement(By.cssSelector("#nested_shadow_host"));
		SearchContext nestedShadowRoot = nestedShadowhost.getShadowRoot();
		System.out.println(nestedShadowRoot.findElement(By.cssSelector("div[id='nested_shadow_content'] > div")).getText());
		driver.quit();
	}
		//for selenium 3
//      WebElement shadowhost = driver.findElement(By.id("shadow_host"));
//		SearchContext shawdowRoot =expandShadowRoot(shadowhost);
//		System.out.println(shawdowRoot.findElement(By.cssSelector("span[id='shadow_content'] > span")).getText());
//		
//	}
//	public static SearchContext expandShadowRoot(WebElement shadowhost) {
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		SearchContext shawdowRoot =(SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowhost);
//		return shawdowRoot;
//	}
}
