package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseStep {
    private WebDriver webDriver;

    public PurchaseStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on landing page")
    public void verifyLandingPage(){
        LoginPage loginPage = new LoginPage(webDriver);
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.verifyLandingPage());
    }


//    @Then("User already on landing page")
//    public void verifyLandingPage() throws InterruptedException {
//        LandingPage landingPage = new LandingPage(webDriver);
//        Assert.assertTrue(landingPage.verifyLandingPage());
//        Thread.sleep(3000);
//    }

    @And("User sort product list by \"(.*)\"")
    public void sortProductValue(String sort) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.sortProduct(sort);
        Thread.sleep(3000);

    }

    @When("User choice 2 product from the list")
    public void choiceProduct() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickBasket1();
        Thread.sleep(1500);
        landingPage.clickBasket2();
        Thread.sleep(3000);
    }


    @And("User click item To Chart")
    public void addToChart() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickaddChart();
        Thread.sleep(3000);
    }


    @Then("User already on checkout page")
    public void verifyCheckOutPage() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.displayCheckOutPage());
        Thread.sleep(3000);
    }


    @Then("User verify that \"(.*)\" as products in a list")
    public void verifyListOfProduct(String products) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.displayProduct(products));
        Thread.sleep(1500);
    }


    @When("User remove \"(.*)\" as products in a list")
    public void removeListOfProduct(String products) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.removeToCartContainer(products);
        Thread.sleep(3000);
    }


//    @And("User remove 1 item")
//    public void removeItemFromCart() throws InterruptedException {
//        LandingPage landingPage = new LandingPage(webDriver);
//        landingPage.clicksetRemoveItem();
//        Thread.sleep(3000);
//    }

    @And("User checkout the selected product")
    public void checkOutTheProduct() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setCheckOutProduct();
        Thread.sleep(3000);
    }

    @And("User input the checkout information with first name \"(.*)\" and last name \"(.*)\" then postal code \"(.*)\"")
    public void inputFirstName(String fisrtName, String lastName, String postalCode  ) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setFisrtName(fisrtName);
        landingPage.setLastName(lastName);
        landingPage.setPostalCode(postalCode);
        Thread.sleep(3000);
    }

    @And("User click the checkout button")
    public void clickBtnContinue() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickCtnButton();
        Thread.sleep(3000);
    }

    @Then("User verify the corect price")
    public void verifyCorectPricee() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.verifyCorectPrice());
        Thread.sleep(3000);
    }




    //item and tax
    @Then("User verify item total, tax, total on checkout summary page")
    public void verifyDetailTotalCheckOutSummaryPage() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.displayDetailTotalCheckOutSummaryPage());
        Thread.sleep(3000);
    }

    @And("User click button finish")
    public void clickButtonFinishCheckOut() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.clickButtonFinish();
        Thread.sleep(3000);
    }

    @Then("User already in checkout complete page")
    public void verifyCheckOutCompletePage() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.displayCheckOutCompletePage());
        Thread.sleep(3000);
    }

}
