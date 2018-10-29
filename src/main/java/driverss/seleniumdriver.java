package driverss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by XULE on 2018/9/8.
 */

public class seleniumdriver {
    public static WebDriver driver;
    public static WebDriver open(String browser){
               String path= System.getProperty("user.dir");
            if(browser.equals("chrome")){
                System.setProperty("webdriver.chrome.driver",path+"/driver/chromedriver.exe");
                driver = new ChromeDriver();
            }else if(browser.equals("ie")){
                System.setProperty("webdriver.ie.driver",path+"/drivers/iedriver.exe");
                driver=new InternetExplorerDriver();
            }else if(browser.equals("firefox")){
              // System.setProperty("webdriver.firefox.driver",path+"/drivers/geckodriver.exe");
                driver=new FirefoxDriver();
            }else {
                System.out.print("你传入的浏览器有误" + browser);
            }
        return null;
    }
           public static  void quit(){
             driver.quit();
    }
}
