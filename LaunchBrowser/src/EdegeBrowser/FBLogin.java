package EdegeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    

	      driver.get("https://www.google.com");
	      driver.navigate().to("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      
	      driver.findElement(By.id("email")).sendKeys("mskavipriya@gmail.com");	
	      driver.findElement(By.id("pass")).sendKeys("!BalaKavi@2019!");
	      driver.findElement(By.name("login")).click();
	      
	}

}
