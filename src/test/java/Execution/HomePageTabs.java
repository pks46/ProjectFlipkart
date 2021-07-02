package Execution;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Core.StartingChromeBrowser;

public class HomePageTabs extends StartingChromeBrowser{
	
	public static void HomeTabs() {
		StartingChromeBrowser.StartingBrowser();
		List<WebElement> containers = new ArrayList<>(driver.findElements(By.xpath("//div[contains(@class,'xtXmba')]")));
		System.out.println("Number of TAB Containers Present = "+containers.size());
		for(int i=0; i<containers.size(); i++) {
			System.out.println("container "+containers.get(i).getText());
		}
		
	}
	
	public static void CloseTab() {
		driver.close();
	}
}
