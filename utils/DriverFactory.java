package utils;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import pages.Base;
import utils.WebDriverThread;

public class DriverFactory extends Base  {
	
	private static List<WebDriverThread> webDriverThreadPool=Collections.synchronizedList(new ArrayList<WebDriverThread>());
	
	private static ThreadLocal<WebDriverThread> driverThread;
	
	
	public static void instantiateDriverObject(){
		driverThread=new ThreadLocal<WebDriverThread>(){
			
			@Override
			protected WebDriverThread initialValue(){
				WebDriverThread webDriverThread = null;
				System.out.println("*****************");
				try {
					webDriverThread = new WebDriverThread();
				} catch (IOException e) {
					e.printStackTrace();
				}
				webDriverThreadPool.add(webDriverThread);
				return webDriverThread;
			}
		};
	}
	
	public static WebDriver getDriver() throws Exception{
		
		return driverThread.get().getDriver();
	}
	
	
	
	
	@AfterAll
	public static void closeDriverObjects(){
		
		for(WebDriverThread webDriverThread : webDriverThreadPool){
			
			webDriverThread.quitDriver();
		}
	}
}
