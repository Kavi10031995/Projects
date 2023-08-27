package ChromeBrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ObjRepo {
	
	
	ChromeDriver driver;
	FileInputStream fis;
	Properties pr;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
  @Test(priority =1)
  public void FISlogin() throws IOException, InterruptedException 
  {
	  
	 fis = new FileInputStream("E:\\Kavi-Java-Selenium-Workspace\\LaunchBrowser\\LoginDetails.properties");
	 pr = new Properties();
	 pr.load(fis);
	 
	 driver.findElement(By.name(pr.getProperty("user"))).sendKeys("Admin");
	 driver.findElement(By.name(pr.getProperty("pwd"))).sendKeys("admin123");
	 driver.findElement(By.xpath(pr.getProperty("login"))).click();
	 Thread.sleep(3000);
	  
  }
  
  
  @Test(priority =2)
  public void FISlogout() throws IOException, InterruptedException 
  {
	  fis = new FileInputStream("E:\\Kavi-Java-Selenium-Workspace\\LaunchBrowser\\LoginDetails.properties");
	  pr = new Properties();
	  pr.load(fis);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(pr.getProperty("drop-down"))).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(pr.getProperty("logout"))).click();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
