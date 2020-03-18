package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOpenTasks_POM {

	
	WebDriver rdriver;
	
	public ViewOpenTasks_POM(WebDriver driver)
	{
		rdriver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(css = "input[type='button' ][value='Delete This Task']")
	WebElement deleteThisTasks;
	
	@FindBy(id = "deleteButton")
	WebElement DeleteCofirmation;
	
	
	public void DeleteThisTasks() {
		
		deleteThisTasks.click();
		DeleteCofirmation.click();
	}
	
	
	
}
