package demo.vnu.hus.frame.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.vnu.hus.frame.steps.serenity.FrameStep;
import net.thucydides.core.annotations.Steps;

public class FrameScenarioSteps {

	@Steps
	FrameStep frameStep;

	@Given("^the page \"([^\"]*)\" is visited$")
	public void the_page_is_visited(String website) throws Throwable {
		frameStep.open_page(website);
	}

	@Given("^go inside the \"([^\"]*)\" frame$")
	public void go_inside_the_frame(String id) throws Throwable {
	    frameStep.go_inside_frame(id);
	}
	
	@Then("^assert that the \"([^\"]*)\" element is enabled$")
	public void assert_that_the_element_is_enabled(String name) throws Throwable {
	    frameStep.assert_enabled(name);
	}
	
	@Then("^assert that the \"([^\"]*)\" element is disabled$")
	public void assert_that_the_element_is_disabled(String name) throws Throwable {
		 frameStep.assert_disabled(name);
	}
	
	@Then("^assert that the \"([^\"]*)\" element is present$")
	public void assert_that_the_element_is_present(String xpath) throws Throwable {
	   frameStep.assert_present(xpath);
	}
	
	@Then("^assert that the \"([^\"]*)\" element is absent$")
	public void assert_that_the_element_is_absent(String xpath) throws Throwable {
		 frameStep.assert_absent(xpath);
	}
	
	
	@Then("^assert that the \"([^\"]*)\" attribute of \"([^\"]*)\" is \"([^\"]*)\"$")
	public void assert_that_the_attribute_of_is(String att, String name, String msg) throws Throwable {
		frameStep.assert_is(att,name,msg);
	
	}
	
	@Then("^assert that the \"([^\"]*)\" element is hidden$")
	public void assert_that_the_element_is_hidden(String name) throws Throwable {
	    frameStep.assert_hidden(name);
	}
	
	@When("^change \"([^\"]*)\" attribute of \"([^\"]*)\" into \"([^\"]*)\"$")
	public void change_attribute_of_into(String att, String name, String msg) throws Throwable {
	   frameStep.change_att(att,name,msg);
	}
	@Then("^assert that the \"([^\"]*)\" element is visible$")
	public void assert_that_the_element_is_visible(String name) throws Throwable {
	   frameStep.element_visiable(name);
	}
	@When("^highlight \"([^\"]*)\" element$")
	public void highlight_element(String name) throws Throwable {
		 frameStep.highligh_element(name);
	}

	@When("^set bound for \"([^\"]*)\" element$")
	public void set_bound_for_element(String name) throws Throwable {
	    frameStep.set_bound(name);
	}
	@When("^capture image of \"([^\"]*)\" element and save as \"([^\"]*)\"$")
	public void capture_image_of_element_and_save_as(String name, String png) throws Throwable {
	   frameStep.capture_image(name,png);
	}
}
