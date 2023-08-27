package ChromeBrowser;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	     driver.manage().window().maximize();
	    
	     driver.get("https://www.google.com");
	     
	     driver.navigate().to("https://www.facebook.com");
	     
	     String data1 = driver.getTitle();
	     System.out.println(data1);
	     
	     String data2 = driver.getCurrentUrl();
	     System.out.println(data2);
	     
	     String data3 = driver.getPageSource();
	     System.out.println(data3);
	     
	     String data4 = driver.getWindowHandle();
	     System.out.println(data4);
	     
	     driver.close();
	     driver.quit();
	     
	     
	     
	     
	     
	}

}
