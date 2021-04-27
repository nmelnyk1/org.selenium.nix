package automationsuite;

import com.nix.core.driver.Driver;
import org.testng.annotations.AfterClass;

public class BaseTest {
    @AfterClass
    public void quitDriver() {
        Driver.quitDriver();
    }
}
