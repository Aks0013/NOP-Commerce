package Sjtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Sjtesting.RediffLoginPage;

public class RediffLoginTC1 {
	
	WebDriver driver=null;
    RediffLoginPage rlp;
    @SuppressWarnings("deprecation")
	@BeforeTest
    public void invokeBrowser()
    {
        /*
         * ChromeOptions co = new ChromeOptions(); co.setBrowserVersion("116");
         */
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);   
        
    }
    
    @Test
    public void rediffLogin()
    {
        rlp = new RediffLoginPage(driver);//creating the instance of rlp
        rlp.userName().sendKeys("admin");
        rlp.password().sendKeys("admin123");
        rlp.signIn().click();
        rlp.rediffHome().click();
    }
}
