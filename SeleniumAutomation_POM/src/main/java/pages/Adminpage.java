package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class Adminpage extends BasePage {

	
	private By Admnbtn = By.xpath("//a[@title='Administration']/span");
	private By Adduserbtn = By.xpath("(//button[normalize-space(text())='Add Users'])[1]");
	
	public Adminpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void adduser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(Admnbtn);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(Adduserbtn);
	}
	

}
