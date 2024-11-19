package genericUtility;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SeleniumUtility {
	/**
	 * this method for work on implicitwait
	 * @param driver
	 * @param MaxTime
	 */
	public void implicitwait(WebDriver driver,int MaxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * 
	 * @param driver
	 * @param value 
	 */
	public void Alert(WebDriver driver, String value)
	{
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().getText();
	}
	public void takesScreenshot(WebDriver driver,String value) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(value);
		Files.copy(src,dest);
	}
	public void frames(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void frames(WebDriver driver,String Attributevalue)
	{
		driver.switchTo().frame(Attributevalue);
	}
	public void frames1(WebDriver driver,String value)
	{
		driver.switchTo().frame(value);
	}
	public void MaximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void NavigateToUrl(WebDriver driver,String url) {
		driver.get(url);
	}
	public String captureScreenshort(WebDriver driver,String ScreenshortName) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenshotFolder\\"+ScreenshortName+".png");
	    Files.copy(src, dest);
	    return dest.getAbsolutePath();//used in Extends reports
	}
	
		//.getScreenshotAs(OutputType.FILE);
    
}
