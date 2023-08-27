package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JSE1 {
     
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
  // TC1: Open facebook.com and enter the username and password using javascriptexecutor
  
  @Test
  public void data() 
  {
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  js.executeScript("document.getElementById('email').value='mskavipriya@gmail.com'");
	  js.executeScript("document.getElementById('pass').value='!BalaKavi@2019!'");
	  driver.findElement(By.name("login")).click();
	  
  }

  @AfterTest
  public void afterTest() {
	//driver.close();
	  System.out.println("close");
	  
	  
  }

}
