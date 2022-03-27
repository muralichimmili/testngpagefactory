package pagestepdefnitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Base;
import pages.CreateAccountPage;



import java.util.List;
import java.util.Map;

public class CreateAccountPageStepDefinitions extends Base{
	
	@Then("User navigate to the create account page")
	public void user_navigate_to_the_create_account_page() {
		currentPage.As(CreateAccountPage.class).isCreateAccountTextDisplayed();
	}
	
	@And("User enter all the required details")
	public void user_enter_all_the_required_details(DataTable table) {
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);
		currentPage.As(CreateAccountPage.class).enterFirstName(rows.get(0).get("FName"), rows.get(0).get("LName"));
		
	}

}
