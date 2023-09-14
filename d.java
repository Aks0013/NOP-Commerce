import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;


public class d {
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.id("q"));
		search.sendKeys("Username");
		search.sendKeys(Keys.ENTER);
		
	}

}