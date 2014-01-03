import cnn.Base;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Jamal
 * Date: 1/2/14
 * Time: 6:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBase extends Base {
    @Test
    public void open() {
       System.out.println("hello");
               click();
    }


}
