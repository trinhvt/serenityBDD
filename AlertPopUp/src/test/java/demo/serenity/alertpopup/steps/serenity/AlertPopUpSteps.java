package demo.serenity.alertpopup.steps.serenity;

import org.junit.Assert;

import demo.serenity.alertpopup.pages.AlertPopUpPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AlertPopUpSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AlertPopUpPage alertPopUp;
	
	@Step
	public void open_page(String website) {
		alertPopUp.setDefaultBaseUrl(website);
		alertPopUp.open();
		alertPopUp.setAlertDriver();
	}

	@Step
	public void go_inside_frame(String frame) {
		alertPopUp.goToInsideFrame(frame);

	}

	@Step
	public void input_dialog_box(String text, String box) {
		alertPopUp.goToDialogBox(text,box);
	}

	@Step
	public void assert_text_element(String id, String msg) {
		// TODO Auto-generated method stub
		String alString=alertPopUp.getElementIs(id,msg);
		
		Assert.assertEquals(alString, msg);
	}

	@Step
	public void choose_cancel(String dialog) {
		// TODO Auto-generated method stub
		alertPopUp.gotToDialogBoxCan(dialog);
	}

	@Step
	public void choose_ok(String dialog) {
		// TODO Auto-generated method stub
		alertPopUp.gotToDialogBoxOK(dialog);
	}

	public void assert_text_popup(String css, String msg) {
		// TODO Auto-generated method stub
		String st=alertPopUp.goToAlert(css);
		Assert.assertEquals(st, msg);
	}

	

	

}
