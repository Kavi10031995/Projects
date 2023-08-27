package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHRM {

	public static void main(String[] args) throws InterruptedException  {
         System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.google.com");
	      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          driver.manage().window().maximize();
	      Thread.sleep(3000);
	     	      
	      driver.findElement(By.name("username")).sendKeys("Admin");
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    
	}

}
