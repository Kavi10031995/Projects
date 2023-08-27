package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.mercurytravels.co.in/");
		 driver.manage().window().maximize();
		
	     //driver.navigate().to("https://www.bing.com");
	     //driver.navigate().to("https://www.mercurytravels.co.in/");
		 Thread.sleep(3000);
		 
		 List<WebElement> radiobutton=driver.findElements(By.xpath("//input[@type='radio']"));
		 System.out.println("Total Number of radiobutttons are :" +radiobutton.size());
		 
		 //TC3: How to get the default status of radiobuttons
		 
		 for(int i =0;i<radiobutton.size();i++)
		 {
			 System.out.println("checked radiobutton  : " +radiobutton.get(i).getAttribute("checked"));
		 }
		 
		 // TC4: How to get the default status of radiobuttons along with its name
		 
		 for(int j =0;j<radiobutton.size();j++)
		 {
			 System.out.println(radiobutton.get(j).getAttribute("name")+"  :  "+ radiobutton.get(j).getAttribute("checked"));
		 }
	}

}
