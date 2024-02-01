Feature: Virgingames bingo data

  As a User I Want to Get All Bingo Jackpot Data From Virgingames Api

  Scenario: As a User I Want to Verify all Jackpot Bingo Data

    When : I send a Get request
    Then : I get vaild response code 200
    And : I verify currency GBP in bingo data
    And : I verify name is Enterprise in bingo data
