package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {
	
	
	@FindBy(how=How.LINK_TEXT,using="Create a Page")
	private WebElement createPage;
	
	@FindBy(how=How.LINK_TEXT,using="Forgotten password?")
	private WebElement forgetPwd;
	
	@FindBy(how=How.CSS,using="img[alt='Facebook']")
	private WebElement facebookImage;
	
	public CreatePage clickOnCreatePage() throws Exception {
		createPage.click();
		return GetInstance(CreatePage.class);
	}
	
	public ForgetPwdPage clickOnforgetPwd() throws Exception {
		forgetPwd.click();
		return GetInstance(ForgetPwdPage.class);
	}
	
	
	
	  public void rightClickOnForgotPwd() throws Exception {
	  GetInstance(LoginPage.class).mouseActions().keyDown(Keys.SHIFT).click(
	  forgetPwd).keyUp(Keys.SHIFT).build().perform();
	  
	  }
	 
	
	public void isFacebookLoginPageDisplayed() {
		if(facebookImage.isDisplayed())
			Assert.assertTrue(true, "Navigated to facebook login page successfully");
		else
			Assert.fail("facebook login page is not displayed");
	}
	
	
	

}
