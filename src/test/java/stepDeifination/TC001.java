package stepDeifination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC001 {
	public WebDriver driver;

	@Given("^Open Application$")
	public void openbrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Documents\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened");
	}

	@When("^Verify Title$")
	public void VerifyTitle() {
		System.out.println("verify the title");
	}

	@Then("^Close Application$")
	public void closebrowser() {
		driver.quit();
		System.out.println("loginpage should be opened");
	}

}
