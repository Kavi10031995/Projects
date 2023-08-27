package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Frame2 {
    
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
  public void data() {
	  
	  List<WebElement> frame = driver.findElements(By.tagName("frame"));
	  
	  for(int i=0;i<frame.size();i++) {
	  
	  driver.switchTo().frame(i);
	  
	  try {
		  
		  driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
			break;
	  }
		  
	  catch(Exception x)
	  {
		  driver.switchTo().defaultContent();
	  }
	  
	  }
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
	  
	  
  }

}
