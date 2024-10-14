package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test(groups = "smoke")                                   //@Test Annotation compulsary-to run test cases
    public void verifySoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        WebElement userNameTextBox = driver.findElement(By.id("login1"));
        softAssert.assertEquals(title, "rediffmail", "Rediffmail title should be match");
        softAssert.assertTrue(userNameTextBox.isDisplayed(), "Username text box should be display");
        System.out.println("This is my area");
	System.out.println("See changes reflected");
	System.out.println("test jenkins");
        softAssert.assertAll();
        driver.close();
    }
}
