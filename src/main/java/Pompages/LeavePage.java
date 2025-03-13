package Pompages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BaseClass
{

	public LeavePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	int Day;
	String Month;
	String year;
	
	
	
	

	@FindBy(xpath="//label[text()='Duration']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']")
	private WebElement durationButton;
	
	public WebElement getDurationButton() {
		return durationButton;
	}
	
	@FindBy(xpath="//div[@class='oxd-select-option']")
	private List<WebElement> durationOptions;
	

	public List<WebElement> getDurationOptions() {
		return durationOptions;
	}
	
	
	
	
	@FindBy(xpath="//label[text()='Partial Days']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']")
	private WebElement partialDaysButton;
	
	public WebElement getPartialDaysButton() {
		return partialDaysButton;
	}
	
	@FindBy(xpath="//div[@class='oxd-select-option']")
	private List<WebElement> partialDaysOptions;
	

	public List<WebElement> getPartialDaysOptions() {
		return partialDaysOptions;
	}
	
	
	
	
	
	@FindBy(xpath="//a[text()='Assign Leave']")
	private WebElement getAssignOptionButton;
	
	public WebElement getGetAssignButton() {
		return getAssignOptionButton;
	}
	
	
	
	
	
	@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	private WebElement getCommentsArea;
	
	public WebElement getCommentsArea(){
		return  getCommentsArea;
	}
	
	
	
	@FindBy(xpath="//button[text()=' Assign ']")
	private WebElement getAssignTextButton;
	
	public WebElement getAssignButton(){
		return  getCommentsArea;
	}
	
	
	
	
	
	
	
	
	

	@FindBy(xpath="(//div[@class='oxd-date-input-calendar']/descendant::button[@class='oxd-icon-button'])[2]")
	private WebElement fromDateArrowButton;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-selector']/descendant::div[@class='oxd-calendar-selector-month-selected']")
	private WebElement monthbox;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-selector']/descendant::div[@class='oxd-calendar-selector-year-selected']")
	private WebElement yearbox;
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leavePageButton;
	
	
	@FindBy(xpath="//label[text()='From Date']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement fromDateButton;
	
	@FindBy(xpath="//label[text()='To Date']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement ToDateCalendarButton;
	
	@FindBy(xpath="//div[@class='oxd-select-option']")
	private List<WebElement> LeaveOptions;
	

	public List<WebElement> getLeaveOptions() {
		return LeaveOptions;
	}

	@FindBy(xpath="//label[text()='Show Leave with Status']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::i[contains(@class,'oxd-icon bi-caret-dow')]")
	private WebElement showLeaveWithStatusButton;
	
	public WebElement getShowLeaveWithStatusButton() {
		return showLeaveWithStatusButton;
	}
	
	
	@FindBy(xpath="//label[text()='Leave Type']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::i[contains(@class,'oxd-icon bi-caret-down-fill oxd-select-text--arrow')]")
	private WebElement LeaveTypeButtonClick;
	
	
	public WebElement getLeaveTypeButtonClick() {
		return LeaveTypeButtonClick;
	}

	public List<WebElement> getLeaveTypeOptions() {
		return LeaveTypeOptions;
	}

	public WebElement getEmployeeNameClick() {
		return EmployeeNameClick;
	}

	public WebElement getSubUnitButton() {
		return SubUnitButton;
	}

	public List<WebElement> getSubUnitOptions() {
		return SubUnitOptions;
	}

	public WebElement getIncludePastEmpCheckbox() {
		return includePastEmpCheckbox;
	}

	public WebElement getSearchButtonClick() {
		return searchButtonClick;
	}

	@FindBy(xpath="//div[@class='oxd-select-option']")
	private List<WebElement> LeaveTypeOptions;
	
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmployeeNameClick;
	
	
	
	
	@FindBy(xpath="//label[text()='Sub Unit']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[text()='-- Select --']")
	private WebElement SubUnitButton;
	
	
	
	
	@FindBy(xpath="//div[contains(@class,'oxd-select-option --indent')]")
	private List<WebElement> SubUnitOptions;
	
	@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement includePastEmpCheckbox;
	
	
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement searchButtonClick;
	
	
	
	public WebElement getToDateCalendarButton() {
		return ToDateCalendarButton;
	}

	public WebElement getFromDateButton() {
		return fromDateButton;
	}
	
	
	public WebElement getLeavePageButton() {
		return leavePageButton;
	}
	
	public WebElement getFromDateArrowButton() {
		return fromDateArrowButton;
	}

	public WebElement getMonthbox() {
		return monthbox;
	}

	public WebElement getYearbox() {
		return yearbox;
	}
	
	
	
	public void selectLeaveWithStatusFunction()
	{
	try
	{
	  getShowLeaveWithStatusButton().click();
		
		List<WebElement> LeaveStatusOptions=getLeaveOptions();
		for(WebElement option:LeaveStatusOptions)
		{
			if(option.getText().equals("Rejected"))
				option.click();
		}
	 }
	
	  catch(Exception E)
	  {
		  selectLeaveWithStatusFunction();
	  }
	}
	
	public void selectLeaveTypeOptionFunction()
	{
		
		try {
		getLeaveTypeButtonClick().click();
		List<WebElement> LeaveTypeOptions=getLeaveTypeOptions();
		//List<WebElement> LeaveTypeOptions=driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/descendant::div"));
		for(WebElement option:LeaveTypeOptions)
		{
			if(option.getText().equals("CAN - FMLA"))
			{
				option.click();
				break;
			}
		}
		}
		
		catch(Exception e)
		{
			selectLeaveTypeOptionFunction();
		}
	}
	
	public void selectEmployeeNameFunction()
	{
		try
		{
			getEmployeeNameClick().click();
			getEmployeeNameClick().sendKeys("Amelia  Brown");
		}
		catch(Exception e)
		{ 
			selectEmployeeNameFunction();
			
		}
	}
	
	public void selectSubUnitFunction()
	{
		try
		{
			getSubUnitButton().click();
			List<WebElement> SubUnitOptions= getSubUnitOptions();
			for(WebElement option:SubUnitOptions)
			{
				if(option.getText().equals("Engineering"))
				{
					option.click();
				    break;
				}
			}
		}
		catch(Exception e)
		{
             selectSubUnitFunction();
		}
	}
	
	public void clickOnSearch()
	{
		try
		{
		getSearchButtonClick().click();
		}
		catch(Exception E)
		{
			clickOnSearch();
		}
	}
	
	public void clickOnIncludePastEmployees()
	{
		try
		{
		getIncludePastEmpCheckbox().click();
		}
		catch(Exception E)
		{
			clickOnIncludePastEmployees();
		}
	}
	
	
	public void selectPartialDaysFunction()
	{
		try
		{
			getPartialDaysButton().click();
			List<WebElement> SubUnitOptions= getPartialDaysOptions();
			for(WebElement option:SubUnitOptions)
			{
				if(option.getText().equals("All Days"))
				{
					option.click();
				    break;
				}
			}
		}
		catch(Exception e)
		{
			selectPartialDaysFunction();
		}
	}
	
	
	public void selectDurationFunction()
	{
		try
		{
			getDurationButton().click();
			List<WebElement> SubUnitOptions= getDurationOptions();
			for(WebElement option:SubUnitOptions)
			{
				if(option.getText().equals("Half Day - Morning"))
				{
					option.click();
				    break;
				}
			}
		}
		catch(Exception e)
		{
			selectPartialDaysFunction();
		}
	}
	
	public void enterCommentFunction()
	{
		try
		{
			
			getCommentsArea().sendKeys("Kindly Check");
			
		}
		catch(Exception e)
		{
			
			enterCommentFunction();
		}
	}
	
	
	

	
	

	
}
