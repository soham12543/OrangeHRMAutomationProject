package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
  
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;


	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}
	
	
	public void toPerformLogin(String givenusername , String givenpass)
	{
		username.clear();
		username.sendKeys(givenusername);
		password.clear();
		password.sendKeys(givenpass);
		getLoginButton().click();
	}
	
	
}
