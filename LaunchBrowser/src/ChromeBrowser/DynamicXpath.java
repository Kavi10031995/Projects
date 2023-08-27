package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[starts-with (@name,'name')]")).sendKeys("KAVIPRIYA");
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Kavipriya@622");
		driver.findElement(By.xpath("//input[contains (@name,'confirm_passwd')]")).sendKeys("Kavipriya@622");
		
		
		
		
	}

}
