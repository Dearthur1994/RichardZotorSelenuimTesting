package base;

import com.google.common.io.Files;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    private static WebDriver driver;
    public static HomePage homePage;
    @BeforeClass
//    Setting up the executable file for webdriver to run
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        instatiate the webdriver
        driver = new ChromeDriver();
        goHome();
    }
    static void goHome(){
//        setting up the webdriver to interact with the browser
        driver.get("https://the-internet.herokuapp.com/");
        homePage= new HomePage(driver);
    }
    @AfterClass
//    closing down the page after a test run
    public static void tearDown(){
        driver.quit();
    }
};
