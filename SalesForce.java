import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SalesForce{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement search=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		search.sendKeys("Akash");
		pass.sendKeys("Aks@0013");
		pass.sendKeys(Keys.ENTER);
		WebElement err=driver.findElement(By.xpath("//*[@id=\"error\"]"));
		String text=err.getText();
		System.out.println(text);
	}
}

