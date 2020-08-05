package GURU99.KICKOFF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
//call to webelements
    WebDriver driver;

    @FindBy(name="uid")

    WebElement username;

    @FindBy(name="password")

    WebElement password; 
   
    @FindBy(name="btnLogin")

    WebElement login;
//constructor
    public Loginpage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
    //Methods
    public void setUsername(String userid)
    {
    	//webelement . sendkey (to pass the keys)
    	username.sendKeys(userid);
    }
    public void setPassword(String pwd)
    {
    	password.sendKeys(pwd);
    }
    public void clickSubmit()
    {
    	login.click();;
    }
}
