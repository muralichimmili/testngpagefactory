package pagestepdefnitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.DriverFactory;

public class Hooks   {
	
	 @Before
	    public void Initialize() throws Exception  {
		 DriverFactory.instantiateDriverObject();
		 
	    }
	 
	 @After
	 public void CloseDrivers()  {
		 DriverFactory.closeDriverObjects();
	    }
	 
	 
	 
}
