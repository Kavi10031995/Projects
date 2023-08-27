package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllOneArray {

	public static void main(String[] args) throws InterruptedException {
            System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
            WebDriver driver1 = new EdgeDriver();
            
            driver1.get("https://www.mercurytravels.co.in/");
            driver1.manage().window().maximize();
            Thread.sleep(3000);
            
            // Total Number of Links
            
            List<WebElement> AllElement = driver1.findElements(By.tagName("a"));
            System.out.println("Total Number of Links are : " +AllElement.size());
            
            // Total Number of dropdowns
            
            AllElement = driver1.findElements(By.tagName("select"));
            System.out.println("Total Number of dropdowns are : " +AllElement.size());
            
            // Total Number of images
            
            AllElement = driver1.findElements(By.tagName("img"));
            System.out.println("Total Number of images are : " +AllElement.size());
            
            // Total Number of radiobuttons
            
            AllElement = driver1.findElements(By.xpath("//input[@type='radio']"));
            System.out.println("Total Number of radiobuttons are : " +AllElement.size());
            
            // Total Number of checkboxes
            
            AllElement = driver1.findElements(By.xpath("//input[@type='checkbox']"));
            System.out.println("Total Number of checkboxes are : " +AllElement.size());
            
            // Total Number of textfields
            
            AllElement = driver1.findElements(By.xpath("//input[@type='text']"));
            System.out.println("Total Number of textfields are : " +AllElement.size());
	}

}
