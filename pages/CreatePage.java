package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreatePage extends BasePage {

	
	@FindBy(how=How.LINK_TEXT,using="Sign Up")
	private WebElement signUp;
	
	public CreateAccountPage clickonSignUp() throws Exception {
		signUp.click();
		return GetInstance(CreateAccountPage.class);
	}

}
