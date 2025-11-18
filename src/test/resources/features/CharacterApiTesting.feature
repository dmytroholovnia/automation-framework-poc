Feature: Character API Testing

  Scenario: Search characters by name
    When I send GET request to character by name "rick"
    Then response status should be 200
    And results should contain characters with "rick" in name

  Scenario: Handle invalid character ID
    When I send GET request to character by id 99999
    Then response status should be 404
    And response should contain error message