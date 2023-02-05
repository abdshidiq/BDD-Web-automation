package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {

    public static WebDriver driver;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement vrfyLandingPage;
    public boolean verifyLandingPage(){
        vrfyLandingPage.isDisplayed();
        return true;
    }

    //select dropdown to sort product
    //get element locator select dropdown to sort product
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;
    public void sortProduct(String sort){
        Select dropdown = new Select(selectContainer);
        dropdown.selectByVisibleText(sort);
    }


    //add item Test.allTheThings() T-Shirt (Red)
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basket1;
    public void clickBasket1(){
        basket1.click();
    }

    //add item Sauce Labs Onesie
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basket2;
    public void clickBasket2(){
        basket2.click();
    }

    //Verify checkout cart
    @FindBy(xpath = "//span[.='Your Cart']")
    private WebElement displayCheckOutPage;
    public boolean displayCheckOutPage(){
        displayCheckOutPage.isDisplayed();
        return true;
    }

    // added item was added to shoping cart
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement addTochart;
    public void clickaddChart(){
        addTochart.click();
    }

    //checks if the specified product is visible in the shopping cart
    @FindBy(id = "cart_contents_container")
    private WebElement containerCartContent;
    public boolean displayProduct(String products) {
        boolean dataReturn = false;
        String[] listOfProduct = products.split(",");
        WebElement product;
        for (String productName:
                listOfProduct) {
            product = containerCartContent.findElement(By.xpath("//div[text()='"+ productName +"']"));
            dataReturn = product.isDisplayed();
            if (!dataReturn){
                return false;
            }
        }
        return dataReturn;
    }

    //remove the product from the shopping cart
    public void removeToCartContainer(String products) {
        String[] listOfProduct = products.split(",");
        WebElement selectedProduct;
        for (String productName:
                listOfProduct) {
            String xPathSelectedProduct = "//button[@id='remove-"+productName.toLowerCase().replace(" ", "-")+"']";
            selectedProduct = containerCartContent.findElement(By.xpath(xPathSelectedProduct));
            selectedProduct.click();
        }
    }

    //Remove 1 item from Cart Page
//    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
//    private WebElement removeItem;
//    public void clicksetRemoveItem(){
//        removeItem.click();
//    }

    //check out the selected product
    @FindBy(id = "checkout")
    private WebElement checkOut;
    public void setCheckOutProduct() {checkOut.click();}

    //Input Data in Checkout Info in the page CHECKOUT: YOUR INFORMATION
    //First Name
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement fisrtName;
    public void setFisrtName(String firstname){
        fisrtName.sendKeys(firstname);
    }

    //Last Name
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public void setLastName(String lastname){
        lastName.sendKeys(lastname);
    }

    //Zip/Postal Code
    //Last Name
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    public void setPostalCode(String postalcode){
        postalCode.sendKeys(postalcode);
    }

    //click continue button
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement cntnButton;
    public void clickCtnButton(){ cntnButton.click(); }


    //verify the corect of total price
    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement vrfyCorectPrice;
    public boolean verifyCorectPrice(){
        vrfyCorectPrice.isDisplayed();
        return true;
    }


    //check the total details on the payment summary page, if all three elements are visible then it will
    //return a "true" value if one of the elements is not visible it will return a "false" value
    @FindBy(xpath = "//div[contains(text(),'Item total:')]")
    private WebElement  detailItemTotal;
    @FindBy(xpath = "//div[contains(text(),'Tax:')]")
    private WebElement  detailTax;
    @FindBy(xpath = "//div[contains(text(),'Total:')]")
    private WebElement  detailTotal;
    public boolean displayDetailTotalCheckOutSummaryPage(){
        return detailItemTotal.isDisplayed() && detailTax.isDisplayed() && detailTotal.isDisplayed();
    }

    //click "finish" button to finish shopping
    @FindBy(id = "finish")
    private WebElement buttonFinishCheckOut;
    public void clickButtonFinish(){
        buttonFinishCheckOut.click();
    }

    //verify user alredy in checkout complete
    @FindBy(xpath = "//span[.='Checkout: Complete!']")
    private WebElement displayCheckOutCompletePage;
    public boolean displayCheckOutCompletePage(){
        return displayCheckOutCompletePage.isDisplayed();
    }

}
