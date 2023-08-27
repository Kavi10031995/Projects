package EdegeBrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SSTwo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
		 
		 driver1.get("https://www.google.com");
		 driver1.manage().window().maximize();
		 Thread.sleep(3000);
		
		//TC2: navigate to google.com and capture the screenshot and click on gmail link and capture screenshot
		 
		 File SS1 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(SS1, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\google1.PNG"));
		 
		 driver1.findElement(By.linkText("Gmail")).click();
		 
		 File SS2 = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(SS2, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\gmail1.PNG"));
        
		
		
		
		
		
		
		
	}

	private static File File(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
