package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterObject;

public class Stepdefs {
	WebDriver driver;
	@Given("User is on Register page")
	public void user_is_on_Register_page() {
		driver = UtilityClass1.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		PageFactory.initElements(driver,RegisterObject.class);
	}

	@When("User enter username as {string}")
	public void user_enter_username_as(String string) {
	    RegisterObject.username.sendKeys(string);
	}

	@When("User enter first name as {string}")
	public void user_enter_first_name_as(String string) {
		RegisterObject.firstname.sendKeys(string);
	}

	@When("User enter last name as {string}")
	public void user_enter_last_name_as(String string) {
	    RegisterObject.lastname.sendKeys(string);
	}

	@When("User enter password as {string}")
	public void user_enter_password_as(String string) {
	    RegisterObject.password.sendKeys(string);
	}

	@When("User enter confirmpassword as {string}")
	public void user_enter_confirmpassword_as(String string) {
	    RegisterObject.confirmpassword.sendKeys(string);
	}

	@When("User select gender as {string}")
	public void user_select_gender_as(String string) {
	    RegisterObject.gender.sendKeys(string);
	}

	@When("User enter Email Address as {string}")
	public void user_enter_Email_Address_as(String string) {
	    RegisterObject.emailaddress.sendKeys(string);
	}

	@When("User enter Mobile number as {string}")
	public void user_enter_Mobile_number_as(String string) {
	    RegisterObject.mobileNumber.sendKeys(string);	
	}

	@When("user enter date of birth as {string}")
	public void user_enter_date_of_birth_as(String string) {
	    RegisterObject.dob.sendKeys(string);
	}

	@When("user enter Address as {string}")
	public void user_enter_Address_as(String string) {
	    RegisterObject.address.sendKeys(string);
	}

	@When("user select security question as {string}")
	public void user_select_security_question_as(String string) {
	   
	}

	@When("user Enter answer as {string}")
	public void user_Enter_answer_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user click on register button")
	public void user_click_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user can do successfull register")
	public void user_can_do_successfull_register() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

   
}
