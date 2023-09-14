package Sjtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Rediff {
 WebDriver driver;
 
	    public Rediff(WebDriver driver) //constructor
	    {
	        this.driver=driver;
	    }
	    By news = By.linkText("NEWS");
	    By business = By.linkText("BUSINESS");
	    
	    public WebElement news() //method or function
	    {
	        //driver.findElement(By.xpath("//input[@name='login']"));
	        return driver.findElement(news);
	    }   
	    public WebElement business() //method or function
	    {
	        //driver.findElement(By.xpath("//input[@name='login']"));
	        return driver.findElement(business);
	    }
	
  }

