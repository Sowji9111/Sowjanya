package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

public class basesteps {
	WebDriver driver;
	PackerAndMoverPage obj;
	@Given("i am on the packer and mover page")
	public void i_am_on_the_packer_and_mover_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		obj= new PackerAndMoverPage(driver);
		obj.selectmenu();
		obj.selectpackerandmover();
	}
	
	@When("i select city")
	public void i_select_city() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		obj.selectCity();
		obj.selectlocality1();
	}
//
//	@When("i select locality")
//	public void i_select_locality() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i click on check price button")
//	public void i_click_on_check_price_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i <{string}> in inventory")
//	public void i_in_inventory(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i add wanted appliances in the search bar")
//	public void i_add_wanted_appliances_in_the_search_bar() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i click confirm on Confirm your shifting Date & Slot pop-up")
//	public void i_click_confirm_on_confirm_your_shifting_date_slot_pop_up() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the summary page will be displayed")
//	public void the_summary_page_will_be_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i search for source city")
//	public void i_search_for_source_city() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i search for destination city")
//	public void i_search_for_destination_city() {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i select shifting date")
//	public void i_select_shifting_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i add items in inventory")
//	public void i_add_items_in_inventory() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i click on continue button")
//	public void i_click_on_continue_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("it shows the relocate pop-up")
//	public void it_shows_the_relocate_pop_up() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i enter pickup locality")
//	public void i_enter_pickup_locality() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i enter destination locality")
//	public void i_enter_destination_locality() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i click to update location")
//	public void i_click_to_update_location() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("the request is sucessfully submitted")
//	public void the_request_is_sucessfully_submitted() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i click the vehicle for relocation")
//	public void i_click_the_vehicle_for_relocation() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i click the continue button")
//	public void i_click_the_continue_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i select the <{string}>")
//	public void i_select_the(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i search for pickup from")
//	public void i_search_for_pickup_from() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i search for dropat")
//	public void i_search_for_dropat() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i select the vehicle")
//	public void i_select_the_vehicle() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i click on the schedule")
//	public void i_click_on_the_schedule() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i select the city only")
//	public void i_select_the_city_only() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("error is displayed")
//	public void error_is_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}



}