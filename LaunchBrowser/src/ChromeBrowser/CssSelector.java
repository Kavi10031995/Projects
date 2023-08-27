package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).sendKeys("KAVIPRIYA");
		driver.findElement(By.cssSelector("#newpasswd")).sendKeys("123abc");
		driver.findElement(By.cssSelector("#newpasswd1")).sendKeys("123abc");
	}

}

