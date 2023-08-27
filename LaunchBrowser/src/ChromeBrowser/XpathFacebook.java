package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) throws InterruptedException {
          
		 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("mskavipriya@gmail.com");
		 driver.findElement(By.xpath("//input[@id ='pass']")).sendKeys("!BalaKavi@2019!");
		 driver.findElement(By.xpath("//button[@value ='1']")).click();
	}

}
