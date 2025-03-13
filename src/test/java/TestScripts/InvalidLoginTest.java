package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import Pompages.LoginPage;
import Pompages.LogoutPage;

public class InvalidLoginTest extends BaseTest
{
	
	@DataProvider(name="InvalidData")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		return ex.getMultipleDataFromExcel(ExcelPath, InvalidLoginSheetName);
	}
	
   @Test(dataProvider="InvalidData")
   public void invalidLoginTest(String username, String password) throws InterruptedException
   {
	   LoginPage lp=new LoginPage(driver);
	   lp.toPerformLogin(username, password);
	   Thread.sleep(2000);
   }
	
	
}
