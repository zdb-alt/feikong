package log4jj.com;

import log4j.Log4j;
import org.testng.annotations.Test;


public class Log {
    final static Log4j log=Log4j.getLogg(Log.class);
    @Test
    public  void test(){
       log.info("这是info");
       log.debug("这是debug");
       log.error("这是error");
       log.warn("这是warn");
    }
}


