package automationsuite.providers;

import org.testng.annotations.DataProvider;

public class DPClass {
    @DataProvider(name= "test-data")
    public static Object [][]providerMethod(){
        return new Object[][]{
                {"product1"},{"product2"},{"product3"}
        };
    }
}
