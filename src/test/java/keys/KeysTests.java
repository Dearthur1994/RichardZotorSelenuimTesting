package keys;

import base.BaseTest;

import org.junit.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeysTests  extends BaseTest {
    @Test
    public void testBackSpace(){
        var keyPage= homePage.clickKeyPresses();
        keyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals("You entered: BACK_SPACE",keyPage.getResult());
    }
}
