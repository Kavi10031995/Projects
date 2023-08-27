package EdegeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://rediffmail.com");
        driver1.manage().window().maximize();
        Thread.sleep(3000);
        
        
        driver1.findElement(By.linkText("Create Account")).click();
        driver1.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("KAVIPRIYA");
        driver1.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Kavipriya@622");
        driver1.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("Kavipriya@622");
        
        

	}

}
