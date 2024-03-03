Feature: User Registeration

Scenario Outline: user registeration with different data
Given User is on registeration data
When User enters following user details
    Examples:
| naveen | automation | nav@gmail.com | 33333 | bangalore |
| praveen | manual | prav@gmail.com | 4424 | Hyde |
| navet | api | navet@gmail.com | 45425 | delhi | 