package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebTable4 {
	
	ChromeDriver driver;
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  
	  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.timeanddate.com/worldclock/");
      driver.manage().window().maximize();
      Thread.sleep(3000);  
  }
    
  //TC4: How to identify all rows data of the first column
  
  @Test
  public void data() {
	  
	  WebElement webtable =driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
	  
	  List<WebElement> tablerow = webtable.findElements(By.tagName("tr"));
	  System.out.println(tablerow.size());
	  
	  String part1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	  String part2 = "]/td[1]/a";

	  
	  for(int i=1;i<tablerow.size();i++)
	  {
		 String name = driver.findElement(By.xpath(part1+i+part2)).getText();
		 System.out.println(name);
	  }
		  
  }  
  

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("close");
	  
  }

}
