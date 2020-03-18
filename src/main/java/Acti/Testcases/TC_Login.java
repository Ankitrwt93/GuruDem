package Acti.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Acti.Pom.acti.pageobjects.LoginPage_POM;
import Acti.Utilities.ReadConfig;

public class TC_Login extends BaseClass {
	
	
	@Test(priority = 1)
	public void positiveLoginTest() throws InterruptedException {
		System.out.println("TC_Login " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
	driver.get(RC.getURL());
	
	
	LoginPage_POM LP=new LoginPage_POM(driver);
	
	LP.username(RC.getUsername());
	LP.pwd(RC.getpassword());
	LP.logingbuttonsubkit();
	Thread.sleep(2000);
//	LP.login(RC.getUsername(), RC.getpassword()); 
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Assert.assertEquals(driver.getTitle(), RC.getpageTitle());
	
	}
	
	@Test(priority = 2)
	public void negativeLoginTest1 () throws InterruptedException{
		
		
		System.out.println("TC_Login " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		driver.get(RC.getURL());
		
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		

		
		LP.username(RC.getnegUsername());
		LP.pwd(RC.getpassword());
		LP.logingbuttonsubkit();
		
		String ErrorMsg = LP.errormsg();
		Assert.assertEquals(ErrorMsg, RC.geterrormsg());
		}
		
	@Test(priority = 3)
	public void negativeLoginTest2 () throws InterruptedException{
		System.out.println("TC_Login " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
		
		
		driver.get(RC.getURL());
		
		
		LoginPage_POM LP=new LoginPage_POM(driver);
		
//		LP.login(RC.getnegUsername(), RC.getpassword()); 
		
		LP.username(RC.getUsername());
		LP.pwd(RC.getNegativePwd());
		LP.logingbuttonsubkit();
//		Thread.sleep(3000);
		String ErrorMsg = LP.errormsg();
		Assert.assertEquals(ErrorMsg, RC.geterrormsg());
		}
		
		
		
	}
	

