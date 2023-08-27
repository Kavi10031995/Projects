package EdegeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathFB {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
         WebDriver driver1 = new EdgeDriver();
         
         driver1.get("https://www.google.com");
         driver1.manage().window().maximize();
         driver1.navigate().to("https://www.facebook.com/");
         Thread.sleep(3000);
         
         driver1.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("mskavipriya@gmail.com");
        		 
         driver1.findElement(By.xpath("//input[@data-testid ='royal_pass']")).sendKeys("!BalaKavi@2019!");
         
         driver1.findElement(By.xpath("//button[@name ='login']")).click();

}
}