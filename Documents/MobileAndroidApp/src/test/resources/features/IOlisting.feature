@IOlisting
Feature: Android Mobile app test to check the IOlistings
@listItem1
  Scenario: This scenario is to create 2 new lists and Add new items for the lists created and delete an item from the list.

  Given I Navigate to IOlistings android app on virtual device
    When I select and create a new list "Fruits"
    Then I create new items for list "Fruits"
    |Items|
    |Apple     |
    |Banana    |
    |Orange    |
    When I select and create a new list "Vegetables"
    Then I create new items for list "Vegetables"
     |Items|
     |Carrot    |
     |Cucumber  |
    When I delete items from the list "Vegetables"
    |Items|
    |Carrot|

@listItem2
  Scenario: Create a list and add items, sort the list and validate the sorting of the list items.
    Given I Navigate to IOlistings android app on virtual device
    When I select and create a new list "Drinks"
    Then I create new items for list "Drinks"
      |Items|
      |Coke |
      |Pepsi|
      |Fanta   |
      |FruitShoot|
      |Water     |
    When I sort the list "Drinks" with order "alphabetical"
#    Then I select list from menu "Drinks"

