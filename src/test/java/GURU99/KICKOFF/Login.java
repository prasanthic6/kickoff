package GURU99.KICKOFF;

import org.testng.Assert;
import org.testng.annotations.Test;

import COMMONFUNCTIONS.Baseclass;

public class Login extends Baseclass
{
  @Test
  public void loginTest()
  {
	 
	  logger.info("URL is Opened");
	  
	  Loginpage lp=new Loginpage(driver);
	  
	  lp.setUsername(UserID);
	  logger.info("Entered username");
	  
	  lp.setPassword(Password);
	  logger.info("Entered password");
	  lp.clickSubmit();
	  
	  //checking the title
	  if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	  {
		  //verify the condition
		  Assert.assertTrue(false);
		  logger.info("condition is false");
		 
	  }
	  else
	  {
		  Assert.assertTrue(true);
		  logger.info("condition is true");
		
	  }
  }
 
}
