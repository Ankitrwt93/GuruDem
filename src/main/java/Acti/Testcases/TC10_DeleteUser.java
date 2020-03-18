package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.EditUserSettings_POM;
import Acti.Pom.acti.pageobjects.Home_EnterTimeTrack_POM;
import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Pom.acti.pageobjects.UserList_POM;

public class TC10_DeleteUser extends BaseClass{

	@Test
	public void DeleteUser () throws InterruptedException{
		System.out.println("TC2_CreateCustomer " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
		driver.get(RC.getURL());
		
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		Home_EnterTimeTrack_POM ETTP=new Home_EnterTimeTrack_POM(driver);
		UserList_POM UList=new UserList_POM(driver);
		EditUserSettings_POM EditUserSet=new EditUserSettings_POM(driver);
		
		

		
		LP.username(RC.getUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		ETTP.Users();
		UList.UserToDelete(RC.userName());
		EditUserSet.DeleteThisUser();
		String actualmsg=UList.successmsg();
		Assert.assertEquals(actualmsg, "User account has been successfully deleted.");
		
	}
}
