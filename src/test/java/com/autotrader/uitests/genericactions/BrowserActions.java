package com.autotrader.uitests.genericactions;

import com.autotrader.uitests.framework.AbstractPandaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions extends AbstractPandaPage {

    private static WebDriver driver;

    public BrowserActions(WebDriver driver) {
        super(driver);
        BrowserActions.driver = driver;
    }

    public static void clickOnElement(WebDriver driver, By by){
        waitForElement(driver,by).click();
    }

    public static void typeText(WebDriver driver, By by,String textToType){
        waitForElement(driver,by).sendKeys(textToType);
    }

    public static void selectCheckBox(By by){
        WebElement element = waitForElement(by);
        if(!element.isSelected()){
            element.click();
        }
    }

    public static WebElement waitForElement(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    public static void selectDowpDown(By by,String textToSelect){
        WebElement ele = waitForElement(by);
        if(ele!=null){
            Select select = new Select(ele);
            select.selectByVisibleText(textToSelect);
        }
    }

    public static void clickOnElement(By by){
        waitForElement(by).click();
    }
    public static void typeText(By by,String textToType){
        waitForElement(by).sendKeys(textToType);
    }
    public static WebElement waitForElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static boolean doesElementExists(By by) {
        return driver.findElements(by).size() > 0;
    }
    public int getElementCount(By by){
        return  driver.findElements(by).size();
    }
}
