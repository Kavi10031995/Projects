package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JS4 {
  
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.yahoo.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
    // TC4: naviagte to yahoo.com and scroll the page upto the end
  @Test
  public void operation() throws InterruptedException {
	  
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
