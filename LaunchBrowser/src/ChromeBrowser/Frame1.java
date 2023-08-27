package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Frame1 {
	
	ChromeDriver driver;
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.angelfire.com/super/badwebs/");
      driver.manage().window().maximize();
      Thread.sleep(3000);

  }
  
  
  @Test
  public void operation() {
	  
	  driver.switchTo().frame(1);
	  driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
	 
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
	  System.out.println("close");
	  
  }
  

}
