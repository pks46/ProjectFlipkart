package OrderProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Core.StartingChromeBrowser;

public class MouseMovement extends StartingChromeBrowser{

	public static void move() {
		driver.get("https://www.flipkart.com");
		WebElement fashion = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions action = new Actions(driver);
		action.moveToElement(fashion).perform();
	}
}
