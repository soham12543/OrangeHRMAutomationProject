package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BaseClass {

	public LogoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement userDropDown;
	
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement LogoutButton;
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		userDropDown.click();
		Thread.sleep(2000);
		LogoutButton.click();
	}
	
}
