package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProvider {

    public static WebDriver driver;

    @DataProvider(name = "test data")
    //While using data provider annotation we need to use name attribute and pass the value here
    public Object[][] dataProviderFunction(){             //Function

        return new Object[][]{                       //Used to return 2D array of Object.(same test case by using multiple data)
                {"Selenium", "Pune"},
                {"Selenium", "Mumbai"},
                {"Selenium", "Nashik"},
                {"Selenium", "Gujarat"}
        };
    }

    @Test(dataProvider = "test data")
    public void verifyNeedOfParameter(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
