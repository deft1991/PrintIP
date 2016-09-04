import org.junit.Before;
import org.junit.Test;

/**
 * Created by οκ on 04.09.2016.
 */
public class TestPrintIP {
  static PrintIP pip;
    @Before
    public void initilize(){
         pip = new PrintIP();
    }
    @Test
    public void myPrintIp(){
        pip.myPrintIp("192.168.0.1","192.168.0.5");
        pip.myPrintIp("192.168.0.9","192.168.0.13");
        pip.myPrintIp("192.168.0.14","192.168.0.10");
    }
}
