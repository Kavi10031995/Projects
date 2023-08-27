package EdegeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
         WebDriver driver1 = new EdgeDriver();
         
         driver1.get("https://www.google.com");
         driver1.manage().window().maximize();
         driver1.navigate().to("https://www.amazon.com");
         Thread.sleep(3000);
         
         driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
         driver1.findElement(By.id("nav-search-submit-button")).click();
	}

}
