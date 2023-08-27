package EdegeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingABrowser {

	public static void main(String[] args) {
		System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
	    WebDriver driver1 = new EdgeDriver();
	    
	     driver1.manage().window().maximize();
	    
	     driver1.get("https://www.google.com");
	   
	     driver1.navigate().to("https://www.facebook.com");
	     
	     String data1 = driver1.getTitle();
	     System.out.println(data1);
	     
	     String data2 = driver1.getCurrentUrl();
	     System.out.println(data2);
	     
	     String data3 = driver1.getPageSource();
	     System.out.println(data3);
	     
	     String data4 = driver1.getWindowHandle();
	     System.out.println(data4);
	     
	     driver1.close();
	     driver1.quit();
	     
	     
	     
	     
	}

}