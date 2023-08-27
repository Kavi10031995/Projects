package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://designsystem.digital.gov/components/checkbox/");
        driver1.manage().window().maximize();
        Thread.sleep(3000);
        
        List<WebElement> checkbox = driver1.findElements(By.xpath("//input[@type='checkbox']"));

        System.out.println("Total Number of checkboxes :" + checkbox.size());
		
		//TC3: How to get the default status of checkboxes
		
		for(int i =0;i<checkbox.size();i++)
		{
			
			System.out.println(checkbox.get(i).getAttribute("checked"));
		}
		
		// TC4: How to get the default status of chceckboxes long with its name
		
		for(int j =0;j<checkbox.size();j++)
		{
			
			System.out.println(checkbox.get(j).getAttribute("name")+"  :   "+checkbox.get(j).getAttribute("checked"));
		}
		
	}

}
