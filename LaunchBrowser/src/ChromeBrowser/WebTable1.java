package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebTable1 {
	
	ChromeDriver driver;
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException 
  {
	  
	  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.timeanddate.com/worldclock/");
      driver.manage().window().maximize();
      Thread.sleep(3000);
}
  
   //Tc1: navigate to time and date/worldclock and get the list of webtables
  @Test
  public void count() 
  {
	  List<WebElement> webtable = driver.findElements(By.tagName("table"));
	  System.out.println("count of table :"+ webtable.size());
	  
	   
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
	  System.out.println("close");
  }

}
