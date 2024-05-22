package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    @BeforeMethod
    public void beforeMethodAnnotation(){

    }

@Parameters({"courseName", "cityName"})
@Test
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
