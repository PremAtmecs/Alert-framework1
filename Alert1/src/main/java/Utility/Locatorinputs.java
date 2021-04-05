package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Locatorinputs {
	File file=new File(("user.dir")+"\\src\\main\\java\\Utility\\Alert.properties");
	FileInputStream inputstream=null;
	Properties property=null;
	public Locatorinputs() {
		try {
			inputstream=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(inputstream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getUrl() {
		return property.getProperty("Url");
	}
	public String getDriver() {
		return property.getProperty("Driver");
	
	}
	public String getDriverpath() {
		return property.getProperty("Driverpath");
	
	}
	public String getreqrow() {
		return property.getProperty("alertButton");
		
}
	public String getreqcolumn() {
		return property.getProperty("xpath");
		
}
}
