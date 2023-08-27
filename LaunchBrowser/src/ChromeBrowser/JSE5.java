package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JSE5 {
   
	ChromeDriver driver;
	
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
  }
  //TC5: navigate to facebook.com and scroll down the page untill the password element is found
  @Test
  public void operation() {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("document.getElementById('pass').scrollIntoView()" );
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
