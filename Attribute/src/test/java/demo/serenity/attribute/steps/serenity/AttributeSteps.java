package demo.serenity.attribute.steps.serenity;

import org.junit.Assert;

import demo.serenity.attribute.pages.AttributePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AttributeSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AttributePage attPage;

	@Step
	public void open_page(String website) {
		attPage.setDefaultBaseUrl(website);
		attPage.open();
	}

	@Step
	public void assert_is(String att, String xpath, String msg) {

		Assert.assertEquals(this.getMsg(att,xpath), msg);
	}

	@Step
	public void assert_not_have(String att, String xpath, String xgif) {
		
		Assert.assertEquals(this.getMsg(att,xpath).contains(xgif),  false);
	}

	@Step
	public void assert_has(String att, String xpath, String xgif) {
	
		Assert.assertEquals(this.getMsg(att,xpath).contains(xgif),  true);
	}

	@Step
	public void assert_is_not(String att, String xpath, String msg) {
		Assert.assertNotEquals(this.getMsg(att,xpath), msg);
	}

	@Step
	public String getMsg(String attribute,String path) {
		// TODO Auto-generated method stub
		return attPage.getTextMsg(attribute,path);
	}

	
}
