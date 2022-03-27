package pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utils.DriverFactory;

public class Base  {
	
	public static BasePage currentPage;
	public <TPage extends BasePage> TPage GetInstance(Class<TPage> page) throws Exception {
		
		Object object=PageFactory.initElements(DriverFactory.getDriver(),page);
		return page.cast(object);
	}
	
	
	
	
	
	

}
