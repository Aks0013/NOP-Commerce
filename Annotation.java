package Sjtesting;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeTest  
	  public void google() throws InterruptedException  
	  {  
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Leo");
		Thread.sleep(2000);
	  }
	
	  @Test
	  public void dropdown() throws InterruptedException
	  {
		  WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement search=driver.findElement(By.id("dropdown-class-example"));
			Select drpDown=new Select(search);
			Thread.sleep(2000);
			drpDown.selectByIndex(1);
			Thread.sleep(2000);
	  }
	    
	  @AfterTest  
	  public void salesforce() throws InterruptedException, IOException  
	  {  
		  WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			
			FileInputStream reader=new FileInputStream("./Screenshot/Cred.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			String u=prop.getProperty("Username");
			String p=prop.getProperty("Password");
			
			
			WebElement user=driver.findElement(By.id("username"));
			user.sendKeys(u);
		    WebElement pass=driver.findElement(By.id("password"));
		    pass.sendKeys(p);
			Thread.sleep(2000);
			
			  
	  }  
	    
	  
}
