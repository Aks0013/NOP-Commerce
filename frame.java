import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Automation/html/iframpage.html");
		//Enter some text on Text box -1
		driver.findElement(By.id("t1")).sendKeys("Automation");
		
		driver.switchTo().frame(0);//frame index
		driver.findElement(By.id("t2")).sendKeys("Inside T2 text box");	
		Thread.sleep(2000);
		driver.findElement(By.id("t3")).sendKeys("Inside T3 text box");
		driver.switchTo().parentFrame();//switch back to main frame (parent)
		driver.findElement(By.id("t1")).clear();//clear the content
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Typing again");
		
	}

}
