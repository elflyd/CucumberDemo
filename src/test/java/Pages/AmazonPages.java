package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Util.ElementHelper;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public AmazonPages(WebDriver driver){
        this.driver= driver;
        this.wait= new WebDriverWait(driver, 10);
        this.elementHelper= new ElementHelper(driver);

    }

    static By accept_cookie = By.id("sp-cc-accept");
    static By search_box = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By clickFilter = By.xpath("//*[@id=\"p_98/21345978031\"]/span/a/div/label/i");
    static By appleFilter = By.xpath("//*[@id=\"p_123/110955\"]/span/a/span");
    static By firstProduct = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[2]/span/a/div/img");
    static By basket = By.xpath("//*[@id=\"add-to-cart-button\"]");
    static By checkBasket = By.cssSelector("#nav-cart");


    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept_cookie);
    }

    public static void clickSearchBox() {
        elementHelper.click(search_box);
    }

    public static void writeProductName() {
        elementHelper.sendKeys(search_box, "airpods");
    }
    public static void clickSearchButton() {
        elementHelper.click(searchButton);
    }


    public static void filterForShippedByAmazon() {
        elementHelper.click(clickFilter);
    }

    public static void filterByApple() {
        elementHelper.click(appleFilter);
    }

    public static void clickFirstProductOnThePage() {
        elementHelper.click(firstProduct);
    }

    public static void addToCart() {
        elementHelper.click(basket);
    }

    public static void checkTheCartPage() {
        elementHelper.click(checkBasket);
    }

}