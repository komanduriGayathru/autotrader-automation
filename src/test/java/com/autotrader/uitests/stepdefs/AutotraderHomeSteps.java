package com.autotrader.uitests.stepdefs;

import com.autotrader.uitests.pages.AdvancedSearcPage;
import com.autotrader.uitests.pages.AutotraderHomepage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutotraderHomeSteps {

    private WebDriver driver;
    private AutotraderHomepage autotraderHomepage;
    private AdvancedSearcPage advancedSearcPage;

    @Before(value = "@web", order = 1)
    public void initWebDriver() throws Throwable {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Before(value = "@autotrader", order = 10)
    public void initGooglePage() throws Throwable {
        autotraderHomepage = new AutotraderHomepage(driver);
    }

    @Given("a web browser is on the Autotrader page")
    public void a_web_browser_is_on_the_Autotrader_page() {
        // Write code here that turns the phrase above into concrete actions
        autotraderHomepage.navigateToHomePage();
    }

    @Then("links Browser by Make,style,Advanced Search should be visible")
    public void links_Browser_by_Make_style_Advanced_Search_should_be_visible() {
        // Write code here that turns the phrase above into concrete actions
        autotraderHomepage.validateLinkElements();

    }

    @Then("Search button should be visible")
    public void search_button_should_be_visible() {
        autotraderHomepage.validateSearchButton();
    }

    @Then("Dropdown list items Make and Model should be visible")
    public void dropdown_list_items_Make_and_Model_should_be_visible() {
       autotraderHomepage.validateDropdownLists();
    }

    @When("i perform advanced seach button for certified,convertible with year as {int} to {int}")
    public void i_perform_advanced_seach_button_for_certified_convertible_with_year_as_to(Integer int1, Integer int2) {
            advancedSearcPage = autotraderHomepage.clickOnAvancedSeach();
            advancedSearcPage.searchForCar("BMW",2017,2020);
            advancedSearcPage.getCount();
            advancedSearcPage.validateSearchResults();
    }

    @Then("i should be able to see only BMW cars in the results page")
    public void i_should_be_able_to_see_only_BMW_cars_in_the_results_page() {
        System.out.println("Hello");
    }
}
