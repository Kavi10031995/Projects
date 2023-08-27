package EdegeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathORG {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
         WebDriver driver1 = new EdgeDriver();
         
         driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver1.manage().window().maximize();
         Thread.sleep(5000);
         
         driver1.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
         driver1.findElement(By.xpath("//input[@class = 'oxd-input oxd-input--active']")).sendKeys("admin123");
         driver1.findElement(By.xpath("//button[@type ='submit']")).click();
         
	}

}
