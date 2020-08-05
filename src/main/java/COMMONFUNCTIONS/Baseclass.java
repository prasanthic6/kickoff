package COMMONFUNCTIONS;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class Baseclass {
	// here to create a config obj to call tha elements and invoke the file 
	Readconfig rc=new Readconfig();
	/*one way without using config properties 
 public String baseURL=" http://www.demo.guru99.com/V4/";
 public String UserID="mngr275354";
 public String Password="UhabYtu";*/
	//2nd way with using config properties
	public String baseURL=rc.getApplicationURL();
	public String UserID=rc.getUsername();
	public String Password=rc.getPassword();
 public  WebDriver driver;
 public static Logger logger;
 // to run the desired browser that why i am using parameter annotation
 @Parameters("browser")
 @BeforeClass
 public void setUp( String br)
 {
	 
 // in bracket you can specify name of the project
 //here we need to create logger instance so we need to pass class name 
  logger=Logger.getLogger("kickoff");
 //in bracket you can specify name of the file
  PropertyConfigurator.configure("log4j.properties");
 //DOMConfigurator.configure("log4j.xml");
  if(br.equals("firefox"))
  {
  System.setProperty("webdriver.gecko.driver",rc.getFirefoxPath());
  driver = new FirefoxDriver();
 }
  else if (br.equals("chrome"))
  {
	  System.setProperty("webdriver.gecko.driver",rc.getChromePath());
	  driver = new ChromeDriver();
  }
  driver.get(baseURL);
  }
 
 @AfterClass
 public void tearDown()
 {
	 driver.quit();
 }
}