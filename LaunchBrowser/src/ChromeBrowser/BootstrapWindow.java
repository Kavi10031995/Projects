package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BootstrapWindow {
  
	ChromeDriver driver;
		
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	  }
  @Test
  public void operation() 
  {
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8124672324");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	
  }

  @AfterTest
  public void afterTest() 
  {
	//driver.close();
	  System.out.println("close");
	  
  }

}
