package Acti.Pom.acti.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import Acti.Testcases.BaseClass;

public class CreateNewTasks_POM extends BaseClass {

	
	
	
	WebDriver rdriver;
	private int day;
	
	public CreateNewTasks_POM(WebDriver driver) {
		
		rdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="customerId")
	WebElement CustomerDrpdwn;
	
	@FindBy(name="projectId")
	WebElement ProjDrpdwn;
	
	@FindBy(name="task[0].name")
	WebElement taskname;
	
	@FindBy(xpath="//span[@id='taskDeadlineSpan0']//img")
	WebElement calendarmax;
	
	@FindBy(name="task[0].billingType")
	WebElement Billable;
	
	@FindBy(name = "task[0].markedToBeAddedToUserTasks")
	WebElement addtoMyTimeTrackCheckBox;
	
	@FindBy(css = "input[type='button'][value='Create Tasks']")
	WebElement createTasks;
	
	
	
	
	
	public void customerDrpDwn(String customerForTask) {
		
		sel=new Select(CustomerDrpdwn);
		sel.selectByVisibleText(customerForTask);
		
	}

	public void ProjectDrpDwn(String ProjectForTask) {
		
		sel=new Select(ProjDrpdwn);
		sel.selectByVisibleText(ProjectForTask);
		
	}
	
	public void taskname(String Taskgiven) {
		
		taskname.sendKeys(Taskgiven);
		
	}
	
public void maxcalendar_Currentdate() {
		
		calendarmax.click();
		day = LocalDate.now().getDayOfMonth();
		driver.findElement(By.xpath("//a[@class='x-date-date']//span[contains(text(),'"+day+"')]")).click();;
		
	}



	public void Billable() {
		sel=new Select(Billable);
		sel.selectByVisibleText("Billable");
	}
	
	
	public void AddtoMyTimeTrackCheckBox() {
		addtoMyTimeTrackCheckBox.click();
	}
	
	public void CreateTasks() {
		
		createTasks.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
