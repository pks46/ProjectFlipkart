package Core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadingPropertyFile {
	public static Properties prop= null;
	
	public static void read() {
		
		if(prop==null) {
			try {
				File details = new File(System.getProperty("user.dir")+"/UserDetails.properties");
				FileInputStream file = new FileInputStream(details);
				prop = new Properties();
				prop.load(file);
				file.close();		
				
			}catch(Exception e) {
				System.out.println("File doesn't exists!");
			}
		}
		
	}
}
