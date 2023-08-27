package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebTable2 {
	
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
	  
// TC2: How to get no. of rows and no. of columns
  
  @Test
  public void data() 
  {
	  WebElement webtable = driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
	  
	  List<WebElement> tablerow = webtable.findElements(By.tagName("tr"));
	  System.out.println("Number of rows :" + tablerow.size());
	  
	  List<WebElement> tablecol = webtable.findElements(By.tagName("td"));
	  System.out.println("Number of rows :" + tablecol.size());
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  driver.close();
	  System.out.println("close");
	  
  }

}
