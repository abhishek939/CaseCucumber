package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObject {
	@FindBy(how=How.NAME,using="userName")
	public static WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	public static WebElement password;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="login")
	public static WebElement login;
	

}
