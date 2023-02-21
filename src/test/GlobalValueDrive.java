package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//getting global values from properties external file into Java 
//data.properties defined to get value from there 
public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		
		//properties object
		Properties prop = new Properties();
		
		//input stream for file
		FileInputStream fis = 
				new FileInputStream("/Users/mushfequezihan/eclipse-workspace/TestNGtutorial/src/data.properties");
		
		//loading and reading value from properties
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		//setting value for properties
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		
		//output stream to properties file
		FileOutputStream fos = 
				new FileOutputStream("/Users/mushfequezihan/eclipse-workspace/TestNGtutorial/src/data.properties");
		
		//writing in properties file
		prop.store(fos, null);																				
		
	}
}
