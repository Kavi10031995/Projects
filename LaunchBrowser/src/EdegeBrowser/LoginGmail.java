package EdegeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginGmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
	    WebDriver driver1 = new EdgeDriver();
	    
	    driver1.get("https://www.google.com");
	      driver1.manage().window().maximize();
	      Thread.sleep(10000);
	      
	      driver1.findElement(By.linkText("Gmail")).click();	
	     // driver1.findElement(By.linkText("Sign in")).click();
	       driver1.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("kavipriya622@gmail.com");
	       driver1.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
	       driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("!BalaKavi@2019!");
		   driver1.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
	    
	}

}

