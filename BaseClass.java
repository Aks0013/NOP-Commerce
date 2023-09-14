import java.io.IOException;
import org.openqa.selenium.By;
public class BaseClass extends ScreenShot{
	public static void main(String[] args) throws IOException, InterruptedException {
		invokeBrowser("chrome");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		screenShot();
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		String title = driver.getTitle();
		System.out.println(title);
		closeBrowser();	
	}
}