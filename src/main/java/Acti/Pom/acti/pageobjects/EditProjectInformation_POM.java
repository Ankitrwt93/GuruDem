package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProjectInformation_POM {

	
	WebDriver rdriver;
	public EditProjectInformation_POM(WebDriver driver) {
		
		rdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Delete This Project']")
	WebElement DeleteThisProjectBTN;
	
	@FindBy(id = "deleteButton")
	WebElement DeleteCofirmation;
	
	
	

	

	public void DeleteThisprojBtn() {
		
		DeleteThisProjectBTN.click();
		DeleteCofirmation.click();
		
	}
	
	
}
