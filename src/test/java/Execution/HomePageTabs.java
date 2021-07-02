package Execution;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.StartingChromeBrowser;

public class HomePageTabs extends StartingChromeBrowser{

	public static void HomeTabs() {
		StartingChromeBrowser.StartingBrowser();
		wait = new WebDriverWait(driver, 10);
		
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		}catch(Exception e) {
			
			System.out.println("unable to find");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> containers = new ArrayList<>(driver.findElements(By.xpath("//div[contains(@class,'xtXmba')]")));
		System.out.println("Number of TAB Containers Present = "+containers.size());
//		for(int i=0; i<containers.size(); i++) {
//			System.out.println("container "+containers.get(i).getText());
//		}
		
	}
	
	public static void CloseTab() {
		StartingChromeBrowser.ClosingBrowser();
	}
}
