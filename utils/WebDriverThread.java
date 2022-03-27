package utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static utils.DriverType.FIREFOX;
import static utils.DriverType.valueOf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class WebDriverThread {
	
	private WebDriver webdriver;
	private DriverType selectedDriverType;
	private Properties p;
	private final DriverType defaultDriverType= FIREFOX;
	public WebDriverThread() throws IOException {
		
		FileInputStream fis=new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/env.properties"));
		p=new Properties();
		p.load(fis);
	}
	
	public WebDriver getDriver() throws Exception{
		
		
		if(null == webdriver){
			System.out.println("******************");
			selectedDriverType=determineEffectiveDriverType();
			DesiredCapabilities desiredCapabilities=selectedDriverType.getDesiredCapabilities();
			instantiateWebDriver(desiredCapabilities);
			getDriver().manage().deleteAllCookies();	
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			getDriver().get(p.getProperty("appurl"));
		}
		
		return webdriver;
	}
	
  
	
	private DriverType determineEffectiveDriverType(){
		DriverType driverType=defaultDriverType;
		try{
			System.out.println(p.getProperty("browser").toUpperCase());
			driverType=valueOf(p.getProperty("browser").toUpperCase());
		}catch(IllegalArgumentException ignored){
			System.err.println("Unknown driver specified,defaulting to '" + driverType + "'...");
		}
		
		return driverType;
	}
	
	public void instantiateWebDriver(DesiredCapabilities desiredCapabilities) throws MalformedURLException{
	System.out.println(p.getProperty("remote"));
		if(p.getProperty("remote").equals("sauce")){
		     URL SeleniumGridURL=new URL("");
		     
		     webdriver=new RemoteWebDriver(SeleniumGridURL,desiredCapabilities);
		}else{
			
			webdriver=selectedDriverType.getWebDriverObject(desiredCapabilities);
			
		}
			
		}
		
		
		
	
	
	public void quitDriver(){
		if(null!=webdriver){
			webdriver.quit();
		}
	}

}
