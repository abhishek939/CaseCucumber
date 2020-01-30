package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterObject {
	@FindBy(how=How.NAME,using="userName")
	public static WebElement username;
	
	@FindBy(how=How.NAME,using="firstName")
	public static WebElement firstname;
	
	@FindBy(how=How.NAME,using="lastName")
	public static WebElement lastname;
	
	/* @FindBy(how=How.PARTIAL_LINK_TEXT,using="login")
	public staticWebElement login;*/
	
	@FindBy(how=How.NAME,using="password")
	public static WebElement password;
	
	@FindBy(how=How.NAME,using="confirmPassword")
	public static WebElement confirmpassword;
	
	@FindBy(how=How.XPATH,using="//input[@value='Female']")
	public static WebElement gender;
	
	@FindBy(how=How.NAME,using="emailAddress")
	public static WebElement emailaddress;
	
	@FindBy(how=How.NAME,using="mobileNumber")
	public static WebElement mobileNumber;
	
	@FindBy(how=How.NAME,using="dob")
	public static WebElement dob;
	
	@FindBy(how=How.ID,using="address")
	public static WebElement address;
	
	@FindBy(how=How.NAME,using="securityQuestions")
	public static WebElement securityQuestion;
	
	@FindBy(how=How.NAME,using="answer")
	public static WebElement answer;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="submit")
	public static WebElement register;
	

}
