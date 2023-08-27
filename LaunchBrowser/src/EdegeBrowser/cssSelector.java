package EdegeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://rediffmail.com");
        driver1.manage().window().maximize();
        Thread.sleep(3000);
        
        driver1.findElement(By.linkText("Create Account")).click();
        driver1.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).sendKeys("KAVIPRIYA");
		driver1.findElement(By.cssSelector("#newpasswd")).sendKeys("123abc");
		driver1.findElement(By.cssSelector("#newpasswd1")).sendKeys("123abc");		
	}

}
