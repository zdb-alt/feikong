package com.test;

import actions.Actions;
import driverss.seleniumdriver;
import findelement.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static driverss.seleniumdriver.driver;

/**
 * Created by Administrator on 2018/10/30.
 */

//
public class T1{
    @BeforeTest
    public static void   open(){
        seleniumdriver.open("chrome");
        Actions.get("http://192.168.1.83:8080/TKP-Platform/frame/index.jsp");
        Actions.big();
    }
    @AfterTest
    public  static  void closd(){
        Actions.quit();
    }
    @Test
    public  static  void test() throws InterruptedException {
        Element.findelement(By.linkText("确定")).click();
        Element.findelement(By.xpath("//*[@id=\"Myusername\"]")).sendKeys("zhangdb");
        Element.findelement(By.xpath("//*[@id=\"txtpwd\"]")).sendKeys("tkp123456");
        Element.findelement(By.xpath("//*[@id=\"txtCode\"]")).clear();
        Thread.sleep(8000);
        Element.findelement(By.id("btnLogin")).click();
        Element.findelement(By.xpath("//*[@data-id=\"1\"]")).click();
        Element.findelement(By.linkText("费用申请")).click();
        Element.findelement(By.linkText("出差申请")).click();
        WebElement fram=Element.findelement(By.id("list_228003"));
        driver.switchTo().frame(fram);
        Thread.sleep(6000);
        //点击“新增”按钮

        driver.findElement((By.id("add_228003"))).click();
        Thread.sleep(6000);
        // driver.findElement(By.xpath("//*[@id='df9fb874-ff33-4c4f-95d3-8d6e1e20a8e6']//label[1]")).click();
        //  Element.findelement(By.className("k-numeric-wrap k-state-default k-expand-padding")).sendKeys("30");
        //跳出iframe
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        //跳转到新增出差申请界面
        WebElement fram2=Element.findelement(By.xpath("//div[@class=\"layui-tab-item layui-show\"]/iframe[1]"));
        driver.switchTo().frame(fram2);
        Thread.sleep(3000);
        //勾选上“是否借款”按钮
        WebElement anniu= Element.findelement(By.id("isborrow_228003"));
        anniu.click();
        Boolean a=anniu.isSelected();
        Assert.assertTrue(a);
        //借款金额文本框输入300
         Element.findelement(By.xpath("//span[@class=\"k-numeric-wrap k-state-default k-expand-padding\"]/input")).sendKeys("300");
        //填写申请事由
        Element.findelement(By.id("memo_228003")).sendKeys("回家过年");
        //子表点击“新增”按钮
        Element.findelement(By.id("add_22800301")).click();
        //选择出行人
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[5]")).click();
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[5]/span/span/span/span")).click();
        driver.switchTo().defaultContent();
        //跳转到选择出行人界面iframe
        WebElement frame3 =Element.findelement(By.xpath("//div[@class=\"layui-layer-content\"]/iframe"));
        driver.switchTo().frame(frame3);
        Element.findelement(By.xpath("//*[@id=\"rightGrid\"]/div[2]/table/tbody/tr[2]/td[2]")).click();
        Element.findelement(By.id("okRight")).click();
        driver.switchTo().defaultContent();
        // 选择出发地
        //跳转到出差申请界面
        driver.switchTo().frame(fram2);
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[7]")).click();
        Element.findelement(By.xpath("//span[@class=\"k-widget k-header\"]/span/span/span")).click();
        driver.switchTo().defaultContent();
        WebElement frame4=Element.findelement(By.xpath("//div[@class=\"layui-layer-content\"]/iframe"));
        driver.switchTo().frame(frame4);
        Element.findelement(By.xpath("//*[@id=\"layout-right-table\"]/div[2]/table/tbody/tr[3]/td[3]")).click();
        Element.确定按钮();
        driver.switchTo().defaultContent();
        //选择目的地
        //跳转到出差申请界面
        driver.switchTo().frame(fram2);
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody//td[8]")).click();
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody//td[8]/span//span[2]//span")).click();
        driver.switchTo().defaultContent();
        WebElement frame5=Element.findelement(By.xpath("//*[@type=\"iframe\"]/div[2]/iframe"));
        driver.switchTo().frame(frame5);
        Element.findelement(By.xpath("//*[@id=\"layout-right-table\"]/div[2]/table/tbody/tr[5]/td[2]")).click();
        Element.确定按钮();
        driver.switchTo().defaultContent();
        //选择出发日期
        //跳转到出差申请界面
        driver.switchTo().frame(fram2);
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[9]")).click();
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[9]/span/span/span/span")).click();
        driver.switchTo().defaultContent();
        WebElement frame6=Element.findelement(By.xpath("//*[@class=\"layui-tab-item layui-show\"]/iframe"));
        driver.switchTo().frame(frame6);
        Element.findelement(By.linkText("14")).click();
        driver.switchTo().defaultContent();
        //返程日期
        driver.switchTo().frame(fram2);
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[10]")).click();
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[10]/span/span/span/span")).click();
        driver.switchTo().defaultContent();
        WebElement frame7=Element.findelement(By.xpath("//*[@class=\"layui-tab-item layui-show\"]/iframe"));
        driver.switchTo().frame(frame7);
        Element.findelement(By.linkText("16")).click();
        driver.switchTo().defaultContent();
        //交通工具
        driver.switchTo().frame(fram2);
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[11]")).click();
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr/td[11]/span/span/span/span")).click();
        driver.switchTo().defaultContent();
        WebElement frame8=Element.findelement(By.xpath("//*[@class=\"layui-tab-item layui-show\"]/iframe"));
        driver.switchTo().frame(frame8);
        Element.findelement(By.id("train")).click();
        Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]/table/tbody/tr[2]/td[1]/label")).click();
        Element.findelement(By.id("delete_22800301")).click();
        Element.findelement(By.linkText("确定")).click();
        //定位到的元素可以使用下列方法
        //WebElement a=Element.findelement(By.xpath("//*[@id=\"grid_22800301\"]/div[2]"));
        // org.openqa.selenium.interactions.Actions actions =new org.openqa.selenium.interactions.Actions(driver);
        // actions.dragAndDropBy(a,1000,1000).perform();
        //Thread.sleep(4000);
       //通过js实现拖拽操作（定位不到的元素）
        org.openqa.selenium.interactions.Actions actions =new org.openqa.selenium.interactions.Actions(driver);
        //actions.moveToElement(a,444,465).perform();
        JavascriptExecutor js =(JavascriptExecutor)driver;
       js.executeScript(" document.getElementsByClassName(\"k-grid-content k-auto-scrollable\")[0].scrollTo(800,0)");
        Thread.sleep(4000);
        Element.findelement(By.id("submit_228003")).click();
        Element.findelement(By.linkText("确定")).click();




    }
}
