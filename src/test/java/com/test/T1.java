package com.test;

import actions.Actions;
import driverss.seleniumdriver;
import findelement.Element;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/10/30.
 */

//
public class T1 {
    @BeforeTest
    public static void   open(){
        seleniumdriver.open("chrome");
        Actions.get("http://192.168.1.83:8080/TKP-Platform/frame/index.jsp");
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
        Thread.sleep(4000);
        Element.findelement(By.id("btnLogin")).click();
        Element.findelement(By.xpath("//*[@data-id=\"1\"]")).click();
        Element.findelement(By.linkText("费用申请")).click();
        Element.findelement(By.linkText("出差申请")).click();

    }
}
