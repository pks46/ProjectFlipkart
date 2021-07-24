package com.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Core.StartingChromeBrowser;

public class Login_TC001 extends StartingChromeBrowser{
	
	WebDriverWait wait;
	
	@FindBy(xpath="//div[contains(@class,'_2QfC02')]")
	WebElement Flyout;
	@FindBy(xpath="//button[contains(text(),'✕')]")
	WebElement XClosing;
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement LoginButton;
	
	@Test
	public void LoginFlyout() {
		System.out.println("Starting the Flipkart in the Chrome Browser");
		StartingChromeBrowser.StartingBrowser();
		PageFactory.initElements(driver, this);
		System.out.println("Checking if the Flyout is displayed");
		Assert.assertTrue(Flyout.isDisplayed());
	}
	
	@Test(dependsOnMethods = {"LoginFlyout"})
	public void ClosingFlyout() {
		System.out.println("Closing the Flyout");
		XClosing.click();
		Boolean checkpoints1;
		try {
			Flyout.isDisplayed();
			checkpoints1=true;
		}catch(Exception e) {
			checkpoints1=false;
		}		
		Assert.assertFalse(checkpoints1);		
	}
	
	@Test(dependsOnMethods = {"ClosingFlyout"})
	public void LoginButton() {
		System.out.println("Clicking on the login button");
		Assert.assertTrue(LoginButton.isDisplayed());
		LoginButton.click();
		ClosingFlyout();
		driver.quit();
	}
	


}
