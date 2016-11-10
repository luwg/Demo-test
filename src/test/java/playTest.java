import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luweigang on 16/11/9.
 */
public class playTest {

    @Test
    public void testSayHello() throws Exception {
        Play play = new Play();
        Assert.assertEquals(play.sayHello("hello"),"hello");
    }
}