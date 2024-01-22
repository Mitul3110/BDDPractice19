Feature: Search for a gym product

  Background:
    Given user should be on Argos webpage

    Scenario: User searches for Gym product

      When user accepts cookies
      And user searches for "gym products" in the search bar
      And user clicks on the search button
      Then user verifies gym products on argos page

