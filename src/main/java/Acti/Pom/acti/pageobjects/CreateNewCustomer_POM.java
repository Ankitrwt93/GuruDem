package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomer_POM {

	
	WebDriver rdriver;
	public CreateNewCustomer_POM(WebDriver driver) {
		
		rdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="name")
	 WebElement customername;
	
	
	
	@FindBy(name="createCustomerSubmit")
	 WebElement createCustButton;
	
	
	
	public void customername(String name)
	{
		customername.sendKeys(name);
		
		
	}
	
	public void createcustomerBtn() {
		createCustButton.click();
	}

	
}
