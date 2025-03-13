package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BaseClass
{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(xpath="//button[text()=' Reset Password ']")
	private WebElement resetpassword;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
    public WebElement forgotlink;
	
	
	
	public WebElement getForgotlink() {
		return forgotlink;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getResetpassword() {
		return resetpassword;
	}

	public WebElement getCancel() {
		return cancel;
	}

	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement cancel;
	

	
	
	
}

	


