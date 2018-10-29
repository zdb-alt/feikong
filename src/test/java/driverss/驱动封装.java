package driverss;

import org.testng.annotations.Test;

/**
 * Created by XULE on 2018/9/8.
 */
public class 驱动封装 extends seleniumdriver {
    @Test
    public  static  void open(){
        seleniumdriver.open("ie");
        seleniumdriver.quit();
    }
}
