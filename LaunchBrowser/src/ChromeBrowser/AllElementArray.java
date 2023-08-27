package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElementArray {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.mercurytravels.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        // Total Number of Links
        
        List<WebElement> AllElement = driver.findElements(By.tagName("a"));
        System.out.println("Total Number of Links are : " +AllElement.size());
        
        // Total Number of dropdowns
        
        AllElement = driver.findElements(By.tagName("select"));
        System.out.println("Total Number of dropdowns are : " +AllElement.size());
        
        // Total Number of images
        
        AllElement = driver.findElements(By.tagName("img"));
        System.out.println("Total Number of images are : " +AllElement.size());
        
        // Total Number of radiobuttons
        
        AllElement = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total Number of radiobuttons are : " +AllElement.size());
        
        // Total Number of checkboxes
        
        AllElement = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total Number of checkboxes are : " +AllElement.size());
        
        // Total Number of textfields
        
        AllElement = driver.findElements(By.xpath("//input[@type='text']"));
        System.out.println("Total Number of textfields are : " +AllElement.size());
        
	}

}
