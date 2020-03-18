package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Acti.Testcases.BaseClass;

public class EditUserSettings_POM extends BaseClass{

	WebDriver rdriver;
	public EditUserSettings_POM(WebDriver driver) {
		
		rdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[type='button'][value='Delete This User']")
	WebElement deleteThisUserBtn;
	
	
	public void DeleteThisUser()
	{
		
		deleteThisUserBtn.click();
		driver.switchTo().alert().accept();
		
		
	}
	
	
	
	
}
