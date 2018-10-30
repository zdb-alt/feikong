package actionss;


import actions.Actions;
import driverss.seleniumdriver;
import findelement.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static driverss.seleniumdriver.driver;

/**
 * Created by Administrator on 2018/9/12.
 */
public class Acctions {
    @Test
    public  void click(){
        seleniumdriver.open("chrome");
        actions.Actions.get("http://baidu.com");
        actions.Actions.sendText(By.id("kw"),"selenium");
        actions.Actions.click(By.id("su"));
        seleniumdriver.quit();
    }
    @Test
    public  void gettext(){
        seleniumdriver.open("chrome");
        actions.Actions.get("http://baidu.com");
        actions.Actions.gettext(By.name("tj_trhao123"));
        seleniumdriver.quit();
    }
    @Test
    public void getexts(){
        seleniumdriver.open("chrome");
        actions.Actions.get("http://baidu.com");
        ArrayList list= actions.Actions.gettexts(By.xpath("//*[@id=\"u1\"]/a"));
        for (int i = 0; i <list.size() ; i++) {
        }
        System.out.print(list.get(1));
        seleniumdriver.quit();
    }

    //@Test
    //出差申请单据
//    public void laxia() throws InterruptedException {
//        //打开谷歌浏览器
//        seleniumdriver.open("chrome");
//        //打开测试网址
//        Actions.get("http://192.168.1.83:8080/TKP-Platform/frame/index.jsp");
//        //全屏
//        Actions.big();
//        //验证码界面弹框点击确定
//        Element.findelement(By.linkText("确定")).click();
//        //输入账号密码
//        Element.findelement(By.xpath("//*[@id=\"test1\"]/input[1]")).sendKeys("zhangdb");
//        Element.findelement(By.xpath("//*[@class=\"item pwd\"]/input[1]")).sendKeys("tkp123456");
//        Thread.sleep(4000);
//        //点击登录按钮
//        Element.findelement(By.id("btnLogin")).click();
//        //选择费用申请菜单下面的出差申请
//        Element.findelement(By.linkText("费用申请")).click();
//        Element.findelement(By.linkText("出差申请")).click();
//        //跳转到出差申请界面iframe
//        WebElement fram=Element.findelement(By.id("list_228003"));
//        driver.switchTo().frame(fram);
//        Thread.sleep(6000);
//        //点击“新增”按钮
//        driver.findElement((By.id("add_228003"))).click();
//        Thread.sleep(6000);
//       // driver.findElement(By.xpath("//*[@id='df9fb874-ff33-4c4f-95d3-8d6e1e20a8e6']//label[1]")).click();
//      //  Element.findelement(By.className("k-numeric-wrap k-state-default k-expand-padding")).sendKeys("30");
//        //跳出iframe
//        driver.switchTo().defaultContent();
//        Thread.sleep(3000);
//        //进入新增出差申请界面iframe
//        WebElement fram2=Element.findelement(By.xpath("//div[@class=\"layui-tab-item layui-show\"]/iframe[1]"));
//        driver.switchTo().frame(fram2);
//        Thread.sleep(3000);
//        //借款金额文本框输入300
//        WebElement qian=Element.findelement(By.xpath("//span[@class=\"k-numeric-wrap k-state-default k-expand-padding\"]/input"));
//        //qian.clear();
//        qian.sendKeys("300");
//        //勾选上“是否借款”按钮
//        WebElement anniu= Element.findelement(By.id("isborrow_228003"));
//        anniu.click();
//        Boolean a=anniu.isSelected();
//        Assert.assertTrue(a);
//        //填写申请事由
//        Element.findelement(By.id("memo_228003")).sendKeys("回家过年");
//        //子表点击“新增”按钮
//        Element.findelement(By.id("add_22800301")).click();
//        //选择出行人
//        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[5]")).click();
//        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[5]/span/span/span/span")).click();
//        driver.switchTo().defaultContent();
//        //跳转到选择出行人界面iframe
//        WebElement frame3 =Element.findelement(By.xpath("//div[@class=\"layui-layer-content\"]/iframe"));
//        driver.switchTo().frame(frame3);
//        Element.findelement(By.xpath("//*[@id=\"rightGrid\"]/div[2]/table/tbody/tr[2]/td[2]")).click();
//        Element.findelement(By.id("okRight")).click();
//       driver.switchTo().defaultContent();
//        // 选择出发地
//      // 跳转到出差申请界面iframe
//        driver.switchTo().frame(fram2);
//        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[7]")).click();
//        Element.findelement(By.xpath("//span[@class=\"k-widget k-header\"]/span/span/span")).click();
//        driver.switchTo().defaultContent();
//        WebElement frame4=Element.findelement(By.xpath("//div[@class=\"layui-layer-content\"]/iframe"));
//        driver.switchTo().frame(frame4);
//        Element.findelement(By.xpath("//*[@id=\"layout-right-table\"]/div[2]/table/tbody/tr[3]/td[3]")).click();
//        Element.findelement(By.linkText("确定")).click();
//
//
//
//    }

}
