package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JSE3 {
 
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  {
		  
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.yahoo.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
     // TC3: Navigate to yahoo.com and scroll the scroller upto half of it
  @Test
  public void operation() {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,5000)");
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
