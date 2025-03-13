package GenericLibrary;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Pompages.LoginPage;
import Pompages.LogoutPage;

public class BaseTest implements IAutoConstant {
	public FileUtility file = new FileUtility();
	public DriverUtility d = new DriverUtility();
	public ExcelUtility ex=new ExcelUtility();
	
	//public static WebDriver sdriver;
	public  static WebDriver driver;
	
	@BeforeSuite
	public void toConnectTheServer()
	{
		Reporter.log("============Connecting the server===========", true);
	}
	
	@BeforeTest
	public void toConnectTheDB()
	{
		Reporter.log("============Connecting the Database===========", true);
	}
	
	@Parameters("browser")
	@BeforeClass
	public void toLaunchTheBrowser(@Optional("chrome")String browser) throws IOException
	{
		//String browser = file.getDataFromPropertyFile(PropPath, "browser" );
		String url = file.getDataFromPropertyFile(PropPath, "url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else
		{
			Reporter.log("Invalid browser", true);
		}
		
		d.maximiseWindow(driver);
		d.implicitlywait(driver, secs);
		d.getUrl(driver, url);
		
	}
	
	@BeforeMethod(groups="setup")
	public void Login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		String username=ex.getDataFromExcel(ExcelPath, loginSheetName, 1, 0);
		String password=ex.getDataFromExcel(ExcelPath, loginSheetName, 1, 1);
		lp.toPerformLogin(username, password);
		Thread.sleep(2000);
	
		
	}
	
	@AfterMethod(groups="setup")
	public void Logout() throws InterruptedException
	{
		Reporter.log("========logout=====",true);
		LogoutPage lp=new LogoutPage(driver);
	    lp.logout();
	}
	
	@AfterClass
	public void totearDown()
	{
		Reporter.log("=============closing the browser============" , true);
		driver.close();
	}
	
	@AfterSuite
	public void toclosetheserver()
	{
		Reporter.log("============Closing the server===========", true);
		driver.quit();
	}
	
	
	@AfterTest
	public void toCloseTheDb()
	{
		Reporter.log("============closing  the DB===========", true);
	}
	
	

}
