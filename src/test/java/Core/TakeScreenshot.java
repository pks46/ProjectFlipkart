package Core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot extends StartingChromeBrowser{

	public static void shot(String path) {
		File scrShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrShot, new File(path));
			System.out.println("Screenshot saved in the Path in "+path);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
