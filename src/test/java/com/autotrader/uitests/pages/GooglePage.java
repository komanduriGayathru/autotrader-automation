package com.autotrader.uitests.pages;

import com.autotrader.uitests.genericactions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GooglePage extends BrowserActions {

    private static final String GOOGLE_HOME_URL = "https://www.google.com/";
    private static final By BY_SEARCH_FIELD = By.name("q");

    public GooglePage(WebDriver driver) {
        super(driver);
    }
    public void navigateToHomePage() {
        getDriver().navigate().to(GOOGLE_HOME_URL);
    }

    public void enterSearchPhrase(String phrase) {
        WebElement ele = waitForElement(BY_SEARCH_FIELD);
        typeText(BY_SEARCH_FIELD,phrase);
        ele.sendKeys(phrase);
        ele.submit();
    }

    public boolean pageTitleContains(String phrase) {
        try {
            return driverWait(5).until(ExpectedConditions.titleContains(phrase));
        } catch (TimeoutException ex) {
            return false;
        }
    }
}
