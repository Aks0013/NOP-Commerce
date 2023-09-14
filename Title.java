import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Title extends ScreenShot{
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tcs.com/");
		String title=driver.getTitle();
		String wantedTitle="Tata Consultancy Service";
		screenShot();

		if(title.contains(wantedTitle))
		{
			System.out.println("Same Title");

		}
		else
		{
			System.out.println("Different Title");
		}
	}
}


