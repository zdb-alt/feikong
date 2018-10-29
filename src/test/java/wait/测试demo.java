package wait;

import driverss.seleniumdriver;
import findelement.Element;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/9/18.
 */
public class 测试demo {
    @Test
    public  static  void test1(){
        seleniumdriver.open("chrome");
        actions.Actions.get("file:///C:/Users/Administrator.EDZ-20180326SSC/Desktop/demo%20(1).html");
        Element.findelement(By.xpath("//*[@id=\"select\"]/select/option[1]")).click();
        seleniumdriver.quit();

    }
}
