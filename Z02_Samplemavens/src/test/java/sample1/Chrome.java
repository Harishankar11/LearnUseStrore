package sample1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Chrome implements IRetryAnalyzer{
	
	WebDriver driver;
	
	public void the1(ITestResult result)
	{
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			
			capturescreenshot(driver, result.getName());
			
		}
		
		
	}
	
	public void capturescreenshot(WebDriver driver, String name)
	{
		TakesScreenshot scr = (TakesScreenshot)driver;
		File loc = scr.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(loc, new File(""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		int Max =1, min = 0;
		
		if(min>=Max)
		{
			System.out.println(result.getName());
			Max++;
			return true;
			
		}
		
		return false;
	}


}
