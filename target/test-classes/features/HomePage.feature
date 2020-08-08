@web

  Feature: HomePage feature
    Background:
      Given: I am on Darksky HomePage


      @home
      Scenario: Verify min max temperature
        When I click today area on HomePage
        And I get temperatures on HomePage
        And I get min temperature on HomePage
        And I get max temperature on HomePage
        Then I verify min temperature on HomePage
        Then I verify max temperature on HomePage

