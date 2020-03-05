Feature: Validate fields on Autotrader page

  @automated @web @autotrader
  Scenario: Simple Google search
    Given a web browser is on the Autotrader page
    Then links Browser by Make,style,Advanced Search should be visible
    Then Search button should be visible
    Then Dropdown list items Make and Model should be visible
    When i perform advanced seach button for certified,convertible with year as 2017 to 2020
    Then i should be able to see only BMW cars in the results page


