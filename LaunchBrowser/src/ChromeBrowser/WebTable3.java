package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class WebTable3 {
	
	ChromeDriver driver;
  
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.timeanddate.com/worldclock/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
	  
  }
  
  
  //TC3: How to get a particular data from webtable
  @Test
  public void data() 
  {
	 String name = driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[5]/a")).getText();
	 System.out.println(name); 
  }

  @AfterTest
  public void afterTest() 
  {
	  
	 driver.close();
	  System.out.println("close");
	  
  }

}
