package TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import Pompages.LeavePage;

public class AssignLeaveTest extends BaseTest
{
	  @Test
	    public void assignLeaveTest() throws AWTException, InterruptedException {
	        LeavePage lp = new LeavePage(driver);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	      
	            // Navigate to Leave Page
	            wait.until(ExpectedConditions.elementToBeClickable(lp.getLeavePageButton())).click();
	            wait.until(ExpectedConditions.elementToBeClickable(lp.getGetAssignButton())).click();

	            // Select Employee
	            wait.until(ExpectedConditions.visibilityOf(lp.getEmployeeNameClick())).sendKeys("Peter Mac Anderson");
	            Robot r = new Robot();
	            r.keyPress(KeyEvent.VK_DOWN);
	            r.keyRelease(KeyEvent.VK_DOWN);
	            r.keyPress(KeyEvent.VK_ENTER);
	            r.keyRelease(KeyEvent.VK_ENTER);

	            // Select Leave Type
	            Thread.sleep(2000);
	
	            lp.selectLeaveTypeOptionFunction();
	            
	            // Select Dates
	            wait.until(ExpectedConditions.elementToBeClickable(lp.getFromDateButton())).click();
	            d.selectCalendar(driver, "April", "2025", "20");

	            wait.until(ExpectedConditions.elementToBeClickable(lp.getToDateCalendarButton())).click();
	            d.selectCalendar(driver, "April", "2026", "25");
	            
	            Thread.sleep(2000);
	            
	            lp.selectPartialDaysFunction();
	            
	            Thread.sleep(2000);
	            	      
	            lp.selectDurationFunction();
	            
	            Thread.sleep(2000);
	            	           	            
	            d.scrollTillMethod(driver, lp.getAssignButton());
	            
	            lp.getAssignButton().click();

	    }
}
