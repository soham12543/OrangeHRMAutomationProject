package Pompages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BaseClass{
	
	public AdminPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(@class,'oxd-select-option')]")
	private List<WebElement> allUserOption;
	
	@FindBy(xpath="//div[contains(@class,'oxd-select-option')]")
	private List<WebElement> allStatusOption;


	@FindBy(xpath = " //button[text()=' Add ']")
	private WebElement adduser;
	
	
    @FindBy(xpath="//label[text()='User Role']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']")
	private WebElement userroledrop;
    
    @FindBy(xpath = "//label[text()='Status']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']")
    private WebElement statusdrop;
    
    
    @FindBy(xpath = "//label[text()='Password']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@type='password']")
    private WebElement password;
    
    
    @FindBy(xpath = "//label[text()='Employee Name']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@placeholder='Type for hints...']")
    private WebElement empnamedrop;
    
    
    @FindBy(xpath = "//label[text()='Username']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@class='oxd-input oxd-input--active']")
    private WebElement username;
    
    
    @FindBy(xpath = "//label[text()='Confirm Password']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@type='password']")
    private WebElement confirmpass;
    
    @FindBy(xpath = "//button[text()=' Reset ']")
    private WebElement resetbutton;
    
    @FindBy(xpath="//span[text()='Admin']")
    private WebElement adminButton;
    
    @FindBy(xpath = "//button[text()=' Save ']")
    private WebElement saveButton;

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getAdduser() {
		return adduser;
	}

	public WebElement getUserroledrop() {
		return userroledrop;
	}

	public WebElement getStatusdrop() {
		return statusdrop;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmpnamedrop() {
		return empnamedrop;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getResetbutton() {
		return resetbutton;
	}

	public WebElement getAdminButton() {
		return adminButton;
	}
	
	public List<WebElement> getAllUserOption() {
		return allUserOption;
	}
    
	public List<WebElement> getAllStatusOption() {
		return allStatusOption;
	}
}
