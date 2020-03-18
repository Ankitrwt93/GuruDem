package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import Acti.Testcases.BaseClass;



public class ActiveProjectsAndCustomers_POM extends BaseClass{
	
	WebDriver rdriver;
	

	public ActiveProjectsAndCustomers_POM(WebDriver driver)
	{
		rdriver=driver;
		PageFactory.initElements(driver,this);
	}



	
	
	@FindBy	(css  = "input[type='button' ][value='Create New Customer']")
	WebElement createNewCustomer;
	
	@FindBy(className="successmsg")
	WebElement successmsg;
	
	@FindBy(name = "selectedCustomer")
	WebElement AllActiveCustDropdown;

	@FindBy(css = "input[type='button' ][value='  Show  ']")
	WebElement ShowBtn;
	
	@FindBy(css="input[type='button' ][value='Create New Project']")
	WebElement CreateNewProj;

	
	public void CreateNewcustomer() throws InterruptedException {

	createNewCustomer.click();
	}

	public String  successmsg() {
	return (successmsg.getText()); 
		
	}
	
	public void AllCustomersDrpdwn(String custName) {
	sel=new Select(AllActiveCustDropdown);
	sel.selectByVisibleText(custName);
	
	}
	
	public void showBtn()
	{
		
		ShowBtn.click();
	}
	
	public void clickOnCustomer_project(String custName) {

		driver.findElement(By.xpath("//a[text()='"+custName+"']")).click();
	
	}
	
	public void CreateNewProject() {
		CreateNewProj.click();
		
	}

}
