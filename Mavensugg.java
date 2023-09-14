package Sjtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mavensugg {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  WebElement search=driver.findElement(By.id("APjFqb"));
	  search.sendKeys("Bangalore");
	  Thread.sleep(3000);
	  List <WebElement> suggestion=driver.findElements(By.xpath("//span[contains(text(),'Bangalore')]"));
	  System.out.println(suggestion.size());
	  for(WebElement z:suggestion)
	  {
		  System.out.println(z.getText());
	  }
	  driver.quit();
	  
	  
  }
}
