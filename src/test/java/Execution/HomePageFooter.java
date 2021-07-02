package Execution;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Core.StartingChromeBrowser;

public class HomePageFooter extends StartingChromeBrowser{

	public static void HomeFooters() {
			
		List<WebElement> FooterContainers = new ArrayList<>(driver.findElements(By.xpath("//div[contains(@class,'_2WErco row')]/div[2]")));
		System.out.println("Number of Footer Section Present = "+FooterContainers.size());		
		  for(int i=0; i<FooterContainers.size(); i++) {
			  //String xpath_eachSection = "//div[contains(@class,'_2WErco row')]/div"+"["+i+"]";		  
			  
			  System.out.println(FooterContainers.get(i).getText());
		  }		 
	}
	
}
