package Acti.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	Properties prop;
	
	public ReadConfig() 
	{
		
		File src=new File("./Configurations/config.properties");
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			prop=new  Properties();
			prop.load(fis);
			
		    }
		
		catch(Exception e){
			
		}
		}
		
	public String getURL() {
	String Fin_URL=prop.getProperty("URL");
	return Fin_URL;
			
		}
	
	public String getUsername() {
	String Fin_Username=prop.getProperty("Username");
		return Fin_Username;
				
			}
	
	public String getpassword() {
	String Fin_pwd=prop.getProperty("Pwd");
		return Fin_pwd;
				
			}
	public String geterrormsg() {
		String Fin_errmsg=prop.getProperty("errormsg");
			return Fin_errmsg;
					
				}
	public String getpageTitle() {
		String Fin_pageTitle=prop.getProperty("Pagetitle");
			return Fin_pageTitle;
					
				}
	public String getnegUsername() {
		String Fin_negUsername=prop.getProperty("NegativeUsername");
			return Fin_negUsername;
					
				}
	public String getNegativePwd() {
		String Fin_NegativePwd=prop.getProperty("NegativePwd");
			return Fin_NegativePwd;
					
				}
	
	public String customerName1() {
		String Fin_customerName1=prop.getProperty("customerName1");
			return Fin_customerName1;
					
				}
	
	public String addCustToProject() {
		
		String Fin_addCustToProject=prop.getProperty("addCustToProj");
		return Fin_addCustToProject;
				
	}
	
public String ProjName() {
		
		String Fin_ProjName=prop.getProperty("projectname");
		return Fin_ProjName;
				
	}

public String customerforTask() {
	
	String Fin_customerforTask=prop.getProperty("customerforTask");
	return Fin_customerforTask;
			
}

public String projectforTask() {
	
	String Fin_projectforTask=prop.getProperty("projectfortask");
	return Fin_projectforTask;
			
}

public String taskgiven() {
	
	String Fin_Taskgiven=prop.getProperty("Taskgiven");
	return Fin_Taskgiven;
}




	

public String userName() {
	
	String Fin_userName=prop.getProperty("UserName");
	return Fin_userName;
}

public String password() {
	
	String Fin_password=prop.getProperty("Password");
	return Fin_password;
}

public String WorkdayDuration() {
	
	String Fin_WorkdayDuration=prop.getProperty("workdayDuration");
	return Fin_WorkdayDuration;
}

public String firstName() {
	
	String Fin_FirstName=prop.getProperty("FirstName");
	return Fin_FirstName;
}

public String lastName() {
	
	String Fin_LastName=prop.getProperty("LastName");
	return Fin_LastName;
}

public String email() {
	
	String Fin_Email=prop.getProperty("Email");
	return Fin_Email;
}





			

















	
	
		
	}
	
	

