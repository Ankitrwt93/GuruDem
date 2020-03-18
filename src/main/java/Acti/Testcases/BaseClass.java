package Acti.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Acti.Utilities.ReadConfig;

public class BaseClass {

	
	public static WebDriver driver;
	ReadConfig RC=new ReadConfig();
	public Select sel;
	
	
//	String URL="http://127.0.0.1/login.do";
//	String Username="admin";
//	String Pwd="manager";
//	String errormsg="Username or Password is invalid. Please try again.";
//	String Pagetitle="actiTIME - Enter Time-Track";

	
	@BeforeMethod
	public void prop() {
	System.setProperty("webdriver.chrome.driver", "./Drivers_exeFiles/chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	@AfterMethod
	public void Teardown() {
	driver.close();	
		
	}
		 
	}
	
	
	

