package pagestepdefnitions;

import static pages.BasePage.currentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Base;
import pages.LoginPage;

public class LoginPageStepDefnitions extends Base {
	
	@Given("User navigated to facebook login page")
	public void user_navigated_to_facebook_login_page() throws Exception {
		currentPage=GetInstance(LoginPage.class);
		currentPage.As(LoginPage.class).isFacebookLoginPageDisplayed();
		
	}
	
	@When("User click on create a page link")
	public void User_click_on_create_a_page_link() throws Exception {
		currentPage=currentPage.As(LoginPage.class).clickOnCreatePage();
	}
	
	@When("User click on forgot password link")
	public void User_click_on_forgot_password_link() throws Exception {
		currentPage=currentPage.As(LoginPage.class).clickOnforgetPwd();
	}
	

}
