package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebTable5 {
	
	ChromeDriver driver;
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.timeanddate.com/worldclock/");
      driver.manage().window().maximize();
      Thread.sleep(3000);  
	  
  }
     //TC5: How to get the complete table data in a table format  
  @Test
  public void data() {
	  
	  WebElement table = driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
	  List<WebElement> tablerow = table.findElements(By.tagName("tr"));
	  System.out.println(tablerow.size());
	  
	  for(int i=0;i<tablerow.size();i++)
	  {
	 
	  List<WebElement> tablecol = tablerow.get(i).findElements(By.tagName("td"));
	  System.out.println(tablecol.size());
	  
	  for(int j=0;j<tablecol.size();j++)
	  {
		  System.out.print(tablecol.get(j).getText() + "            ");
		  
	  }
	  System.out.println();
	  }
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("close");
	  
	  
  }

}
