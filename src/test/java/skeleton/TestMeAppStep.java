package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginObject;


public class TestMeAppStep { 
	WebDriver driver;
//@Given("User is on login page")
//public void user_is_on_login_page() {
//	  driver = UtilityClass1.getDriver("chrome");
//	driver.get("http://10.232.237.143:443/TestMeApp/");

//}

@When("User enter username correct")
public void user_enter_username_correct() {
	  WebElement login =driver.findElement(By.linkText("SignIn"));
	  	login.click();
	  	WebElement email=driver.findElement(By.name("userName"));
	  	email.clear();
	  	email.sendKeys("lalitha");
	  	WebElement password=driver.findElement(By.name("password"));
	  	password.clear();
	  	password.sendKeys("Password123");
	  	
	  	WebElement loginclick=driver.findElement(By.name("Login"));
	  	loginclick.click();
}

@Then("user can go to login page")
public void user_can_go_to_login_page() {
    
    Assert.assertEquals("Home",driver.getTitle());
}

@Given("user is on login page")
public void user_is_on_login_page() {
	 driver = UtilityClass1.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		PageFactory.initElements(driver,LoginObject.class);
}

@When("user enter username as {string}")
public void user_enter_username_as(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	/*WebElement login =driver.findElement(By.linkText("SignIn"));
  	login.click();
  	WebElement email=driver.findElement(By.name("userName"));
  	email.clear();
  	email.sendKeys(string);*/
	LoginObject.username.sendKeys(string);
  
}

@When("user enter password as {string}")
public void user_enter_password_as(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	/*WebElement password=driver.findElement(By.name("password"));
  	password.clear();
  	password.sendKeys("Password123");*/
	LoginObject.password.sendKeys(string);
}

@When("user clicks on login button")
public void user_clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	WebElement loginclick=driver.findElement(By.name("Login"));
  	loginclick.click();

}

@Then("user can do successfully login")
public void user_can_do_successfully_login() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	  Assert.assertEquals("Home",driver.getTitle());
}


}
