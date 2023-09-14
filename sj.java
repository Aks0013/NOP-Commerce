import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class sj {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriver driver=new ChromeDriver();
		  driver.get("https://book.spicejet.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  WebElement currency=driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
		  Select drpDown=new Select(currency);
		  Thread.sleep(2000);
		  drpDown.selectByVisibleText("INR");
		  WebElement from=driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"));
		  from.click();
		  WebElement departurecity=driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a"));
		  departurecity.click();
		  WebElement to=driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT\"]"));
		  to.click();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  WebElement arrivalcity=driver.findElement(By.xpath("(//a[@value='BLR'])[2]"));
		  arrivalcity.click();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  WebElement date=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[3]"));
		  date.click();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  WebElement passengers=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		  passengers.click();
		  WebElement selectpass=driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']"));
		  Select drpDown1=new Select(selectpass);
		  drpDown1.selectByValue("2");
		  passengers.click();
		  WebElement search=driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit']"));
		  search.click();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  File s=null;
		  s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(s, new File("./screenshot/"+"srcshot2.png"));
		  driver.quit();
		  
		  
		  
		   
	}

}
