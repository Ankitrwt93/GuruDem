package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.ActiveProjectsAndCustomers_POM;
import Acti.Pom.acti.pageobjects.CreateNewProject_POM;
import Acti.Pom.acti.pageobjects.Home_EnterTimeTrack_POM;
import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Pom.acti.pageobjects.Tasks_POM;

public class TC4_CreateProject extends BaseClass{

	
	@Test
	public void CreateProject() throws InterruptedException {
		System.out.println("TC_Login " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		Home_EnterTimeTrack_POM ETTP=new Home_EnterTimeTrack_POM(driver);
		Tasks_POM task=new Tasks_POM(driver);
		ActiveProjectsAndCustomers_POM APCP=new ActiveProjectsAndCustomers_POM(driver);
		CreateNewProject_POM CNP=new CreateNewProject_POM(driver);
		
	driver.get(RC.getURL());
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		LP.username(RC.getUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
 		ETTP.Tasks();
		task.ProjectsAndCustomers();
		APCP.CreateNewProject();
		CNP.customerAdddrpdwn(RC.addCustToProject());
		CNP.ProjectName(RC.ProjName());
		CNP.createProjbtn();
		Assert.assertEquals("Project \""+RC.ProjName()+"\" has been successfully created.", APCP.successmsg());
		
		
	
	
	
	
}
}