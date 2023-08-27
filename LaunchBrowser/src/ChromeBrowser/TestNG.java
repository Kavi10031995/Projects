package ChromeBrowser;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeTest
	 public void open() 
	{
		System.out.println("open a browser"); 
		
	}
	
	@Test(priority =1)
	public void navigate() 
	{
		System.out.println("Navigate to application");
	}
	
	@Test(priority =2,enabled =false)
	public void Register() {
		System.out.println("Register for new account");
	}
	
	@Test(priority =3)
	public void login() {
		System.out.println("Login into the application");
	}
	
	@Test(priority =4)
	public void dailyreports()
	{
		System.out.println("Prepare daily reports and send to team leader");
	}
	
	@Test(priority =5)
	public void logout() {
		System.out.println("logout from the application");
	}
	
	@AfterTest
	public void close() {
		System.out.println("close the browser");
	}
	

}
