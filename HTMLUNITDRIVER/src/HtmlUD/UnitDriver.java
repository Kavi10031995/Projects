package HtmlUD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class UnitDriver {

	public static void main(String[] args) {
        
		HtmlUnitDriver driver = new HtmlUnitDriver();
	
			driver.get("https://google.com");
			
			String title=driver.getTitle();
			System.out.println(title);
			
			List<WebElement>links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
			}
			
			
			
		
	}

}
