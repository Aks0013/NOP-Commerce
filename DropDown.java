import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class  DropDown{
	public static void main(String[] args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		int a;
		int i;
		for(i=0;i<4;i++)
		{
			System.out.println("Enter the choice:");
			a=sc.nextInt();
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement search=driver.findElement(By.id("dropdown-class-example"));
			Select drpDown=new Select(search);
			Thread.sleep(2000);
			
		switch(a)
		{
		case 1: drpDown.selectByIndex(1);
				Thread.sleep(2000);
				driver.quit();
				break;
		case 2: drpDown.selectByValue("option1");
				Thread.sleep(2000);
				driver.quit();
				break;
		case 3: drpDown.selectByVisibleText("Option3");
				Thread.sleep(2000);
				driver.quit();
				break;
		default: driver.quit();
				 System.out.println("Invalid choice");
	}
}
	}
}
