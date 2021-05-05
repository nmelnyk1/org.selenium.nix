package automationsuite;

import automationsuite.providers.DPClass;
import com.nix.core.driver.Driver;
import com.nix.pages.CartPage;
import com.nix.pages.HomePage;
import com.nix.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.nix.core.driver.Constants.PRODUCT1;

@Test
public class TestSuite extends BaseTest {

    private HomePage homePage;
    private ProductPage productPage;
    private CartPage cartPage;

    @Test(description = "This test checks BackHome Button", priority = 2)
    public void BackHomeTest() {

        homePage = new HomePage();
        String expected = homePage.getProductName("H&M T-Shirt White");
        homePage.clickProduct("H&M T-Shirt White");
        productPage = new ProductPage();
        productPage.clickAddToCartButton(2);
        productPage.clickBackButton();

        String expectedURL = "https://skyronic.github.io/vue-spa/#/";
        String currentURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL,currentURL);
    }

    @Test(description = "This test checks Added Products to a Cart",dataProvider = "test-data",dataProviderClass = DPClass.class)
    public void AddToCartTest() {
        homePage = new HomePage();
        String expected = homePage.getProductName(PRODUCT1);
        homePage.clickProduct(PRODUCT1);

        productPage = new ProductPage();
        productPage.clickAddToCartButton(2);
        productPage.navigateToCart();

        cartPage = new CartPage();
        String actual = cartPage.getProductNameCart(PRODUCT1);

        Assert.assertEquals(actual, expected);

    }

    @Test(description = "The test check the TOTAL price", priority = 3)
    public void CheckTotal() {
        int addToCartCount = 2;
        double price = Double.parseDouble(homePage.getProductName(PRODUCT1));
        homePage.clickProduct(PRODUCT1);


        productPage = new ProductPage();
        productPage.clickAddToCartButton(addToCartCount);
        productPage.navigateToCart();

        cartPage = new CartPage();

        double actualTotal = cartPage.getTotalPrice();
        double expectedTotal = addToCartCount * price;

        Assert.assertEquals(actualTotal,expectedTotal);
    }


}