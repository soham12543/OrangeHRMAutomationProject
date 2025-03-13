package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.ExtentReportClass;
import GenericLibrary.BaseTest;
import Pompages.LoginPage;


public class LoginTest extends BaseTest
{
	
	@Test
	public void Login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		String username=ex.getDataFromExcel(ExcelPath, loginSheetName, 1, 0);
		String password=ex.getDataFromExcel(ExcelPath, loginSheetName, 1, 1);
		
		lp.toPerformLogin(username, password);
		
	}
	

}
