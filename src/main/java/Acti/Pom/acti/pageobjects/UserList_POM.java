package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Acti.Testcases.BaseClass;

public class UserList_POM extends BaseClass {

	WebDriver rdriver;
	
	public UserList_POM(WebDriver driver)
	{
		rdriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Create New User']")
	WebElement createNewUserBtn;
	
	@FindBy(className="successmsg")
	WebElement successmsg;
	
	
	public void CreateNewUserBtn() {
		
		createNewUserBtn.click();
	}
	
	public String  successmsg() {
		return (successmsg.getText()); 
			
		}
		
public void UserToDelete(String UserName) {
		
		driver.findElement(By.xpath("//a[contains(text(),'"+UserName+"')]")).click();
		
	}
	
	
	
	
	
	
	
}
