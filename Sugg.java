import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Sugg {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Chinnaswamy stadium");
		Thread.sleep(3000);
		List <WebElement> suggestion = driver.findElements(By.xpath("//span[contains(text(),'chinnaswamy stadium')]"));
		for(WebElement i:suggestion) {
		  if(i.getText().contains("chinnaswamy stadium capacity")) {
			 i.click();
		 }
	 }
	
		
		
		
		
	}

}
