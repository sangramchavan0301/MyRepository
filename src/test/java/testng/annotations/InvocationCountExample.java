package testng.annotations;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 500, invocationTimeOut = 1)
    public void invocationCountDemo(){
        System.out.println("Invocation Count Demo");
    }
}
