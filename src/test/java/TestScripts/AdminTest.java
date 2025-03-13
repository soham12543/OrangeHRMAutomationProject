package TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.CustomListener;

import GenericLibrary.BaseTest;
import Pompages.AdminPage;
import Pompages.LoginPage;




public class AdminTest extends BaseTest{
	
	@Test
	public void toCheckFunctionalityOfAdmin() throws InterruptedException, EncryptedDocumentException, IOException, AWTException {
		
		AdminPage admin = new AdminPage(driver);
		admin.getAdminButton().click();
		admin.getAdduser().click();	
		admin.getUserroledrop().click();

	     String userRole =	ex.getDataFromExcel(ExcelPath, adminSheetName, 1, 1);
		System.out.println(userRole);//to check which user it is fetching from excel
		List<WebElement> options= admin.getAllUserOption();
		for(WebElement option:options)
		{
			if(option.getText().equals(userRole))
			{
				option.click();
				break;
			}
			System.out.println(option.getText());
				
		}
		
		admin.getStatusdrop().click();
		String status = ex.getDataFromExcel(ExcelPath, adminSheetName, 2, 1);
		System.out.println("selected statusoption is " + status);
		List<WebElement> statusoptions = admin.getAllStatusOption();
		for(WebElement option : statusoptions)
		{
			if(option.getText().equals(status))
			{
				option.click();
				break;
			}
			System.out.println(option.getText());
		}
		
		String username=ex.getDataFromExcel(ExcelPath, adminSheetName, 4, 1);
		admin.getUsername().sendKeys(username);
		
		String password=ex.getDataFromExcel(ExcelPath, adminSheetName, 5, 1);
		admin.getPassword().sendKeys(password);
		
		String confirmPassword=ex.getDataFromExcel(ExcelPath, adminSheetName, 6, 1);
		admin.getConfirmpass().sendKeys(confirmPassword);
		
		String EmployeeName=ex.getDataFromExcel(ExcelPath, adminSheetName, 5, 1);
		admin.getEmpnamedrop().sendKeys("Rang");
		
		Thread.sleep(2000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		admin.getSaveButton().click();
		
		Thread.sleep(3000);
		
	}
	

}
