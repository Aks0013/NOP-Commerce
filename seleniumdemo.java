import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumdemo {
	
			public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
			    driver.get("https://www.icc-cricket.com/");
			    Thread.sleep(4000);
			    WebElement search=driver.findElement(By.id("APjFqb"));
			    search.sendKeys("Automation");
			    search.sendKeys(Keys.ENTER);
			    
			
				
			}
		
	}


