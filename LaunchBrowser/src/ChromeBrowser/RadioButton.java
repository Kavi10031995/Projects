package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
          
		 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.mercurytravels.co.in/");
		 driver.manage().window().maximize();
		
	     //driver.navigate().to("https://www.bing.com");
	     //driver.navigate().to("https://www.mercurytravels.co.in/");
		 Thread.sleep(3000);
		 			   
		 // tagname: input

         // Syntax to create an xpath:
			
         // By.xpath("//htmltag[@attribute='value']");
		 
		 // Syntax to create xpath for Radiobuttons:
		
         // By.xpath("//input[@type='radio']");
		 
		 // Tc1: navigate to mercurytravels.co.in and get the list of radiobuttons
		 
		 List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		 System.out.println("Total Number of radiobuttons are :" + radiobutton.size());
		 
		 // TC2: How to get the names of all radiobuttons
		 
		 for(int i =0;i<radiobutton.size();i++)
		 {
			 System.out.println("Name of RadioButton :" + radiobutton.get(i).getAttribute("name"));
		 }
	}

}
