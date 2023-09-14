package Sjtesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Sjtesting.Rediff;
import Sjtesting.RediffLoginPage;

public class RediffLoginTC2 extends Base{

  RediffLoginPage rlp;
  Rediff rhp;
  FileInputStream fis1;
  Properties prop;
  
    @SuppressWarnings("deprecation")
	@BeforeTest 
	public void invokeBrowser()  {
    
    driver=new ChromeDriver(); 
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
    
	try {
		fis1 = new FileInputStream("./Screenshot/Cred.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    prop = new Properties(); 
   
    try {
		prop.load(fis1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
     }
   
  @SuppressWarnings("deprecation")
@Test (enabled=true)
  public void rediffHome() throws InterruptedException, IOException
  {
      rlp = new RediffLoginPage(driver);//creating the instance of rlp
      //Property file usage
      rlp.userName().sendKeys(prop.getProperty("username"));
      rlp.password().sendKeys(prop.getProperty("password"));
      rlp.signIn().click();
      rlp.rediffHome().click();
      Thread.sleep(2000);
      rhp = new Rediff(driver);
      rhp.news().click();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      rhp.business().click();
  }
}