package Sjtesting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class Screenshots {
	static WebDriver driver=null;
  @Test(groups= {"Test1"})
  public void f() throws IOException, InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/web-table-element.php#");
	  driver.manage().window().maximize();
	  screenshot();
	  Thread.sleep(3000);
	  
  }
  @Test(groups= {"Test1"})
  public void screenshot() throws IOException {
	  File akash=null;
	  akash=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Files.copy(akash, new File("./Screenshot"+"srcshot4.png"));
	  
  }
  @Test(groups= {"Test2"})
  public void go()
  {
	     driver=new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 WebElement search=driver.findElement(By.id("APjFqb"));
		 search.sendKeys("Asia Cup 2023");
		 search.sendKeys(Keys.ENTER);
  }
}
