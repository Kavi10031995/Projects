package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdowns1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://www.google.com");
        driver1.manage().window().maximize();
        driver1.navigate().to("https://www.mercurytravels.co.in/");
        //driver1.navigate().to("https://www.bing.com");
        Thread.sleep(3000);
        
           // Tagname for dropdown: select

	       // Tagname for values inside the dropdown : option
	       
	       // TC4: How to count no. of values from a particular dropdown
        
        WebElement dropdowns = driver1.findElement(By.id("themes"));
        
        List<WebElement> values = dropdowns.findElements(By.tagName("option"));
        
        System.out.println("Total Number of Values in Particular dropdown are : " + values.size());
        
     // TC5: How to get the names of all values inside the particular dropdown 
        
        for(int i=0;i<values.size();i++)
        {
        	System.out.println("Names inside Particular Dropdown are :" + values.get(i).getText());
        }
        
        
	}

}
