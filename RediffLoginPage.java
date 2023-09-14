package Sjtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffLoginPage {
WebDriver driver;
    
    public RediffLoginPage(WebDriver driver)
    {
        this.driver=driver; //meaning ?
    }
    
    By userName = By.xpath("//input[@id='login1']");
    By password = By.cssSelector("input[id='password']"); 
    By signIn = By.name("proceed"); 
    By rediffHome = By.linkText("rediff.com");
    
    public WebElement password() //user defined methods
    {
        return driver.findElement(password);
        
    }
    
    public WebElement signIn() //user defined methods
    {
        return driver.findElement(signIn);
        
    }
    
    public WebElement userName() //user defined methods
    {
        return driver.findElement(userName);
        
    }
    
    public WebElement rediffHome() //user defined methods
    {
        return driver.findElement(rediffHome);
        
    }
    
    
}
  

