package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton =By.xpath("/html/body/div[2]/div/div/ul/li[1]/button");
    private By triggerConfirmButton =By.xpath("/html/body/div[2]/div/div/ul/li[2]/button");
    private By triggerPromptButton =By.xpath("/html/body/div[2]/div/div/ul/li[3]/button");
    private By results = By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void setTriggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void setTriggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void setTriggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToCancel(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResults(){
        return driver.findElement(results).getText();
    }
}
