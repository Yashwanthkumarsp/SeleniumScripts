package DWS_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginlink;

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement button;

	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loglink() {
		loginlink.click();
	}

	public void emailtxtfield(String mail) {
		email.sendKeys(mail);
	}

	public void passtxtfield(String pass) {
		password.sendKeys(pass);
	}

	public void logbutton() {
		button.click();
	}
}
