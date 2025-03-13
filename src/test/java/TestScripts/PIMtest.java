package TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import GenericLibrary.BaseTest;
import Pompages.PIMPage;

public class PIMtest extends BaseTest 
{

	
	@Test
	public void PIMTest() throws AWTException, InterruptedException, IOException
	{
		
		PIMPage page=new PIMPage(driver);
		//uploadPhoto
		Thread.sleep(2000);
		page.getPIMSectionButton().click();
		Thread.sleep(2000);
		page.getAddButton().click();
		Thread.sleep(2000);
		page.getFirstName().sendKeys("Soham");
		Thread.sleep(2000);
		page.getMiddleName().sendKeys("NA");
		Thread.sleep(2000);
		page.getLastName().sendKeys("Chakraborty");
		Thread.sleep(2000);
		page.getEmployeeId().clear();
		page.getEmployeeId().sendKeys("2738");
	
		
		page.getPhotoUploadButton().click();
		Thread.sleep(4000);
		StringSelection file = new StringSelection(PIMUploadPhotoPath);
		Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
		c.setContents(file, null);
		
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		page.getSaveButton().click();
		d.ssMethod(driver, "ss1");
		
		//Enter additional details
		
		Thread.sleep(5000);
		page.enterIDFunction();
		Thread.sleep(2000);
		page.enterLicenseNoFucntion();
		Thread.sleep(2000);
		page.getLicenseExpiryDateCalendarButton().click();
		d.selectCalendar(driver, "April", "2026", "25");
		Thread.sleep(2000);
		page.selectNationalityFunction();
		page.selectMaritalStatusFunction();
	    Thread.sleep(2000);
	    page.getDateOfBirthCalendarButton().click();
	    d.selectCalendar(driver, "April", "2025", "25");
	    page.getMaleButton().click();
	    Thread.sleep(2000);
	    page.getPersonalDetailsSaveButton().click();
	    Thread.sleep(2000);
	    
	    //Enter Blood details
	    
	    
	    page.selectBloodTypeFunction();
	    Thread.sleep(2000);
	    page.getTest_FieldButton().sendKeys("Test1");
	    Thread.sleep(2000);
	    page.getCustomFieldsSaveButton().click();
	    
	    
	    //Attach File
	    
	    page.getAttatchMentButton().click();
	    Thread.sleep(2000);
	    page.getBrowseButton().click();
	    Thread.sleep(2000);
	    StringSelection file1=new StringSelection(PIMUploadFilePath);
	    Clipboard c2=Toolkit.getDefaultToolkit().getSystemClipboard();
	    c2.setContents(file1, null);
	 	r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_ENTER);
	    
		
		Thread.sleep(2000);
		page.getAddAttatchmentSaveButton().click();
	    
	    //driver.findElement(By.xpath("//div[text()='Browse']")).sendKeys("C:\\Users\\Asus\\eclipse-workspace\\TestNG Workspace\\OrangeHrmProject\\src\\test\\resources\\TestData.properties");

	    
	}
	
	}

