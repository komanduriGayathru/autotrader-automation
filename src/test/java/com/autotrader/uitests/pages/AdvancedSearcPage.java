package com.autotrader.uitests.pages;

import com.autotrader.uitests.genericactions.BrowserActions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvancedSearcPage extends BrowserActions {

    public AdvancedSearcPage(WebDriver driver) {
        super(driver);
    }

    private static final By noThanksPopup = By.xpath("//button[text()='No thanks']");
    private static final By zipTxtBx = By.name("zip");
    private static final By certififiedChkBox = By.cssSelector("input[value='CERTIFIED']");
    private static final By convertibleChkBox = By.cssSelector("input[value='CONVERT']");
    private static final By startYearDrpDown = By.name("startYear");
    private static final By endYearDrpDown = By.name("endYear");
    private static final By makeDrpDown = By.name("makeFilter0");
    private static final By searchBtn = By.cssSelector("button[data-qaid='btn-search']");
    private static final By searchResultsCount=By.xpath("//div[contains(@data-qaid,'cntnr-listing') and @data-cmp='inventoryListing']");
    private static final By resultsCarDetails = By.xpath("//a[contains(@href,'/cars-for-sale/vehicledetails')]");



    public void searchForCar(String carToSearch,int startYear,int endYear){

        if(doesElementExists(noThanksPopup)){
            clickOnElement(noThanksPopup);
        }

        typeText(zipTxtBx,"30004");
        selectCheckBox(certififiedChkBox);
        selectCheckBox(convertibleChkBox);
        selectDowpDown(startYearDrpDown,Integer.toString(startYear));
        selectDowpDown(endYearDrpDown,Integer.toString(endYear));
        selectDowpDown(makeDrpDown,carToSearch);
        clickOnElement(searchBtn);

    }

    public void getCount(){
        int count = getElementCount(searchResultsCount);
        System.out.println("Total cars " + count);
    }

    public void validateSearchResults(){
        Assert.assertTrue("Only BMW cars should display but seems like something wrong",waitForElement(resultsCarDetails).getText().contains("BMW"));
    }
}
