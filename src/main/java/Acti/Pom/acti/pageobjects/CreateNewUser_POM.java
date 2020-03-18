package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUser_POM {

	WebDriver rdriver;
	
	public CreateNewUser_POM(WebDriver driver)
	{
		rdriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="passwordText")
	WebElement password;
	
	@FindBy(name="passwordTextRetype")
	WebElement retypePassword;
	
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="workdayDurationStr")
	WebElement workDayDuration;
	

	@FindBy(css = "input[type='SUBMIT'][value*='   Create User   ' ]")
	WebElement createUserBtn;
	
	public void Userdetails(String User_Name, String Password, String Retype_pass, String First_Name, String LastName, String Email, String Workday_Duration) {
		
		
		username.sendKeys(User_Name);
		password.sendKeys(Password);
		retypePassword.sendKeys(Retype_pass);
		firstName.sendKeys(First_Name);
		lastName.sendKeys(LastName);
		email.sendKeys(Email);
		workDayDuration.sendKeys(Workday_Duration);
		
	}
	
	public void CreateUserBtn() {
		
		createUserBtn.click();
	}
	
}
