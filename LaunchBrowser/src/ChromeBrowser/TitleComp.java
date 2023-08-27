package ChromeBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleComp {

	public static void main(String[] args) throws InterruptedException {
                
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String Actual = driver.getTitle(); //Application
		
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
