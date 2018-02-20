package info.seleniumcucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;

public class PredefinedStepDefinitions implements BaseTest {
	protected WebDriver driver = DriverUtil.getDefaultDriver();
	//Navigation Steps
	
	//Step to navigate to specified URL
	@Then("^I navigate to \"([^\"]*)\"$")
	public void navigate_to(String link)
	{
		navigationObj.navigateTo(link);
	}
	
	//Input steps
	
	// enter text into input field steps
	@Then("^I enter \"([^\"]*)\" into input field having (.+) \"([^\"]*)\"$")
	public void enter_text(String text, String type,String accessName) throws Exception
	{
		miscmethodObj.validateLocator(type);
		inputObj.enterText(type, text, accessName);
	}
	
	//Click element Steps
	
		// click on web element
		@Then("^I click on element having (.+) \"(.*?)\"$")
		public void click(String type,String accessName) throws Exception
		{
			miscmethodObj.validateLocator(type);
			clickObj.click(type, accessName);
		}
		
		//Progress methods
		
		// wait for specific period of time
		@Then("^I wait for (\\d+) sec$")
		public void wait(String time) throws NumberFormatException, InterruptedException
		{
			progressObj.wait(time);
		}
		
		//wait for specific element to display for specific period of time
		@Then("^I wait (\\d+) seconds for element having (.+) \"(.*?)\" to display$")
		public void wait_for_ele_to_display(String duration, String type, String accessName) throws Exception
		{
			miscmethodObj.validateLocator(type);
			progressObj.waitForElementToDisplay(type, accessName, duration);
		}
}