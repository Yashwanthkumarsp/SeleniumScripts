package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_concept 
{
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	
	public POM_concept(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ph(String un)
	{
		email.sendKeys(un);
	}
	public void pass(String pa) 
	{
		password.sendKeys(pa);
	}
	public void log() 
	{
		login.click();
	}
	
}
