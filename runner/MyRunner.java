package runner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import utils.WebDriverThread;


@CucumberOptions(
		 //features = "@rerun/failed_scenarios.txt",
		features= "src/test/java/features",
       glue = {"pagestepdefnitions"},
       plugin = { "html:target/cucumber-reports.html","rerun:rerun/failed_scenarios.txt"},
     //  tags = "@BuyingTab or @BuyingDesktop or @BuyCar"
       tags = "@CreateAccount",
       monochrome = false,
       dryRun = false
)
public class MyRunner extends AbstractTestNGCucumberTests {

}

