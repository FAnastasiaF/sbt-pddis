package mipt;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    private final App app = new App();

    @Test
    public void testApp() {
        Assert.assertEquals(49, app.mul(7, 7));
    }

}
