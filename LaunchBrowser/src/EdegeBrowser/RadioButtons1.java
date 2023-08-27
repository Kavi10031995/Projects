package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtons1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://www.mercurytravels.co.in/");
        driver1.manage().window().maximize();
        Thread.sleep(3000);
        
        List<WebElement> radiobuttons = driver1.findElements(By.xpath("//input[@type = 'radio']"));
        System.out.println("Total Number of radiobuttons are :" + radiobuttons.size());
        
        for(int i = 0;i<radiobuttons.size();i++)
        {
        	System.out.println("Checked radio button  :" + radiobuttons.get(i).getAttribute("checked"));
        }
        for(int j=0;j<radiobuttons.size();j++)
        {
        	System.out.println(radiobuttons.get(j).getAttribute("name")+"  :  "+radiobuttons.get(j).getAttribute("checked"));
        }

	}

}
