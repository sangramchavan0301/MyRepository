package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin() {
        Assert.assertTrue(false);
        System.out.println("Verify Login");        //Parent Test Case
    }

    @Test(dependsOnMethods = "verifyLogin", alwaysRun = true)        //Parent test case pass or fail it does't matter your always run forcelly run the test case
    public void verifyHomePage() {
        System.out.println("Verify Home Page");    //Child(dependant) Test Case
    }
    @Test
    public void verifyFundTransfer() {
        System.out.println("Verify Fund Transfer");
    }
}