package Sjtesting;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
    static WebDriver driver=null;
    @SuppressWarnings("deprecation")
	public void invokeBrowser()
    {
        /*
         * ChromeOptions co = new ChromeOptions(); co.setBrowserVersion("116");
         */
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);   
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }
    
    public void closeBrowser() throws InterruptedException//close browser function
    {
        Thread.sleep(2000);
        driver.close();
    }
    
    
}
