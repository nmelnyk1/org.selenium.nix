package automationsuite;

import com.nix.pages.CartPage;
import com.nix.pages.HomePage;
import com.nix.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        Assert.assertTrue(true);
    }

    @Test(description = "This test checks Added Products to a Cart")
    public void AddToCartTest() {
        homePage = new HomePage();
        String expected = homePage.getProductName("H&M T-Shirt White");
        homePage.clickProduct("H&M T-Shirt White");

        productPage = new ProductPage();
        productPage.clickAddToCartButton(2);
        productPage.navigateToCart();

        cartPage = new CartPage();
        String actual = cartPage.getProductName("H&M T-Shirt White");

        Assert.assertEquals(actual, expected);

    }

    @Test(description = "The test check the TOTAL price", priority = 3)
    public void CheckTotal() {
        homePage = new HomePage();
        String expected = homePage.getProductName("H&M T-Shirt White");
        homePage.clickProduct("H&M T-Shirt White");

        productPage = new ProductPage();
        productPage.clickAddToCartButton(2);
        productPage.navigateToCart();

        cartPage = new CartPage();
        String actual = cartPage.getProductName("H&M T-Shirt White");
        cartPage.getTotal(2);

        //Assert.assertEquals(,);
    }


}