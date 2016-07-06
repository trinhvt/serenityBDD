package vnu.hus.demo.browser.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import vnu.hus.demo.browser.steps.serenity.BrowserSteps;

public class BrowserScenarioSteps {

	@Steps
	BrowserSteps brStep;
	
	@Given("^the home page is visited$")
	public void the_home_page_is_visited() throws Throwable {
	 
	}

	@Given("^the page \"(.*?)\" is visited$")
	public void the_page_is_visited(String website) throws Throwable {
	    brStep.visit_page(website);
	}
	@Given("^the page is refreshed$")
	public void the_page_is_refreshed() throws Throwable {
	    brStep.page_is_refreshed();
	}

	@Given("^maximize the window$")
	public void maximize_the_window1() throws Throwable {
	    brStep.maximize_window();
	}

	@Given("^go backward one page$")
	public void go_backward_one_page() throws Throwable {
	    brStep.go_backward_page();
	}

	@Given("^go forward one page$")
	public void go_forward_one_page() throws Throwable {
	    brStep.go_forward_page();
	}

	@Given("^the page \"([^\"]*)\" is opened on another window$")
	public void the_page_is_opened_on_another_window(String http) throws Throwable {
	    brStep.page_open_on_another_window(http);
	}

	@Then("^assert that the \"([^\"]*)\" text is present$")
	public void assert_that_the_text_is_present(String msg) throws Throwable {
	   brStep.assert_text_present(msg);
	}

	@Then("^assert that the \"([^\"]*)\" text is not present$")
	public void assert_that_the_text_is_not_present(String msg) throws Throwable {
	   brStep.assert_not_present(msg);
	}

	@Then("^assert that the page title is \"([^\"]*)\"$")
	public void assert_that_the_page_title_is(String msg) throws Throwable {
	   brStep.assert_page_title(msg);
	}

	@Then("^assert that the page title is not \"([^\"]*)\"$")
	public void assert_that_the_page_title_is_not(String msg) throws Throwable {
		brStep.assert_page_title_not(msg);
	}

	@Then("^assert that the page title has \"([^\"]*)\"$")
	public void assert_that_the_page_title_has(String msg) throws Throwable {
	    brStep.assert_page_title_has(msg);
	}

	@Then("^assert that the page title does not have \"([^\"]*)\"$")
	public void assert_that_the_page_title_does_not_have(String msg) throws Throwable {
	   brStep.page_title_does_not_have(msg);
	}

	@Then("^assert that the url is \"([^\"]*)\"$")
	public void assert_that_the_url_is(String https) throws Throwable {
	   brStep.assert_url_is(https);
	}

	@Then("^assert that the url is not \"([^\"]*)\"$")
	public void assert_that_the_url_is_not(String https) throws Throwable {
	   brStep.assert_url_is_not(https);
	}

	@When("^window dimension is changed with size \\((\\d+),(\\d+)\\)$")
	public void window_dimension_is_changed_with_size(int no1, int no2) throws Throwable {
	    brStep.dimension_is_changed_size(no1,no2);
	}

	@When("^scroll up or down in screen with value \\((\\d+),(\\d+)\\)$")
	public void scroll_up_or_down_in_screen_with_value(int no1, int no2) throws Throwable {
	    brStep.scroll_up_down_screen(no1,no2);
	}

	@When("^window is moved to location with coordinates \\((\\d+),(\\d+)\\)$")
	public void window_is_moved_to_location_with_coordinates(int no1, int no2) throws Throwable {
	    brStep.window_is_moved(no1,no2);
	}

	@When("^close current window$")
	public void close_current_window() throws Throwable {
	    brStep.close_current_window();
	}

	@When("^switch back to the original window$")
	public void switch_back_to_the_original_window() throws Throwable {
	   brStep.back_original_window();
	}

	@When("^open \"([^\"]*)\" link in new window and switch to it$")
	public void open_link_in_new_window_and_switch_to_it(String link) throws Throwable {
	   brStep.open_link_in_new_window(link);
	}

	@When("^open \"([^\"]*)\" dialog and switch to it$")
	public void open_dialog_and_switch_to_it(String dialog) throws Throwable {
	   brStep.open_dialog_and_switch(dialog);
	}

	
}
