package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.CreateNewUser_POM;
import Acti.Pom.acti.pageobjects.Home_EnterTimeTrack_POM;
import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Pom.acti.pageobjects.UserList_POM;

public class TC8_CreateNewUser extends BaseClass{

	
	@Test
	public void CreateNewUser() throws InterruptedException{
		System.out.println("TC2_CreateCustomer " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
		driver.get(RC.getURL());
		
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		Home_EnterTimeTrack_POM ETTP=new Home_EnterTimeTrack_POM(driver);
		UserList_POM UList=new UserList_POM(driver);
		CreateNewUser_POM CNUser=new CreateNewUser_POM(driver);
		
		

		
		LP.username(RC.getUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		ETTP.Users();
		UList.CreateNewUserBtn();
		CNUser.Userdetails(RC.userName(), RC.password(), RC.password(), RC.firstName(), RC.lastName(), RC.email(), RC.WorkdayDuration());
		CNUser.CreateUserBtn();
		String actualmsg=UList.successmsg();
		Assert.assertEquals(actualmsg, "User account has been successfully created.");
		
	
	
	
	
	
	
	}
	
}
