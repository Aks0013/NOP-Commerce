import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement Drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement Drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions ask=new Actions(driver);
		ask.dragAndDrop(Drag,Drop).perform();	
	}
}