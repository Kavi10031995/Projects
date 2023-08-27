package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Action5 {
  
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
	  
    // TC5: navigate to jqueryui.com/droppable and drag the source to target
  @Test
  public void operation() 
  {
	  driver.switchTo().frame(0);
	  
	  WebElement drag =  driver.findElement(By.id("draggable"));
	  WebElement drop = driver.findElement(By.id("droppable"));
	  
	  Actions action = new Actions(driver);
	  action.dragAndDrop(drag, drop).build().perform();
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
