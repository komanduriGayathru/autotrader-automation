package com.autotrader.uitests.pages;

import com.autotrader.uitests.genericactions.BrowserActions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutotraderHomepage extends BrowserActions {

    public AutotraderHomepage(WebDriver driver) {
        super(driver);
    }

    private static final String AUTOTRADER_URL = "https://www.autotrader.com/";
    private static final By browserByMake = By.cssSelector("span[title='Browse by Make']");
    private static final By browserByStyle = By.cssSelector("span[title='Browse by Style']");
    private static final By advancedSearch = By.linkText("Advanced Search");
    private static final By searchBtn = By.id("search");
    private static final By makeDrpDwn = By.name("makeCodeListPlaceHolder");
    private static final By modelDrpDwn = By.id("modelCodeListPlaceHolder");

    public void navigateToHomePage() {
        getDriver().navigate().to(AUTOTRADER_URL);
    }


    public void validateLinkElements(){

        Assert.assertNotNull("Link Browser by Make ->"+ browserByMake + " missing on the page", waitForElement(browserByMake));
        Assert.assertNotNull("Link Browse by Style ->"+ browserByStyle + " missing on the page", waitForElement(browserByStyle));
        Assert.assertNotNull("Link Advanced Search ->"+ advancedSearch + " missing on the page", waitForElement(advancedSearch));

    }

    public void validateSearchButton(){
        Assert.assertNotNull("Search Button ->"+ searchBtn + " missing on the page", waitForElement(browserByMake));

    }

    public void validateDropdownLists(){
        Assert.assertNotNull("Make DropDown list ->"+ makeDrpDwn + " missing on the page", waitForElement(browserByMake));
        Assert.assertNotNull("Model DropwDown list ->"+ modelDrpDwn + " missing on the page", waitForElement(browserByMake));
    }

    public AdvancedSearcPage clickOnAvancedSeach(){
        clickOnElement(advancedSearch);
        return new AdvancedSearcPage(getDriver());
    }
}
