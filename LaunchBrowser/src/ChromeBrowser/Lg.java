package ChromeBrowser;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Lg {
	
	private static Logger log = Logger.getLogger(Lg.class);
	
	ChromeDriver driver;
	FileInputStream fis;
	Properties pr;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  DOMConfigurator.configure("log4j.xml");
		  
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      log.info("Chrome browser opened successfully");
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      log.info("OrangeHRM opened successfully");
	      driver.manage().window().maximize();
	      log.info("screen maximized");
	      Thread.sleep(3000);
	  }
  @Test(priority =1)
  public void FISlogin() throws IOException, InterruptedException 
  {
	  
	 fis = new FileInputStream("E:\\Kavi-Java-Selenium-Workspace\\LaunchBrowser\\LoginDetails.properties");
	 pr = new Properties();
	 pr.load(fis);
	 log.info("Properties laoded successfully");
	 driver.findElement(By.name(pr.getProperty("user"))).sendKeys("Admin");
	 driver.findElement(By.name(pr.getProperty("pwd"))).sendKeys("admin123");
	 log.info("entered username and password");
	 driver.findElement(By.xpath(pr.getProperty("login"))).click();
	 log.info("successfully logged into HRM");
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
	  log.info("Logged out successfully");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("closed");
  }

}
