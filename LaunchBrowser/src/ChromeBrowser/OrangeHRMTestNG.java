package ChromeBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OrangeHRMTestNG {
	
	ChromeDriver driver;
 
  @BeforeTest
  public void openBrowser() throws InterruptedException {
	  
	  System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
      driver = new ChromeDriver();
      
      driver.get("https://www.google.com");
      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
      Thread.sleep(3000);
  }
  @Test(priority =1)
  public void login() throws InterruptedException {
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
      driver.findElement(By.name("password")).sendKeys("admin123");
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
      Thread.sleep(3000);
	  
  }
  
  @Test(priority =2)
  public void logout() throws InterruptedException  {
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	 
  }

  @AfterTest
  public void closeBrowser() {
	  
	  //driver.close();
	  System.out.println("closed ");
  }

}
