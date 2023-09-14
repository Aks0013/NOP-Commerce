import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {
	public static void main(String[] args) throws InterruptedException {  
         
        WebDriver driver = new ChromeDriver();  
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); 
        Thread.sleep(2000);
        List<WebElement> a=driver.findElements(By.name("radioButton"));
        for(WebElement radio : a)
        {
        		radio.click();
        		Thread.sleep(2000);
        		}
        
      }
}
        
        
        
         
      


