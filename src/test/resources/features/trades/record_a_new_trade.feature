Feature: Record a new trade

  Scenario: Each trade has a unique ID
    Given the following trade:
      | Firstname | Lastname | Email           | Password | Social_LoginId | Social_LoginType | IsSocial | Phone       |
      | test      | test     | testsd@test.com | 10000    | 0              | 0                | true     | 09876543210 |
    When I record the trade
    Then the recorded trade should include the following details:
      | security | buySell | quantity | priceInCents | totalCostInCents |
      | APPL     | BUY     | 10       | 10000        | 100000           |

#
#  {
#  "Firstname": "test",
#  "Lastname": "test",
#  "Email": "test@test.colm",
#  "Password": "test",
#  "Social_LoginId": "0",
#  "Social_LoginType": "0",
#  "IsSocial": true,
#  "Phone": "9404044444"
#  }