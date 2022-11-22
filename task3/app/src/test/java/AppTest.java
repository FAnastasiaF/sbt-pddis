import mipt.sbt.App;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AppTest {
    @Test
    public void testAppConstructor() {
        try {
            new App();

        } catch (Exception e) {
            fail("Construction failed.");
        }
        assertTrue(true);
    }

}