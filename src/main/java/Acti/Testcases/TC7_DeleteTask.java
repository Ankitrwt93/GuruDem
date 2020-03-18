package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;


import Acti.Pom.acti.pageobjects.Home_EnterTimeTrack_POM;
import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Pom.acti.pageobjects.Tasks_POM;
import Acti.Pom.acti.pageobjects.ViewOpenTasks_POM;

public class TC7_DeleteTask extends BaseClass{

	
	
	@Test
	public void DeleteTask() throws InterruptedException{
		System.out.println("TC2_CreateCustomer " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
		driver.get(RC.getURL());
		
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		Home_EnterTimeTrack_POM ETTP=new Home_EnterTimeTrack_POM(driver);
		Tasks_POM task=new Tasks_POM(driver);
		ViewOpenTasks_POM VOT=new ViewOpenTasks_POM(driver);
		
		
		
		
		LP.username(RC.getUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ETTP.Tasks();
		task.taskToDelete(RC.taskgiven());	
		VOT.DeleteThisTasks();
		String actualmsg=task.Successmsg();
		Assert.assertEquals(actualmsg, "Task has been successfully deleted.");
		
		
	}
	
	
}
