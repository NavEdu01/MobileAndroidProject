@IOlisting
Feature: Android Mobile app test to check the IOlistings
@listItem1
  Scenario: This scenario is to create 2 new lists and Add new items for the lists created and delete an item from the list.

  Given I Navigate to IOlistings android app on virtual device
    When I select and create a new list "Fruits"
#    Then I create new items for list "Fruits"
#    |Items|
#    |     |
#    |     |
#    When I select and create a new list "Vegetables"
#    Then I create new items for list "Vegetables"
#     |Items|
#     |     |
#     |     |
#    When I delete items from the list ""
#    |Items|
#    |     |
#@listItem2
#  Scenario: Create a list and add items, sort the list and validate the sorting of the list items.
#    Given I login to android app on virtual device
#    When I navigate to IOListings app
#    When I select and create a new list "Fruits"
#    Then I create new items for list "Fruits"
#      |Items|
#      |     |
#      |     |
#    When I sort the list
#    When I sort the list items