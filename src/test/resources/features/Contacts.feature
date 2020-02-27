Feature: Contacts Page

  Scenario: Default page number
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates "Customers" "Contacts"
    Then default page number should be 1

  Scenario: Menu options
    Given the user logged in as a "driver"
    Then the user should see following menu options
    | Fleet      |
    | Customers  |
    | Activities |
    | System     |


  Scenario: login as a given user
    Given the user is on the login page
    When the use logs in using following credentials
      | username  | user1       |
      | password  | UserUser123 |
      | firstname | John        |
      | lastname  | Doe         |

