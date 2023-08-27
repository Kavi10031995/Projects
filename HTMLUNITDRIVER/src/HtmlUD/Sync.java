package HtmlUD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) throws InterruptedException {
            
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		    driver.get("https://google.com");
		    
		    Thread.sleep(3000);
		      Sleeper.sleepTightInSeconds(3);
		    
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
		    WebDriverWait wait = new WebDriverWait(driver,20);
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Gmail")));
		    
		    driver.findElement(By.linkText("Gmail")).click();
		
	}

}
