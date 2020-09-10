package stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;
	@Given("User Launch browser")
	public void user_launch_browser()
	{
	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
	  driver=new FirefoxDriver();
	 
	  lp=new LoginPage(driver);
	}

	@Given("User open application url {string}")
	public void user_open_application_url(String url) 
	{
		driver.get(url);
	}

	@Given("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) 
	{
	   lp.setEmail(email);
	   lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
	    lp.clickLogin();
	    Thread.sleep(3000);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) 
	{
		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else 
		{
			Assert.assertEquals(title,driver.getTitle()); 
		}
	   
	}

	@When("Click on Logout link")
	public void click_on_logout_link() throws InterruptedException
	{
		Thread.sleep(2000);
		lp.clickLogout();
		Thread.sleep(1000);
	   
	}

	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	}
}
