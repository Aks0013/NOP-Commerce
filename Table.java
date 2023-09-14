import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        //Table
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> header=driver.findElements(By.xpath("//table/tbody/tr/th"));
         for(WebElement head:header) {
             System.out.println(head.getText());
        }

        List<WebElement> header1=driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[1]/td[2]"));
        for(WebElement head:header1) {
            System.out.print(head.getText());
        }
	}
}
