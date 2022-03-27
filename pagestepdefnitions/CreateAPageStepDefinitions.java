package pagestepdefnitions;

import static pages.BasePage.currentPage;

import io.cucumber.java.en.And;
import pages.Base;
import pages.CreatePage;


public class CreateAPageStepDefinitions extends Base {
	
	@And("User click on signup button")
	public void And_User_click_on_signup_button() throws Exception {
		currentPage=currentPage.As(CreatePage.class).clickonSignUp();
	}

}
