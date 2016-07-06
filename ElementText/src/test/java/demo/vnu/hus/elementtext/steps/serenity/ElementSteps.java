package demo.vnu.hus.elementtext.steps.serenity;


import org.junit.Assert;

import demo.vnu.hus.elementtext.pages.ElementPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ElementSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ElementPage elementPage;

	@Step
	public void open_page(String website) {
		// TODO Auto-generated method stub
		elementPage.setDefaultBaseUrl(website);
		elementPage.open();
		
	}

	@Step
	public void assert_equals(String css, String msg1) {
		// TODO Auto-generated method stub
		 Assert.assertEquals(this.getAlertMsg(css,msg1), msg1);
	}

	@Step
	public void assert_not_equals(String css, String msg2) {
		// TODO Auto-generated method stub
		Assert.assertNotEquals(this.getAlertMsg(css,msg2), msg2);
	}


	@Step
	public void assert_has_text(String css, String msg3) {

		
		Assert.assertEquals(this.getAlertMsg(css,msg3).contains(msg3), true);
	}

	@Step
	public void assert_does_not_has(String css, String msg4) {
		// TODO Auto-generated method stub
		Assert.assertEquals(this.getAlertMsg(css,msg4).contains(msg4), false);
	}

	@Step
	public String getAlertMsg(String css,String msg) {
		// TODO Auto-generated method stub
		elementPage.setByElement2(css, msg);
		return elementPage.getMsg();
	}


}
