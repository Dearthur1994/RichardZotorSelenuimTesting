package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField= By.id("username");
    private By passwordField= By.id("password");
    private By loginButton= By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }
//    setting up method to send various keys to login to the login page
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

//    setting up method that allows you to login when you click on the login button on the page.
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
