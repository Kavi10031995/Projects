package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.google.com");
	      driver.manage().window().maximize();
	      Thread.sleep(10000);
	      
	      driver.findElement(By.linkText("Gmail")).click();	
	      driver.findElement(By.partialLinkText("Sign")).click();
	      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kavipriya622@gmail.com");
	      driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("!BalaKavi@2019!");
	      driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
	
	
	
	}

}
