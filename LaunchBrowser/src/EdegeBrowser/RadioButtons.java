package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
       
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://www.mercurytravels.co.in/");
        driver1.manage().window().maximize();
        Thread.sleep(3000);
        
        // tagname: input

        // Syntax to create an xpath:
			
        // By.xpath("//htmltag[@attribute='value']");
		 
		// Syntax to create xpath for Radiobuttons:
		
        // By.xpath("//input[@type='radio']");
		 
		// Tc1: navigate to mercurytravels.co.in and get the list of radiobuttons
        
        List<WebElement> radiobuttons = driver1.findElements(By.xpath("//input[@type = 'radio']"));
        System.out.println("Total Number of radiobuttons are :" + radiobuttons.size());
        
        // TC2: How to get the names of all radiobuttons
        
        for(int i=0;i<radiobuttons.size();i++)
        {
        	System.out.println("Name of radiobutton is :" + radiobuttons.get(i).getAttribute("name"));
        }
	}

	
}
