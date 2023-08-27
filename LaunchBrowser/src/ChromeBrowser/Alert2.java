package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert2 {
  
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.tsrtconline.in/oprs-web/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	 
	  }
	  
	  //TC2: How to handles the button on the popup's, here click on "OK" button on the alert popup

	    
	     //here we have 2 inbuilt methods in alerts like dismiss() and accept()

	   
	     // clear,close,cancel--dismiss();
	 
	     // ok,submit,save---accept();

  
  @Test
  public void operation() throws InterruptedException {
	  
	  driver.findElement(By.id("searchBtn")).click();
	  Thread.sleep(10000);
	  String value=driver.switchTo().alert().getText();
	  System.out.println(value);
	  Thread.sleep(10000);
	  
	  driver.switchTo().alert().accept();
  }

  @AfterTest
  public void afterTest() {
	//driver.close();
	  System.out.println("close");
  }

}
