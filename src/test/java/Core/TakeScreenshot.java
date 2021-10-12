package Core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static void shot(WebDriver driver, String path) {
		File scrShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrShot, new File(path));
			System.out.println("Screenshot saved in the Path in a "+path);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}