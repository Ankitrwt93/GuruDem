package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerInformation_POM {

	WebDriver rdriver;
	public EditCustomerInformation_POM(WebDriver driver) {
		
		rdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy	(css  = "input[type='button' ][value='Delete This Customer']")
	WebElement deleteThisCustomerBtn;
	
	@FindBy(id = "deleteButton")
	WebElement DeleteCofirmation;
	
	
	
	public void DeleteThisCustomerBtn() {
		
		deleteThisCustomerBtn.click();
		DeleteCofirmation.click();
		
	}
	
	
	
	
}
