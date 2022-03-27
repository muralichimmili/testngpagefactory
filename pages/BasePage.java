package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utils.DriverFactory;



public class BasePage extends Base {
	
	
	
	public <TPage extends BasePage> TPage As(Class<TPage> pageInstance) {
		
		try {
			return (TPage)this;
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}

	
	  public Actions mouseActions() throws Exception {
	  
	  return new Actions(DriverFactory.getDriver()); }
	 

	
}
