package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class DrinksStepdefs {
    @Given("the machine is not empty")
    public void theMachineIsNotEmpty() {
        System.out.println("The machine is not empty");
    }

    @Then("the following drinks should be available:")
    public void theFollowingDrinksShouldBeAvailable(Map<String,String> rate) {
        System.out.println(rate);
    }
}
