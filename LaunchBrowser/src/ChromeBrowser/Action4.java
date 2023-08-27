package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Action4 {
	
	
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/slider/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
	  
	  //TC4: naviagte to jqueryui.com/slider and ,move the slider to 60% of it

  @Test
  public void operation() 
  {
	  driver.switchTo().frame(0);
	   
	   WebElement slider=driver.findElement(By.id("slider"));
	   
	   int location=slider.getLocation().y;
	   
	   Actions action=new Actions(driver);
	   action.dragAndDropBy(slider,location,60).build().perform();
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
