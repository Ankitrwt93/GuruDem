package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_EnterTimeTrack_POM {

	WebDriver rdriver;
	
	@FindBy(xpath = "//div[text()='Tasks']")
	WebElement tasks;
	
	@FindBy(xpath = "//div[text()='Users']")
	WebElement users;
	
	
	public Home_EnterTimeTrack_POM(WebDriver driver)
	{
		rdriver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Tasks() {
		
		tasks.click();
	}
	
	
	public void Users() {
		
		users.click();
	}
	
	
}
