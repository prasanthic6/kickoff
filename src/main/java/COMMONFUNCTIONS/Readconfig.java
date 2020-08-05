package COMMONFUNCTIONS;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;
	// i will create constructor 
	public Readconfig()
	{
	// first already i have created a file  ,that file i am wirting file object, in bracket properties path .
	File src = new File("./DATA/config.properties");
	try {
	FileInputStream fis=new FileInputStream(src);
	// we have to create a object for properties
	pro=new Properties();
	//load is a method , complete file will be load
	pro.load(fis);
	}
	catch (Exception e) {
		System.out.println("Exception is " +e.getMessage());
	
	}

	}
public String getApplicationURL()
{
String url=pro.getProperty("baseURL");
return url;
}
public String getUsername()
{
String username=pro.getProperty("UserID");
return username ;
}
public String getPassword()
{
String password=pro.getProperty("Password");
return password ;
}
public String getFirefoxPath()
{
String firefox=pro.getProperty("firefoxpath");
return firefox ;
}
public String getChromePath()
{
String chrome=pro.getProperty("firefoxpath");
return chrome ;
}
}