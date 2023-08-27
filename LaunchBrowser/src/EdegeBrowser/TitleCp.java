package EdegeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TitleCp {

	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
		
		  WebDriver driver1 = new EdgeDriver();
		
		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		
		String Actual = driver1.getTitle(); //Application
		
		String Expected = "Google"; //Document
		
		if(Actual.equals(Expected))
		{
			System.out.println("Title is Matching");
		}
		else
		{
			System.out.println("Title is not Matching");
		}
	}

}
