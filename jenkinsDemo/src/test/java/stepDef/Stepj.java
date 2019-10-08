package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;

public class Stepj {
	
	WebDriver driver;
	
	@Given("user launch browser")
	public void user_launch_browser() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avyaan\\Downloads\\selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    
	}

	@Then("open google")
	public void open_google() {
	    driver.get("https://www.google.com/");
	}
	


}
