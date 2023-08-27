package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdowns2 {

	public static void main(String[] args) throws InterruptedException {
         
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://www.google.com");
        driver1.manage().window().maximize();
        driver1.navigate().to("https://www.mercurytravels.co.in/");
        //driver1.navigate().to("https://www.bing.com");
        Thread.sleep(3000);
        
        // TC6: navigate to mercurytravels.co.in and go to type of holiday dropdown and search for one particular value like "Family"

	    // if Family is available :"pass"

	    // if "Family" is not available:"Fail"
                      
        WebElement dropdowns = driver1.findElement(By.id("themes"));
        
        List<WebElement> values = dropdowns.findElements(By.tagName("option"));
        
        for(int i =0;i<values.size();i++)
        {
        	String Actual= values.get(i).getText();
        	values.get(i).click();
        	
        	String Expected = "Family";
        
        	if(Actual.equals(Expected))
        	{
        		System.out.println("Pass");
        	}
        	else
        	{
        		System.out.println("Fail");
        	}
        }
        
	}

}
