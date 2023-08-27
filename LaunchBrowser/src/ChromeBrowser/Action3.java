package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Action3 {
	
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
	  // TC3: open google.com and double click on search button

  @Test
  public void operation() throws InterruptedException {
         
	  driver.findElement(By.name("q")).sendKeys("Testing");
	  Thread.sleep(3000);
	  
	  WebElement value  = driver.findElement(By.name("btnK"));
	  Actions action = new Actions(driver);
	  Thread.sleep(3000);
	  action.doubleClick(value).build().perform();
	
  }
  

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
