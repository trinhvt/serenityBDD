package demo.serenity.alertpopup.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demo.serenity.alertpopup.steps.serenity.AlertPopUpSteps;
import net.thucydides.core.annotations.Steps;

public class AlertPopUpScenarioSteps {

	@Steps
	AlertPopUpSteps popUpStep;

	@Given("^the page \"(.*?)\" is visited$")
	public void the_page_is_visited(String website) throws Throwable {
		popUpStep.open_page(website);

	}

	@Given("^go inside the \"(.*?)\" frame$")
	public void go_inside_the_frame(String frame) throws Throwable {
		popUpStep.go_inside_frame(frame);
	}

	@Given("^input \"(.*?)\" on prompt dialog box \"(.*?)\"$")
	public void input_on_prompt_dialog_box(String text, String box) throws Throwable {
		popUpStep.input_dialog_box(text, box);
	}

	@Then("^assert that the text \"(.*?)\" element is \"(.*?)\"$")
	public void assert_that_the_text_element_is(String id, String msg) throws Throwable {
		popUpStep.assert_text_element(id, msg);

	}

	@Given("^choose CANCEL on confirm dialog box \"(.*?)\"$")
	public void choose_CANCEL_on_confirm_dialog_box(String dialog) throws Throwable {
		popUpStep.choose_cancel(dialog);
	}

	@Given("^choose OK on confirm dialog box \"(.*?)\"$")
	public void choose_OK_on_confirm_dialog_box(String dialog) throws Throwable {
		popUpStep.choose_ok(dialog);
	}

	@Then("^assert that text on \"(.*?)\" popup box is \"(.*?)\"$")
	public void assert_that_text_on_popup_box_is(String css, String msg) throws Throwable {
		popUpStep.assert_text_popup(css, msg);
	}

}
