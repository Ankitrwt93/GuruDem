package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class LoginPage_POM {

	WebDriver rdriver;
	
	
	public LoginPage_POM(WebDriver driver) {
		rdriver=driver;
		PageFactory.initElements(driver, this);
			
	}
	
	
	@FindBy(name="username")
	 WebElement untxtbx;
	
	@FindBy(name="pwd")
	WebElement pwdtxtbx;
	
	@FindBy(id="loginButton")
	WebElement loginbutton;
	
	@FindBy(xpath="//table[@id='ErrorsTable']//span")
	WebElement errormsg;
	
	
	
//	public void vallogin (String username, String password) throws InterruptedException 
//	{
//		
//	untxtbx.sendKeys(username);
//	pwdtxtbx.sendKeys(password);
//	loginbutton.click();

//	
//	}
	public void username(String username) {
		
		untxtbx.sendKeys(username);
	}
	
	public void pwd(String password) {
		
		pwdtxtbx.sendKeys(password);
	}
	
	public void logingbuttonsubkit() throws InterruptedException {
		loginbutton.click();
//		Thread.sleep(3000);
	}
	
	
	public String errormsg() {
		String errorMessage=errormsg.getText();
		return errorMessage;
	}
	
	

	
	
}
