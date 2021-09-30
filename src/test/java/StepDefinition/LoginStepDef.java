package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enters invalid username")
	public void user_enters_invalid_username() {
	   driver.findElement(By.id("txtUsername")).sendKeys("Adminwrong");
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("adminwrong");
	}
	
	@When("user enters username")
	public void user_enters_username() {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	    driver.quit();
	}
	
	@Then("User should not be able to login successfully")
	public void user_should_not_be_able_to_login_successfully() {
	    driver.quit();
	}
	
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username); 
	}
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	@When("^User enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
    }

}
