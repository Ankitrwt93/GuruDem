package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.ActiveProjectsAndCustomers_POM;
import Acti.Pom.acti.pageobjects.CreateNewCustomer_POM;
import Acti.Pom.acti.pageobjects.Home_EnterTimeTrack_POM;
import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Pom.acti.pageobjects.Tasks_POM;

public class TC2_CreateCustomer extends BaseClass{
	
	@Test
	public void CreateCutomer1() throws InterruptedException{
		System.out.println("TC2_CreateCustomer " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
		driver.get(RC.getURL());
		
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		Home_EnterTimeTrack_POM ETTP=new Home_EnterTimeTrack_POM(driver);
		Tasks_POM task=new Tasks_POM(driver);
		ActiveProjectsAndCustomers_POM APCP=new ActiveProjectsAndCustomers_POM(driver);
		CreateNewCustomer_POM CNC=new CreateNewCustomer_POM(driver);

		
		LP.username(RC.getUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ETTP.Tasks();
		task.ProjectsAndCustomers();
		APCP.CreateNewcustomer();
		CNC.customername(RC.customerName1());
		CNC.createcustomerBtn();
		String SuccessMessage=APCP.successmsg();
		String ExpectedMessage="Customer \""+RC.customerName1()+"\" has been successfully created.";
		
		Assert.assertEquals(SuccessMessage, ExpectedMessage);
		
	}
	

}
