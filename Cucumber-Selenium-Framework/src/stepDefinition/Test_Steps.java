package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class Test_Steps  {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://99tests.com");
		}
 
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath("/html/body/header/div/nav/div[2]/div[2]/ul/li[6]/a")).click();
		}
 
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
		List<List<String>> data = usercredentials.raw();
		driver.findElement(By.id("email")).sendKeys(data.get(0).get(0)); 
	    driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	    driver.findElement(By.xpath("//*[@id='signin_btn']")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
 
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		 driver.findElement (By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[8]/a")).click();
		 
	     driver.findElement (By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[8]/ul/div/div[2]/li[5]/a")).click();
	     //driver.quit();
	}
	 
	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
		
		System.out.println("LogOut Successfully");
	}
 
}