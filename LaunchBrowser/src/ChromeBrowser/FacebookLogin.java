package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.google.com");
	      driver.navigate().to("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      
	      driver.findElement(By.id("email")).sendKeys("mskavipriya@gmail.com");	
	      driver.findElement(By.id("pass")).sendKeys("!BalaKavi@2019!");
	      driver.findElement(By.name("login")).click();
	      
	}

}
