package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Acti.Testcases.BaseClass;

public class Tasks_POM extends BaseClass {
	
	WebDriver rdriver;
	
	@FindBy(linkText = "Projects & Customers")
	WebElement projANDcustomer;

	@FindBy(css = "input[type='button' ][value='Create New Tasks']")
	WebElement CreateNewTasks;
	
	@FindBy(className = "successmsg")
	WebElement  successmsg;

	
	
	
		public Tasks_POM(WebDriver driver)
		{
			rdriver=driver;
			PageFactory.initElements(driver,this);
		}

	
	public void ProjectsAndCustomers(){
		projANDcustomer.click();
	}

	public void CreateNewTasksBTN()
	{
		CreateNewTasks.click();
	}
	

	public String Successmsg() {
		String SuccessMessage=successmsg.getText();
		return SuccessMessage;
	}
	
	public void taskToDelete(String tasklink) {
		
		driver.findElement(By.xpath("//a[text()='"+tasklink+"']")).click();
	}
	
	
	

}
