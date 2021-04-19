package automationsuite;

import com.nix.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



@Test
public class TestClass extends BasePage {
private final ProductPage product = new ProductPage();
private final HeaderComponent headerComponent = new HeaderComponent();
private final CartPage cartPage = new CartPage();
private final HomePage homePage = new HomePage();

    public void addToCartTest(){
    String currentProductName = homePage.getProduct();


    String productNameFromCart = cartPage.getProductName();
    Assert.assertEquals(currentProductName,productNameFromCart);
}
}
