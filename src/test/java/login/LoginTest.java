package login;

import base.BaseTest;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
//        click on the login Page
        LoginPage loginPage= homePage.clickFormAuthenticationLink();
//        login using the details SetUsername And SetPassword
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
//        login into the securePage when the clickloginbuton is clicked
        SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
//        if(loginPage.getPassword() == String.valueOf(false)){
//            System.out.println("loginPage");
//        }
//        justify if we have successfully logged in
        assertTrue (secureAreaPage.getStatusAlert().contains("You logged into a secure area!"));
    }
}

