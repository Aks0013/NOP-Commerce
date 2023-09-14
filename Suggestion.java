import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Suggestion {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Bangalore");
		Thread.sleep(3000);
		List <WebElement> suggestion=driver.findElements(By.xpath("//span[contains(text(),'Bangalore')]"));
		System.out.println(suggestion.size());
		for(WebElement k:suggestion) {
			System.out.println(k.getText());
		}
		WebElement sugg=driver.findElement(By.xpath("//*[@id=\"ERWdKc\"]/div[1]/span"));
		sugg.click();
		driver.quit();
	}
}
