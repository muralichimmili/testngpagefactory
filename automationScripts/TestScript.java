package automationScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Base;
import pages.CreateAccountPage;
import pages.CreatePage;
import pages.ForgetPwdPage;
import pages.LoginPage;
import utils.DriverFactory;
import static pages.BasePage.currentPage;

public class TestScript extends Base {
	
	
	@Parameters({"username","password"})
	@Test(priority=2,groups="regression")
	public void createAccount(String username,String pass) throws Exception {
		DriverFactory.getDriver().get("http:facebook.com");
		currentPage=GetInstance(LoginPage.class);
		currentPage=currentPage.As(LoginPage.class).clickOnCreatePage();
		currentPage=currentPage.As(CreatePage.class).clickonSignUp();
		currentPage.As(CreateAccountPage.class).enterFirstName(username,pass);
		
		
		
		
	}
	
	
	
}
