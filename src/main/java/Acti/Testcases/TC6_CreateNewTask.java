package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.CreateNewTasks_POM;
import Acti.Pom.acti.pageobjects.Home_EnterTimeTrack_POM;
import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Pom.acti.pageobjects.Tasks_POM;


public class TC6_CreateNewTask extends BaseClass{

	
	@Test
	public void CreateNewTask() throws InterruptedException{
		System.out.println("TC2_CreateCustomer " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
		driver.get(RC.getURL());
		
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		Home_EnterTimeTrack_POM ETTP=new Home_EnterTimeTrack_POM(driver);
		Tasks_POM task=new Tasks_POM(driver);
		CreateNewTasks_POM CNT=new CreateNewTasks_POM(driver);
		
		
		
		LP.username(RC.getUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ETTP.Tasks();
		
		task.CreateNewTasksBTN();
		CNT.customerDrpDwn(RC.customerforTask());
		CNT.ProjectDrpDwn(RC.projectforTask());
		Thread.sleep(3000);
		CNT.taskname(RC.taskgiven());
		
		CNT.maxcalendar_Currentdate();
		
		CNT.Billable();
		CNT.AddtoMyTimeTrackCheckBox();
		
		CNT.CreateTasks();
		
		String actualmsg=task.Successmsg();
		String ExpectedMsg="1 new task was added to the customer \""+RC.customerforTask()+"\", project \""+RC.projectforTask()+"\".";
		Assert.assertEquals(actualmsg, ExpectedMsg);
		
		
		
		
		
		
		
}
}