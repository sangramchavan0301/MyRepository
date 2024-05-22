package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test (groups = "smoke")                                  //@Test Annotation compulsary-to run test cases
    public void basicOfTestNG01() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        driver.close();
    }
        @Test(groups = "sanity")
        public void basicOfTestNG02 () {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.flipkart.com/");
            driver.manage().window().maximize();

            driver.close();
        }
    }

