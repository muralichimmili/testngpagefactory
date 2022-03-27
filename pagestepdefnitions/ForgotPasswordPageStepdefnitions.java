package pagestepdefnitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Base;
import pages.ForgetPwdPage;
import pages.LoginPage;

public class ForgotPasswordPageStepdefnitions extends Base {
	
	@Then("User navigate to the forgot password page")
	public void User_click_on_forgot_password_link() throws Exception {
		currentPage.As(ForgetPwdPage.class).isEmailDisplayed();
	}
	
	@Then("^User enter the \"([^\"]*)\" email address$")
	public void And_User_enter_the_email_address(String email) throws Exception {
		currentPage.As(ForgetPwdPage.class).enterEmail(email);
	}
	
	 

}
