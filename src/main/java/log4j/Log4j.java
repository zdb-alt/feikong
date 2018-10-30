package log4j;

import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by XULE on 2018/10/20.
 */
public class Log4j {
    private static org.apache.log4j.Logger logger=null;
    private  static Log4j logg=null;
    public static   Log4j getLogg(Class<?> T){
        if(logger==null){
            //实例化Properties类，处理properties格式文件
            Properties pops=new Properties();
            try{
                String path=System.getProperty("user.dir");
                String filepath=path+"/.idea/config/log4j.properties";
                InputStream is=new FileInputStream(filepath);
                pops.load(is);
            }catch(IOException e){
                e.printStackTrace();
            }
            PropertyConfigurator.configure(pops);
            logger= org.apache.log4j.Logger.getLogger(T);
            logg=new Log4j();
        }
        return logg;

    }
    public  void info(String msg){
        logger.info(msg);
    }
    public  void debug(String msg){
        logger.debug(msg);
    }
    public  void warn(String msg){
        logger.warn(msg);
    }
    public void error(String msg){
        logger.error(msg);
    }


}

