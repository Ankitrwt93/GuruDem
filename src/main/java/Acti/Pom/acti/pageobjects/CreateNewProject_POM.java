package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Acti.Testcases.BaseClass;

public class CreateNewProject_POM extends BaseClass {

	WebDriver rdriver;
	

	public CreateNewProject_POM(WebDriver driver)
	{
		rdriver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="customerId")
	WebElement CustomerAddDropDown;
	
	@FindBy(name="name")
	WebElement ProjectName;
	
	@FindBy(name = "createProjectSubmit")
	WebElement CreateProjBtn;
	
	
	
	
	
	public void customerAdddrpdwn (String custname) {
		sel=new  Select(CustomerAddDropDown);
		sel.selectByVisibleText(custname);
		
	}

	public void ProjectName (String Projname)
	{
		ProjectName.sendKeys(Projname);
		
	}
	
	public void createProjbtn ()
	{
		CreateProjBtn.click();
		
	}
	
	
	
	
	
	
	
	
}
