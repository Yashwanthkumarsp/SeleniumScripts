package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class facebook extends Genericclass
{
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("8884227374");
		String tl = driver.getTitle();
		System.out.println(tl);
		Assert.assertEquals(tl, "facebook");
		System.out.println("1");
	}
}

