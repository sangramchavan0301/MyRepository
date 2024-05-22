package testng.priority;

import org.testng.annotations.Test;

public class PriorityAnotherExample {

    @Test(priority = -1)
    public void C_method() {
        System.out.println("I'm in method C");
    }

    @Test(priority = 0)
    public void B_method() {
        System.out.println("I'm in method B");
    }

    @Test(priority = 1)
    public void A_method() {
        System.out.println("I'm in method A");
    }
}
