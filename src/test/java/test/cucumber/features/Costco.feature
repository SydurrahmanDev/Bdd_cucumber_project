@Costco
Feature: costco locations validation

  Scenario:queens locator near me validation
    Given i want to browser costco open
    When Click the locations click
    Then put my zip code and click find
    Then Queens would be visible
