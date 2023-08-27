package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JSE6 {
	
	
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
	  
	 // TC6: How to perform forward and backward operations by using javascriptexecutor
  @Test
  public void operation() throws InterruptedException {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  driver.navigate().to("https://www.google.com");
	  Thread.sleep(5000);
	  js.executeScript("window.history.back()");
	  Thread.sleep(5000);
	  js.executeScript("window.history.forward()");
  }
 

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
