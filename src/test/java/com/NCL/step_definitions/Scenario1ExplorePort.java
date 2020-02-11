package com.NCL.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NCL.pages.PortsPage;
import com.NCL.utilities.ConfigurationReader;
import com.NCL.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1ExplorePort {
	
	
//	@Given("a guest is on Homepage")
//	public void a_guest_is_on_Homepage() {
//		String url = ConfigurationReader.getProperty("url");
//	  Driver.getDriver().get(url);
//	  WebDriver driver = new ChromeDriver();
//
////String currentURL = driver.getCurrentUrl(); 
////System.out.println(currentURL);
//	}
//
//	@Given("i navigated to Ports page")
//	public void i_navigated_to_Ports_page() {
//		 PortsPage portPage = new PortsPage();
//		 Driver driver = new Driver();
//		 portPage.exploreBnt.click();
//		 //driver.sleep(1000);
//		 portPage.portsDrDwnBtn.click();
//		 
////		 HomePage.exploreBtn.click();
////	        browser.sleep(1000).then(() => {
////	            HomePage.portsDrDwnBtn.click();
//	}
//
	@Given("a guest is on Homepage")
	public void a_guest_is_on_Homepage() {
		String url = ConfigurationReader.getProperty("url");
	  Driver.getDriver().get(url);
	 // WebDriver driver = new ChromeDriver();
	 // String currentURL = driver.getCurrentUrl(); 
	System.out.println("I passed");
	}

	@Then("i navigated to Ports page")
	public void i_navigated_to_Ports_page() {
		 PortsPage portPage = new PortsPage();
		//Driver driver = new Driver();
		 portPage.exploreBnt.click();
		 //driver.sleep(1000);
		 portPage.portsDrDwnBtn.click();
		 System.out.println("I didn't pass");
	}

	@When("i search for Honolulu port")
	public void i_search_for_Honolulu_port() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("map zoomed to show selected port")
	public void map_zoomed_to_show_selected_port() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("port is on the middle of the map")
	public void port_is_on_the_middle_of_the_map() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("port displayed as Port of Departure")
	public void port_displayed_as_Port_of_Departure() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}