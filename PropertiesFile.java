import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class PropertiesFile {
	public static void main(String[] args) throws IOException, InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		FileInputStream reader=new FileInputStream("./Property/usercredentials.properties");
		Properties prop=new Properties();
		prop.load(reader);
		
		String u=prop.getProperty("Username");
		String p=prop.getProperty("Password");
		
		
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys(u);
	    WebElement pass=driver.findElement(By.id("password"));
	    pass.sendKeys(p);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
