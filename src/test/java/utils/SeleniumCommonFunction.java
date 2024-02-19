package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumCommonFunction {
    static WebDriverWait wait;
    static JavascriptExecutor jscript;
    public static void WaitElement(WebDriver driver,WebElement locator,long duration){
        wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(locator),
                ExpectedConditions.elementToBeClickable(locator)
        ));
    }
    public static void WaitElementTillVisible(WebDriver driver,WebElement locator,long duration){
        wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }
    public static void Click(WebElement locator){
        locator.click();
    }
    public static void SendKeys(WebElement locator,String text){
        locator.sendKeys(text);
    }
    public static boolean IsDisplayed(WebElement locator){
        return locator.isDisplayed();
    }
    public static boolean IsEnabled(WebElement locator){
        return locator.isEnabled();
    }

    public static String GetText(WebElement locator){
        return locator.getText();
    }
    public static String GetTitle(WebDriver driver){
        return driver.getTitle();
    }
    public static void ScrollToElement(WebDriver driver,WebElement element){

        Actions actions=new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    public static Select Selects(WebElement element){
        Select select=new Select(element);
        return select;
    }

    public static void SelectByVisibleText(Select select,String text){
        select.selectByVisibleText(text);
    }

}
