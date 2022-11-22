import mipt.sbt.App;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import io.qameta.allure.junit4.DisplayName;

public class AppTest {
    @Test
    @DisplayName("create  app")
    public void testAppConstructor() {
        try {
            new App();

        } catch (Exception e) {
            fail("Construction failed.");
        }
        assertTrue(true);
    }

}