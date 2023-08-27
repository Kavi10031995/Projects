package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Action1 {
  
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
  //TC1: Open google and right click on gmail link 
  @Test
  public void operation() 
  {
	 WebElement  value = driver.findElement(By.linkText("Gmail"));
	  Actions action = new Actions(driver);
	  action.contextClick(value).build().perform();
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
