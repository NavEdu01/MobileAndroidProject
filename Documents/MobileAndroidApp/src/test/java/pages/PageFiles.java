package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.CommonObjects;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class PageFiles extends CommonObjects {

    @FindBy(xpath = "//org.openintents.shopping:id/layout_choice_bottom")
    public WebElement bottomLayout;

    @FindBy(xpath = "//android.widget.ImageButton")
    public WebElement menuButton;

    @FindBy(xpath = "//org.openintents.shopping:id/list_items")
    public WebElement newList;

    @FindBy(xpath = "//org.openintents.shopping:id/edittext")
    public WebElement enterList;

    @FindBy(xpath = "//android.widget.Button")
    public WebElement addList;

    @FindBy(xpath = "//android.widget.EditText")
    public WebElement enterItemText;

    @FindBy(xpath = "//android.widget.Button")
    public WebElement addItem;

    // @FindBy(xpath ="//org.openintents.shopping:id/check")
    //public WebElement selectItem;

    @FindBy(xpath = "//android.widget.TextView and @content-desc[contains(text(),'Clean up list')]")
    public WebElement deleteSelection;//More options

    @FindBy(xpath = "//android.widget.TextView and @content-desc[contains(text(),'More options')]")
    public WebElement selectMoreOptions;

    @FindBy(xpath = "//android.widget.TextView[@text()='Settings']")
    public WebElement selectSettings;

    @FindBy(xpath = "//android.widget.TextView[@text()='Sort order']")
    public WebElement selectSortOrder;

    public void selectAddItemBottomLayout() throws InterruptedException {
        waitUntilTheElementIsClickable(bottomLayout);
        bottomLayout.click();
    }

    public void selectNewList(String arg1) {
        waitUntilTheElementIsClickable(menuButton);
        menuButton.click();
        waitUntilTheElementIsClickable(newList);
        newList.click();
        enterList.clear();
        enterList.sendKeys(arg1);
        addList.click();
    }

    public void selectNewItemList(String testData) {
        waitUntilTheElementIsClickable(enterItemText);
        enterItemText.sendKeys(testData);
        addItem.click();
    }

    public void selectAddedItem(String selectItem) {
        String xpath = "//org.openintents.shopping:id/check[contains(text()," +selectItem + "]";
        WebElement obj = driver.findElement(By.xpath(xpath));
        obj.click();
    }

    public void deleteSelection() {
        waitUntilTheElementIsClickable(deleteSelection);
        deleteSelection.click();
    }

    public void selectListFromMenu(String listSelection) {
        waitUntilTheElementIsClickable(menuButton);
        menuButton.click();
        String xpath = "//org.openintents.shopping:id/check[contains(text()," +listSelection + "]";
        WebElement obj = driver.findElement(By.xpath(xpath));
        obj.click();
    }

    public void selectSortType(String sortType) {
        String xpath = "//android.widget.CheckedTextView[contains(text()," +sortType + "]";
        WebElement obj = driver.findElement(By.xpath(xpath));
        obj.click();
    }

    public void sortItems(String listType,String order) {
        waitUntilTheElementIsClickable(selectMoreOptions);
        selectMoreOptions.click();
        selectSettings.click();
        selectSortOrder.click();
        selectSortType(order);
        driver.navigate().back();
        waitUntilTheElementIsClickable(menuButton);
        menuButton.click();
        selectListFromMenu(listType);
    }
    //TODO
 /*   public void verifySelectedListItemSorting(List<String, String> expectedData) {
        String xpath = "";
        List<WebElement> objElements = (List<WebElement>) driver.findElement(By.xpath(xpath));
        for (WebElement element : objElements) {
            assertEquals("expected text"expectedData.get(""));
            assertEquals();
        }*/
    }