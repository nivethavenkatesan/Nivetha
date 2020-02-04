package cakes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class choco {
	@Given("i have some cakes in my place")
	public void i_have_some_cakes_in_my_place() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("i have some cakes in my hand");
	}

	@When("i ask my team to collect it")
	public void i_ask_my_team_to_collect_it() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("i ask my team to collect it");
	}

	@Then("my cakes disappear")
	public void my_cakes_disappear() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("my cakes disappear");
	}

}
