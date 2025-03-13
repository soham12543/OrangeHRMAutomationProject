package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import Pompages.ForgotPasswordPage;
import Pompages.LogoutPage;

public class ForgotPassTest extends BaseTest {

	@Test
	public void toPerformforgotpass() throws IOException, InterruptedException
	{
		
		LogoutPage lp=new LogoutPage(driver);
		lp.logout();
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		fp.getForgotlink().click();
		fp.getUsername().sendKeys("Admin");
		fp.getResetpassword().click();
		Thread.sleep(3000);
		d.ssMethod(driver, "Forgotpass");
		
	}
	
}
