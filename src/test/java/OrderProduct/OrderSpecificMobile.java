package OrderProduct;

import java.io.File;

import org.openqa.selenium.By;

import Core.ReadingPropertyFile;
import Core.StartingChromeBrowser;

public class OrderSpecificMobile extends StartingChromeBrowser{
	
	public static File folder;
	
	public static void CreatingFolder() {
		try {
			folder = new File(System.getProperty("user.dir")+"/screenshots");
			if(!folder.exists()) {
				folder.mkdir();
			}
		}catch(Exception e){
			
		}
	}
	public static void GotoMobilePage() throws Exception{
		StartingChromeBrowser.StartingBrowser();		
		driver.findElement(By.xpath("//div[@class='xtXmba' and text()='Mobiles']")).click();
		Thread.sleep(5000);
		
	}
	public static void FilterMobile() throws Exception{
		System.out.println("going to filter stage !");
		ReadingPropertyFile.read();
		String brand = ReadingPropertyFile.prop.getProperty("Brand");
		String ram = ReadingPropertyFile.prop.getProperty("RAM");
		System.out.println("Need a Mobile of Brand = "+brand+ " and Ram of ="+ram);
		String brandfilter = "//div[contains(text(),'"+brand+"')]";
		String ramfilter ="//div[contains(text(),'"+ram+"')]";
		driver.findElement(By.xpath(brandfilter)).click();
		Thread.sleep(5000);
		String CurrURL = driver.getCurrentUrl();
		if(CurrURL.contains(brand)) {
			driver.findElement(By.xpath(ramfilter)).click();
		}
		else {
			driver.findElement(By.xpath(brandfilter)).click();
		}
//		CreatingFolder();
//		TakeScreenshot.shot(folder+"/scr1.jpg");
	}
	public static void Close() {
		driver.close();
		
	}
}
