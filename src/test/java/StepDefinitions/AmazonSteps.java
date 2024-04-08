package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {

    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);

    @Given("User goes to amazon home page")
    public void userGoesToAmazonHomePage() {
        AmazonPages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AmazonPages.acceptCookie();
    }

    @When("Click Search box")
    public void clickSearchBox() {
        AmazonPages.clickSearchBox();
    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.writeProductName();
    }

    @When("Click Search button")
    public void clickSearchButton() {
        AmazonPages.clickSearchButton();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterForShippedByAmazon();
    }

    @When("Filter by Apple")
    public void filterByApple() {
        AmazonPages.filterByApple();
    }

    @When("Click first product on the page")
    public void clickFirstProductOnThePage() {
        AmazonPages.clickFirstProductOnThePage();
    }

    @When("Add to cart")
    public void addToCart() {
        AmazonPages.addToCart();
    }

    @Then("Check the cart page")
    public void checkTheCartPage() {
        AmazonPages.checkTheCartPage();
    }
}
