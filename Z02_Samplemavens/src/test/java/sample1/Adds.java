package sample1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Adds {
	
	WebDriver driver;
	//@Test
	public void addition()
	{
		System.out.println("*****START******");
		System.out.println("*****START******");
		System.out.println("*****START******");
		System.out.println("*****START******");
		
		
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Harishankar\\Harish\\Jar files\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "./File/chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.sulekha.com/ac-services/chennai");
		
		System.out.println(driver.getTitle());
		
		System.out.println("*********END*******");
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		alert.dismiss();
		alert.getText();
		driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("asdf");
		
		
		driver.close();
		
		String Main = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			String child = i1.next();
			
			if(!Main.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				
				// .........
				
				driver.close();
				
			}
		}
		driver.switchTo().window(Main);
		
	}
	WebElement link_Home = driver.findElement(By.linkText("Home"));
	
	Actions builder = new Actions(driver);
	
	Action mouseOverHome = builder.moveToElement(link_Home).build();
	
	@Test
	public void addition1()
	{
		System.out.println("Before Error ");
		 
		 try{
		 Assert.assertEquals(21, (25*5));
		 }catch(Throwable t){
		 // recovered
		 // java code to fail the test
		 System.out.println("After Error ");
		 }
	}
	
}
