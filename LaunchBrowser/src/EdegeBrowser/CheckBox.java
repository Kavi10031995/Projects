package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://designsystem.digital.gov/components/checkbox/");
        driver1.manage().window().maximize();
        Thread.sleep(3000);
        
      //Tagname: input

        //Xpath for checkboxs: 

        //By.xpath("//input[@type='checkbox']")

        //TC1: navigate to application and get the list of checkboxes
        
        
        List<WebElement> checkbox = driver1.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total Number of checkboxes :" + checkbox.size());
        
        
        //TC2: How to get the names of all the checkboxes
        
        for(int i =0;i<checkbox.size();i++)
        {
        	System.out.println("Names of checkbox :"+ checkbox.get(i).getAttribute("name"));
        }
	}

}
