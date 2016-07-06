package demo.vnu.hus.elementtext.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demo.vnu.hus.elementtext.steps.serenity.ElementSteps;
import net.thucydides.core.annotations.Steps;

public class ElementTestSteps {

	@Steps
	ElementSteps elementTest;
	
	
	@Given("^the page \"(.*?)\" is visited$")
	public void the_page_is_visited(String website) throws Throwable {
	    elementTest.open_page(website);
	}

	@Then("^assert that the text \"(.*?)\" element is \"(.*?)\"$")
	public void assert_that_the_text_element_is(String css, String msg1) throws Throwable {
	    elementTest.assert_equals(css,msg1);
	}

	@Then("^assert that the text \"(.*?)\" element is not \"(.*?)\"$")
	public void assert_that_the_text_element_is_not(String css, String msg2) throws Throwable {
	   elementTest.assert_not_equals(css,msg2);
	}

	@Then("^assert that the text \"(.*?)\" element has \"(.*?)\"$")
	public void assert_that_the_text_element_has(String css, String msg3) throws Throwable {
	   elementTest.assert_has_text(css,msg3);
	}

	@Then("^assert that the text \"(.*?)\" element does not have \"(.*?)\"$")
	public void assert_that_the_text_element_does_not_have(String css, String msg4) throws Throwable {
	  elementTest.assert_does_not_has(css, msg4);
	}

}
