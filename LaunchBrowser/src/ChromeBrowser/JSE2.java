package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JSE2 {
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  {
		  
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
	  
	 // TC2: How to get the title of the page using javascriptexecutor
  @Test
  public void data() 
  {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  String title = js.executeScript("return document.title").toString();
	  System.out.println(title);
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
	  
  }

}
