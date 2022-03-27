package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateAccountPage extends BasePage {
	

	
	
	@FindBy(how=How.NAME,using="firstname")
	private WebElement firstName;
	
	@FindBy(how=How.NAME,using="lastname")
	private WebElement lastName;
	
	@FindBy(how=How.XPATH,using="//div[.='Create a new account']")
	private WebElement createAccountText;
	
	
	
	public void enterFirstName(String fname,String lname) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
	}
	
	public void isCreateAccountTextDisplayed() {
		if(createAccountText.isDisplayed())
			Assert.assertTrue(true, "Navigated to create account page successfully");
		else
			Assert.fail("Not naviagated to create account page");
	}
	

}
