package actions;
import driverss.seleniumdriver;
import findelement.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/12.
 */
public class Actions  extends seleniumdriver{
    //打开网址
    public static void get(String url){
        driver.get(url);
    }
    //点击
    public static void  click(By by){

        Element.findelement(by).click();
    }
    //文本框输入方法
    public static void sendText(By by,String text){
       WebElement ef= Element.findelement(by);
        ef.clear();
        ef.sendKeys(text);
    }
    //获取文本
    public static void gettext(By by){
        String  text =Element.findelement(by).getText();
        System.out.print(text);
    }
    //获取多个文本
    public static ArrayList gettexts(By by){
        ArrayList arrayList =new ArrayList();
        List<WebElement> list = Element.findelements(by);
        for (int i = 0; i <list.size() ; i++) {
           String tests= list.get(i).getText();
            arrayList.add(tests);
        }
        return arrayList;
    }
    public static void big(){
        driver.manage().window().setSize(new Dimension(1300,700));
        driver.manage().window().maximize();
    }

    //

}
