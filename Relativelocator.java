import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Relativelocator {
	WebDriver driver=null;
  @SuppressWarnings("deprecation")
@BeforeMethod
  public void invokeBrowser() {
	  ChromeOptions co=new ChromeOptions();
	  co.setBrowserVersion("116");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      }
  @Test(groups={"TEST1"})
  public void site()
  {
	  driver.get("https://login.salesforce.com/");
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	  search.sendKeys("akash");
	  WebElement password=driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"password\"]")).below(search));
	  password.sendKeys("akash321");
  }
  @Test(groups={"TEST2"})
  public void go()
  {
	 driver=new ChromeDriver();
	 driver.get("https://www.google.co.in/");
	 WebElement search=driver.findElement(By.id("APjFqb"));
	 search.sendKeys("Asia Cup 2023");
	 search.click();
  }
  
}
