package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ForgetPwdPage extends BasePage {
	


	
	@FindBy(how=How.ID,using="identify_email")
	private WebElement mailText;
	
	public void enterEmail(String email) {
		mailText.sendKeys(email);
	}
	
	public void isEmailDisplayed() {
		if(mailText.isDisplayed())
			Assert.assertTrue(true, "Email is displayed and navigated to forgot mail successfully");
		else
			Assert.fail("Not naviagated to forgot email page");
	}
	

}
