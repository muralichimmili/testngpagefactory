package automationScripts;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Base;
import pages.CreateAccountPage;
import pages.CreatePage;
import pages.ForgetPwdPage;
import pages.LoginPage;
import utils.DriverFactory;
import static pages.BasePage.currentPage;

public class TestScript4 extends Base {
	
	
	
	  @Test(groups= {"smoke"}) public void forGetPwd() throws Exception {
	  DriverFactory.getDriver().get("http:facebook.com");
	  currentPage=GetInstance(LoginPage.class);
	  currentPage.As(LoginPage.class).rightClickOnForgotPwd();
	  //currentPage.As(ForgetPwdPage.class).enterEmail("prasad@gmail.com");
	  
	  }
	 
	
}
