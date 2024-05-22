package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = "smoke")
    public void verifyNewHomeLogin(){
        Assert.assertTrue(false);
        System.out.println("New Home Page Login");             //Parent test case failed
    }
    @Test(dependsOnGroups = "smoke")
    public void verifyLoanMgtSystem(){
        System.out.println("Loan Management System");          //Child test case skipped due to parent test case failed
}
   @Test(enabled = false)                                  //Used to enable or disable test case
    public void cardManagementSystem(){
       System.out.println("Card Management System");
    }

}
