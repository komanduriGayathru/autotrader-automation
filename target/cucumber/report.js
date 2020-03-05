$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AutotraderHomePage.feature");
formatter.feature({
  "name": "Validate fields on Autotrader page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Simple Google search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@automated"
    },
    {
      "name": "@web"
    },
    {
      "name": "@autotrader"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a web browser is on the Autotrader page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.autotrader.uitests.stepdefs.AutotraderHomeSteps.a_web_browser_is_on_the_Autotrader_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "links Browser by Make,style,Advanced Search should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.uitests.stepdefs.AutotraderHomeSteps.links_Browser_by_Make_style_Advanced_Search_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search button should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.uitests.stepdefs.AutotraderHomeSteps.search_button_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dropdown list items Make and Model should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "com.autotrader.uitests.stepdefs.AutotraderHomeSteps.dropdown_list_items_Make_and_Model_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i perform advanced seach button for certified,convertible with year as 2017 to 2020",
  "keyword": "When "
});
formatter.match({
  "location": "com.autotrader.uitests.stepdefs.AutotraderHomeSteps.i_perform_advanced_seach_button_for_certified_convertible_with_year_as_to(java.lang.Integer,java.lang.Integer)"
});
