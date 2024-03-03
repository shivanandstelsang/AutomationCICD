Feature: Data-driven testing with Scenario Outline and Examples

  Scenario Outline: User is able to open facebook  right
    Given User is able to open facebook
  When User is able to send the password
  When click on login
    Examples:
      | name       | pswd | 
      | 9827472832   | 9373837883 |     
      | 9378378783   | 7832678823  |

