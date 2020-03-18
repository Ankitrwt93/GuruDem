package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.ActiveProjectsAndCustomers_POM;
import Acti.Pom.acti.pageobjects.EditCustomerInformation_POM;
import Acti.Pom.acti.pageobjects.Home_EnterTimeTrack_POM;
import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Pom.acti.pageobjects.Tasks_POM;


public class TC3_DeleteCustomer extends BaseClass {

	
	@Test
	public void deleteCustomer() throws InterruptedException
	{
		driver.get(RC.getURL());
		
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		Home_EnterTimeTrack_POM ETTP=new Home_EnterTimeTrack_POM(driver);
		Tasks_POM task=new Tasks_POM(driver);
		ActiveProjectsAndCustomers_POM APCP=new ActiveProjectsAndCustomers_POM(driver);
		EditCustomerInformation_POM ECI=new EditCustomerInformation_POM(driver);
		
		

		
		LP.username(RC.getUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ETTP.Tasks();
		task.ProjectsAndCustomers();
		APCP.AllCustomersDrpdwn(RC.customerName1());
		APCP.showBtn();
		APCP.clickOnCustomer_project(RC.customerName1());
		
		ECI.DeleteThisCustomerBtn();
		
		String Deletionmsg = APCP.successmsg();
		Assert.assertEquals("Customer has been successfully deleted.", Deletionmsg);
		
		
		
		
		
		
	}
	
}
