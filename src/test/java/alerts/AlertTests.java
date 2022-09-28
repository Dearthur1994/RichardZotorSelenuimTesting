package alerts;

import base.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AlertTests extends BaseTest {
    @Test
    public void testAcceptAlert(){
        var alertsPage=homePage.clickJavaScriptAlerts();
        alertsPage.setTriggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals("You successfully clicked an alert",alertsPage.getResults());
    }
    @Test
    public void testGetTextFromAlert(){
       var alertsPage=homePage.clickJavaScriptAlerts();
       alertsPage.setTriggerConfirm();
       String text = alertsPage.alert_getText();
       alertsPage.alert_clickToCancel();
       assertEquals( "I am a JS Confirm", text);
    }
    @Test
    public void testSetTestInputAlert(){
       var alertsPage= homePage.clickJavaScriptAlerts();
       alertsPage.setTriggerPrompt();
       String text = "TAU rocks!";
       alertsPage.alert_setInput(text);
       alertsPage.alert_clickToAccept();
       assertEquals("You entered: " +text, alertsPage.getResults());

    }
}
