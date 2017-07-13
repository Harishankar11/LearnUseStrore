package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Browser {
	
	@Test
	public void firefoxDriver() throws InterruptedException
	{
		/*WebDriver driver = new HtmlUnitDriver();
		
		System.out.println("Program started");
		
		driver.get("https://www.sulekha.com/");
		
		String s1 = driver.getPageSource();
		
		System.out.println(s1);
		
		
		Verify.verify(true, "hi", "okay");
		
		driver.close();*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> ele = driver.findElements(By.xpath("//header/div[2]/div/ul/li"));
		
		
		
		Actions action = new Actions(driver);
		
		
		System.out.println(ele.size());
		for(int i=1;i<=ele.size();i++)
		{
			
			
			WebElement el = driver.findElement(By.xpath("//header/div[2]/div/ul/li["+i+"]"));
			System.out.println("**********************");
			System.out.println(el.getText());
			
			action.moveToElement(el).build().perform();
			
			
			
			
			List<WebElement> ele1 = driver.findElements(By.xpath("//div[2]/div/ul/li["+i+"]/ul/li/ul/li"));
			
			for(int j=1;j<=ele1.size();j++)
				{
				
			
				List<WebElement> ele2 = driver.findElements(By.xpath("//div[2]/div/ul/li["+i+"]/ul/li/ul/li["+j+"]/ul/li"));
			
				for(int k=1;k<=ele2.size();k++)
					{
					WebElement el1 =driver.findElement(By.xpath("//div[2]/div/ul/li["+i+"]/ul/li/ul/li["+j+"]/ul/li["+k+"]"));
					
					System.out.println(el1.getText());
					
					action.moveToElement(el1)
					//.keyDown(el1, Keys.SHIFT)
					.build().perform();
					action.moveToElement(el1)
					.contextClick()
					.build().perform();
					}
			
				}
			
		
			
			
			
		}
		
		
		
		
		
		/*
		 * List<WebElement> l1 = driver.findElements(By.xpath("//ul/li/ul/li"));
		
		System.out.println(l1.size());
		
		 * for(WebElement el : l1)
		{
		
			//action.moveToElement(ele).build().perform();
			String s1 = el.getText();
			System.out.println(s1);
		}*/
		
	}

}
