package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//the area to have access to after a successful login.

public class SecureAreaPage {
    private WebDriver driver;
    private By statusAlert = By.id("flash");

//    constructor used in instatiating the webdriver to communicate with the browser
    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }
//get the text from the secured Area page indicating that we have successfully logged in
    public String getStatusAlert(){
       return driver.findElement(statusAlert).getText();

    }
}
