package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Action2 {
  
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.mercurytravels.co.in/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
  
  @Test
  public void operation() throws InterruptedException 
  {
	   WebElement value = driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
	   Actions action = new Actions(driver);
	   action.moveToElement(value).build().perform();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a")).click();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
