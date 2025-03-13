package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import Pompages.LeavePage;

public class DriverUtility {
	
	public void maximiseWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void implicitlywait(WebDriver driver, int sec )
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public void getUrl(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	public void selectCalendar(WebDriver driver, String givenmonth, String givenyear, String givenday) throws InterruptedException
	{
		LeavePage lp=new LeavePage(driver);
		WebElement Month=lp.getMonthbox();
		WebElement Year=lp.getYearbox();
	    while(!Year.getText().equals(givenyear))	
	      {
		     lp.getFromDateArrowButton().click();
	       }
		
		
	while(true)
	  {
		try {
			WebElement button=driver.findElement(By.xpath("//p[text()='"+givenmonth+"']/ancestor::div[@class='oxd-calendar-wrapper']/descendant::div[text()='"+givenday+"']"));
			button.click();
			break;
		    }
		catch(Exception e)
		  {
			lp.getFromDateArrowButton().click();
		  }	
	   }
	}
	
	public void ssMethod(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+name+".png");
		Files.copy(src, dest);
	}
	
	public void scrollTillMethod(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	
	public void hoverToElement(WebDriver driver, WebElement element)
	{
	    Actions a=new Actions(driver);
	    a.moveToElement(element).perform();
	}
	
	public void clickOnElement(WebDriver driver, WebElement element)
	{
	    Actions a=new Actions(driver);
	    a.click(element).perform();
	}
		
}
	
	
	
	
	


