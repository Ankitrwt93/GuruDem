package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.LoginPage_POM;

public class TC9_LoginNewUser extends BaseClass {

	@Test()
	public void LoginNewUser() throws InterruptedException {
		System.out.println("TC_Login " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
	driver.get(RC.getURL());
	
	
	LoginPage_POM LP=new LoginPage_POM(driver);
	
	LP.username(RC.userName());
	LP.pwd(RC.password());
	LP.logingbuttonsubkit();
	Thread.sleep(2000);
//	LP.login(RC.getUsername(), RC.getpassword()); 
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Assert.assertEquals(driver.getTitle(), RC.getpageTitle());
	
	}
	
	
	
	
	
	
}
