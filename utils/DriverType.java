package utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public enum DriverType implements DriverSetup  {
	
	FIREFOX {
	
		
		
		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.merge(capabilities);
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver(firefoxOptions);
		}

		public DesiredCapabilities getDesiredCapabilities() {
			DesiredCapabilities capabilities=new DesiredCapabilities();
			FirefoxOptions browserOptions = new FirefoxOptions();
			browserOptions.setPlatformName("Windows 10");
			browserOptions.setBrowserVersion("latest");
			Map<String, Object> sauceOptions = new HashMap<String, Object>();
			browserOptions.setCapability("sauce:options", sauceOptions);
			capabilities.merge(browserOptions);
			return capabilities;
		}
		
	},
	
    CHROME {
		
	
		
		

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			ChromeOptions options=new ChromeOptions();
			options.merge(capabilities);
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver(options);
		}

		public DesiredCapabilities getDesiredCapabilities() {
			DesiredCapabilities capabilities=new DesiredCapabilities();
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName("Windows 10");
			browserOptions.setBrowserVersion("latest");
			Map<String, Object> sauceOptions = new HashMap<String, Object>();
			browserOptions.setCapability("sauce:options", sauceOptions);
			capabilities.merge(browserOptions);
			return capabilities;
		}
		
	},
    
    EDGE {
		
		
		public WebDriver getWebDriverObject(){
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
			
		}

		public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
			// TODO Auto-generated method stub
			return null;
		}

		public DesiredCapabilities getDesiredCapabilities() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};

}
