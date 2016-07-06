package demo.serenity.attribute.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demo.serenity.attribute.steps.serenity.AttributeSteps;
import net.thucydides.core.annotations.Steps;

public class AttributeScenarioSteps {

	@Steps
	AttributeSteps attStep;

	@Given("^the page \"([^\"]*)\" is visited$")
	public void the_page_is_visited(String website) throws Throwable {
		attStep.open_page(website);
	}

	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" is \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_is(String att, String xpath, String msg) throws Throwable {
		attStep.assert_is(att, xpath, msg);
	}

	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" has \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_has(String att, String xpath, String xgif) throws Throwable {
		attStep.assert_has(att, xpath, xgif);
	}

	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" does not have \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_does_not_have(String att, String xpath, String xgif) throws Throwable {
		attStep.assert_not_have(att, xpath, xgif);
	}

	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" is not \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_is_not(String att, String xpath, String msg) throws Throwable {
		attStep.assert_is_not(att, xpath, msg);
	}
}
