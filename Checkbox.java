package Sjtesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
  @SuppressWarnings("deprecation")
@Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  List <WebElement> checkbox=driver.findElements(By.cssSelector("input[type='checkbox']"));
      System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText());
	  System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());
	  System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText());
	  for(WebElement k:checkbox)
	  {
		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  k.click();
	  }
	
	  driver.quit();
	  
  }
}
