package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Textfields {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://www.mercurytravels.co.in/");
        driver1.manage().window().maximize();
        Thread.sleep(3000);
        
     //tagname: input

   	 //Xpath for textfields:
   	
   	 // By.xpath("//input[@type='text']")

   	 //TC1: How to get the list of Textfields 
        List<WebElement> textfield = driver1.findElements(By.xpath("//input[@type ='text']"));
        System.out.println("Total Number of Textfields are : " + textfield.size());
        
      //TC2: How to get the names fo all these textfields
        
        for(int i =0;i<textfield.size();i++)
        {
        	System.out.println("Name of the Textfield is : " + textfield.get(i).getAttribute("name"));
        }
        
	}

}
