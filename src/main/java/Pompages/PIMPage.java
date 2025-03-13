package Pompages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage extends BaseClass
{

	public PIMPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement getOtherID() {
		return otherID;
	}


	public WebElement getLicenseNo() {
		return licenseNo;
	}


	public WebElement getLicenseExpiryDateCalendarButton() {
		return licenseExpiryDateCalendarButton;
	}


	public WebElement getNationalityButton() {
		return nationalityButton;
	}


	public List<WebElement> getNationalityOptions() {
		return nationalityOptions;
	}


	public WebElement getMaritalStatusButton() {
		return maritalStatusButton;
	}


	public List<WebElement> getMaritalStatusOptions() {
		return maritalStatusOptions;
	}


	public WebElement getDateOfBirthCalendarButton() {
		return dateOfBirthCalendarButton;
	}


	public WebElement getMaleButton() {
		return maleButton;
	}


	public WebElement getFemaleButton() {
		return femaleButton;
	}


	public WebElement getPersonalDetailsSaveButton() {
		return personalDetailsSaveButton;
	}


	public WebElement getBloodTypeButton() {
		return bloodTypeButton;
	}


	public List<WebElement> getBloodTypeOptions() {
		return bloodTypeOptions;
	}


	public WebElement getTest_FieldButton() {
		return Test_FieldButton;
	}


	public WebElement getCustomFieldsSaveButton() {
		return customFieldsSaveButton;
	}


	public WebElement getAttatchMentButton() {
		return attatchMentButton;
	}

	
	@FindBy(xpath="//div[text()='Browse']")
	private WebElement browserButton;
	
	public WebElement getBrowseButton() {
		return browserButton;
	}
	
	@FindBy(xpath="(//h6[text()='Add Attachment']/ancestor::div[@class='orangehrm-card-container'])[2]/descendant::button[text()=' Save ']")
	private WebElement AddAttachmentSaveButton;
	
	public WebElement getAddAttatchmentSaveButton() {
		return AddAttachmentSaveButton;
	}
	//(//h6[text()='Add Attachment']/ancestor::div[@class='orangehrm-card-container'])[2]/descendant::button[text()=' Save ']
	
	
	
	

	@FindBy(xpath="//label[text()='Other Id']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input")
	private WebElement otherID;
	
	@FindBy(xpath="//label[text()=\"Driver's License Number\"]/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@class='oxd-input oxd-input--active']")
	private WebElement licenseNo;
	
	@FindBy(xpath="//label[text()='License Expiry Date']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement licenseExpiryDateCalendarButton;
	
	@FindBy(xpath="//label[text()='Nationality']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']")
	private WebElement nationalityButton;
	
	@FindBy(xpath="//div[@class='oxd-select-option']")
	private List<WebElement> nationalityOptions;
	
	
	@FindBy(xpath="//label[text()='Marital Status']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']")
	private WebElement maritalStatusButton;
	
	@FindBy(xpath="//div[@class='oxd-select-option']")
	private List<WebElement> maritalStatusOptions;
	
	
	@FindBy(xpath="//label[text()='Date of Birth']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement dateOfBirthCalendarButton;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement maleButton;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement femaleButton;
	
	@FindBy(xpath="//h6[text()='Personal Details']/ancestor::div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/descendant::button[text()=' Save ']")
	private WebElement personalDetailsSaveButton;
	
	
	@FindBy(xpath="//label[text()='Blood Type']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']")
	private WebElement bloodTypeButton;
	
	@FindBy(xpath="//div[@class='oxd-select-option']")
	private List<WebElement> bloodTypeOptions;
	
	@FindBy(xpath="//label[text()='Test_Field']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@class='oxd-input oxd-input--active']")
	private WebElement Test_FieldButton;
	
	@FindBy(xpath="(//h6[text()='Custom Fields']/ancestor::div[@class='orangehrm-card-container'])[2]/descendant::button[text()=' Save ']")
	private WebElement customFieldsSaveButton;
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement attatchMentButton;
	
	
	////label[text()='Blood Type']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIMSectionButton;
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement addButton;
	
	
	@FindBy(xpath="//input[@name='firstName']")
    private WebElement firstName;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middleName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//label[text()='Employee Id']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::input[@class='oxd-input oxd-input--active']")
	private WebElement employeeId;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-plus']")
	private WebElement photoUploadButton;
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement saveButton;


	public WebElement getPIMSectionButton() {
		return PIMSectionButton;
	}


	public WebElement getAddButton() {
		return addButton;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getMiddleName() {
		return middleName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getEmployeeId() {
		return employeeId;
	}


	public WebElement getPhotoUploadButton() {
		return photoUploadButton;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	
	
	public void selectNationalityFunction()
	{
		try
		{
		getNationalityButton().click();
		List<WebElement> options=getNationalityOptions();
		for(WebElement option:options)
		 {
			if(option.getText().equals("Indian"))
			{
				option.click();
				break;
			}
		  }
		}
		catch(Exception e)
		{
			selectNationalityFunction();
		}
	}
	
	
	public void selectBloodTypeFunction()
	{
		try
		{
		getBloodTypeButton().click();
		List<WebElement> options=getBloodTypeOptions();
		for(WebElement option:options)
		 {
			if(option.getText().equals("B+"))
			{
				option.click();
				break;
			}
		  }
		}
		catch(Exception e)
		{
			selectNationalityFunction();
		}
	}
	
	
	public void selectMaritalStatusFunction()
	{
		try
		{
		getMaritalStatusButton().click();
		List<WebElement> options=getMaritalStatusOptions();
		for(WebElement option:options)
		 {
			if(option.getText().equals("Single"))
			{
				option.click();
				break;
			}
		  }
		}
		catch(Exception e)
		{
			selectMaritalStatusFunction();
		}
	}
	
	public void enterIDFunction()
	{
		try
		{
		    WebElement id=getOtherID();
		    id.sendKeys("2000");
		   
		}
		catch(Exception e)
		{
			System.out.println("Exception occured for other ID");
			enterIDFunction();
		}
	}
	
	
	public void enterLicenseNoFucntion()
	{
		try
		{
		WebElement license=getLicenseNo();
		  license.sendKeys("2938");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured for License No");
			enterLicenseNoFucntion();
		}
	}
	
	
	
	
	
}
