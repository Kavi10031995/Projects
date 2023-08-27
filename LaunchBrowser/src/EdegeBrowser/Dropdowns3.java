package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdowns3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://www.google.com");
        driver1.manage().window().maximize();
        driver1.navigate().to("https://www.mercurytravels.co.in/");
        //driver1.navigate().to("https://www.bing.com");
        Thread.sleep(3000);
         
           //TC7: Check whether all the values are displayed or not in particular dropdown..
	       //if it is displayed than print as active along with its name, 
		   //if it is not displayed than print as inactive along with its name
        
        WebElement dropdowns = driver1.findElement(By.id("themes"));
        
        List<WebElement> values = dropdowns.findElements(By.tagName("option"));
        
        for(int i =0;i<values.size();i++)
        {
        	String Name = values.get(i).getText();
        	values.get(i).click();
        	
        	if(values.get(i).isDisplayed())
        	{
        		System.out.println("Active :" +Name);
        	}
        	else
        	{
        		System.out.println("Inactive :" +Name);
        	}
        }
        
        
        
         
	}

}
