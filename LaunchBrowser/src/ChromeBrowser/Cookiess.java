package ChromeBrowser;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Cookiess {
 
	ChromeDriver driver;
	
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.mirror.co.uk/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	 
	  }
  
  @Test
  public void operation() 
  {
	 Set<Cookie> mycookies = driver.manage().getCookies();
	 System.out.println(mycookies.size());
	 driver.manage().deleteAllCookies();
	 mycookies = driver.manage().getCookies();
	 System.out.println(mycookies.size());
	  
  }

  @AfterTest
  public void afterTest() {
	  
	//driver.close();
	  System.out.println("close");
  }

}
