package com.autotrader.uitests.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "junit:target/cucumber.xml"},
        features = "src/test/resources/features/AutotraderHomePage.feature",
        glue = {"com.autotrader.uitests.stepdefs"})
public class AutoTraderTestRunner {
}
