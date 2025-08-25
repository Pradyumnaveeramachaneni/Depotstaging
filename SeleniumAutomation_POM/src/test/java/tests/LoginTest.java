package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.DriverFactory;
import utils.ConfigReader;
import pages.LoginPage;
import pages.Adminpage;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private Adminpage Adminpage;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.get("base.url"));
        loginPage = new LoginPage(driver);
        Adminpage = new Adminpage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));
        // TODO: add assertion here
        Adminpage.adduser();
    }

    @AfterClass
    public void tearDown() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        DriverFactory.quitDriver();
    }
}