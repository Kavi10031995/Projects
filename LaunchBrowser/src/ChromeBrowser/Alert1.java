package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert1 {
  
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.tsrtconline.in/oprs-web/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	 
	  }
	  
	 
	  //Tc1:Open Tsrtc and click on check availability and 
	  //get the alert text information generated in the alert popup and print as an output in the console page
  
  @Test
  public void operation() 
  {
	  
	  driver.findElement(By.id("searchBtn")).click();
		String value=driver.switchTo().alert().getText();
		System.out.println(value);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
	  
  }

}
