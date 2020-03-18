package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.ActiveProjectsAndCustomers_POM;
import Acti.Pom.acti.pageobjects.CreateNewProject_POM;
import Acti.Pom.acti.pageobjects.EditProjectInformation_POM;
import Acti.Pom.acti.pageobjects.Home_EnterTimeTrack_POM;
import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Pom.acti.pageobjects.Tasks_POM;

public class TC5_DeleteProject extends BaseClass{

	
	
	
	@Test
	public void DeleteProject() throws InterruptedException {
		System.out.println("TC_Login " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		Home_EnterTimeTrack_POM ETTP=new Home_EnterTimeTrack_POM(driver);
		Tasks_POM task=new Tasks_POM(driver);
		ActiveProjectsAndCustomers_POM APCP=new ActiveProjectsAndCustomers_POM(driver);
		EditProjectInformation_POM EPI=new EditProjectInformation_POM(driver);
		
	driver.get(RC.getURL());
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		LP.username(RC.getUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
 		ETTP.Tasks();
		task.ProjectsAndCustomers();
		APCP.clickOnCustomer_project(RC.ProjName());
		EPI.DeleteThisprojBtn();
		String	DeletionMSG=APCP.successmsg();
		Assert.assertEquals("Project has been successfully deleted.", DeletionMSG);
}
}