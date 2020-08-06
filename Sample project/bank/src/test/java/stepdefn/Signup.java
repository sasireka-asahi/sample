package stepdefn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup extends Baseclass{
	
	@Given("user navigates to sign up page")
	public void user_navigates_to_Landing_page() {
		LaunchBrowser();
		goToUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	} 

	@When("I enter email address as {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void i_enter(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8,String s9) {
	    // Write code here that turns the phrase above into concrete actions
		Pojoclass p=new Pojoclass();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		insertValues(p.getEmail(),s1);
		p.getCreatebtn().click();
		insertValues(p.getFirstname(),s2);
		insertValues(p.getLastname(),s3);
		insertValues(p.getPassword(),s4);
		insertValues(p.getAddress(),s5);
		insertValues(p.getPhoneno(),s6);
		insertValues(p.getCity(),s7);
		dropdown(p.getState(),s8);
		dropdown1(p.getCountry(),s9);
		p.getRlink().click();
	}

	
	
	}

