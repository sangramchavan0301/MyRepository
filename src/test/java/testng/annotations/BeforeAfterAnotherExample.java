package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterAnotherExample {

    @BeforeMethod                                  //Before method annotation
    public void beforeMethodDemo(){                //Method
        System.out.println("Before Method");
    }
    @Test                                         //Test annotation
    public void testCase1(){                      //method
        System.out.println("Test Case 1");        //Test case 1
    }
    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }

    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("After Method");
    }
}
