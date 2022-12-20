package mipt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {
    private final App app = new App();

    @Test
    public void testApp() {
        Assertions.assertEquals(49, app.mul(7, 7));
    }

}
