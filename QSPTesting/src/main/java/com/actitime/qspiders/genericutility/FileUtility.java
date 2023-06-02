package com.actitime.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class will be used for file handling/ data management
 * @author Chandan N R
 *
 */
public class FileUtility {
/**
 * This method will be used to read the common data from property file
 * @param key
 * @return value
 * @throws IOException
 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/actitime.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;	
	}
}