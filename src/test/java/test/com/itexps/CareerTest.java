/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template

/**
 *
 * @author maria
 */
public class CareerTest {

    private WebDriver driver;

    public CareerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testCareesrTestCase() throws Exception {
        driver.get("https://healthcare.ascension.org/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Careers")).click();
        driver.get("https://jobs.ascension.org/careers-home/");
        driver.findElement(By.id("keyword-search")).click();
        driver.findElement(By.id("keyword-search")).clear();
        driver.findElement(By.id("keyword-search")).sendKeys("edward");
        driver.findElement(By.id("location-search")).click();
        driver.findElement(By.id("location-search")).clear();
        driver.findElement(By.id("location-search")).sendKeys("60586");
        driver.findElement(By.xpath("//div[@id='all-content']/div[3]/light-search/lw-search/div/div/div/div/form/div[3]/button/span")).click();
        driver.findElement(By.xpath("//a[@id='link-apply-0']/span/span")).click();
        driver.close();
    }
}