import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class columnEntry {
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> header=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		for(WebElement head:header)
		{
			System.out.print(head.getText());
		}
		List<WebElement> col=driver.findElements(By.xpath("//table/tbody/tr"));
		for(WebElement column:col) {
			if(!(column.getText().equals("Testing"))||!(column.getText().equals("Selenium"))||!(column.getText().equals("Live Project"))||!(column.getText().equals("Java"))) {
			System.out.println("\n");
			System.out.println(column.getText());
		}
		}
		System.out.println("\n");
		System.out.println(col.size());
		driver.quit();
	}
}
