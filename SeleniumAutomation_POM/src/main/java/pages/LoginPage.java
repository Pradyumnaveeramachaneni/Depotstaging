package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

public class LoginPage extends BasePage {
    private By username = By.name("EmailAddress");
    private By password = By.name("password");
    private By loginBtn = By.xpath("//button[@class=\"login-btn\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String pass) {
        type(username, user);
        type(password, pass);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(loginBtn);
        
    }
}