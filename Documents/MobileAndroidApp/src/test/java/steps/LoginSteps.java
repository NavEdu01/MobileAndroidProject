package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageFiles;
import util.CommonObjects;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

public class LoginSteps extends CommonObjects {
    PageFiles pageFiles = new PageFiles();
    CommonObjects commonObjects  = new CommonObjects();

    @Given("^I Navigate to IOlistings android app on virtual device$")
    public void I_Navigate_to_IOlistings_android_app_on_virtual_device() throws MalformedURLException {
        commonObjects.launchApp();
    }

    @Then("I create new items for list {string}")
    public void iCreateNewItemsForList(String arg0, List<Map<String, String>> testData) {
        for(int i=0; i<testData.size(); i++)
        pageFiles.selectNewItemList(testData.get(i).get("Items"));
    }

    @When("I select and create a new list {string}")
    public void iSelectAndCreateANewList(String arg0) throws InterruptedException {
       // pageFiles.selectAddItemBottomLayout();
        pageFiles.selectNewList(arg0);
    }

    @When("I delete items from the list {string}")
    public void I_delete_items_from_the_list(String selectItem){
        pageFiles.selectAddedItem(selectItem);
        pageFiles.deleteSelection();
    }

    @When("I sort the list {string} with order {string}")
    public void I_sort_the_list(String listType,String order){
        pageFiles.selectListFromMenu(listType);
        pageFiles.sortItems(listType,order);
    }

    @Then("I select list from menu {String}")
    public void I_select_list_from_menu(String listType){
        pageFiles.selectListFromMenu(listType);
       // pageFiles.verifySelectedListItemSorting();
    }

}
