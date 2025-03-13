package TestScripts;
import GenericLibrary.ExtentReportClass;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import Pompages.LeavePage;
import Pompages.LoginPage;


public class LeaveTest extends BaseTest
{

	@Test
   public void toTestTheFunctionalityOfLeave() throws InterruptedException
   {
	   
		LeavePage lp=new LeavePage(driver);
		lp.getLeavePageButton().click();
	    lp.getFromDateButton().click();
		d.selectCalendar(driver, "April","2025", "20");
		lp.getToDateCalendarButton().click();
		d.selectCalendar(driver, "April","2026", "25");
		Thread.sleep(2000);
		lp.selectLeaveWithStatusFunction();
		Thread.sleep(2000);
		lp.selectLeaveTypeOptionFunction();
		Thread.sleep(2000);
		lp.selectSubUnitFunction();
		Thread.sleep(2000);
		lp.getIncludePastEmpCheckbox().click(); // to include past employess
		Thread.sleep(2000);
		lp.getSearchButtonClick().click();
		
   }

}
