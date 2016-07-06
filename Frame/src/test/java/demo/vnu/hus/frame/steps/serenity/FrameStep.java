package demo.vnu.hus.frame.steps.serenity;


import org.junit.Assert;

import demo.vnu.hus.frame.pages.FramePage;
import net.thucydides.core.steps.ScenarioSteps;

public class FrameStep extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	FramePage framePage;

	public void open_page(String website1) {
		framePage.setDefaultBaseUrl(website1);
		framePage.open();
	}

	public void go_inside_frame(String id) {
		framePage.go_inside(id);
	}

	public void assert_enabled(String name) {
		boolean bl = framePage.assert_enabled(name);
		Assert.assertEquals(bl, true);
	}

	public void assert_disabled(String name) {
		boolean bl = framePage.assert_enabled(name);
		Assert.assertEquals(bl, false);
	}

	public void assert_present(String xpath) {

		Assert.assertEquals(framePage.assert_present(xpath), true);
	}

	public void assert_absent(String xpath) {

		Assert.assertEquals(framePage.assert_absent(xpath), false);
	}

	public void assert_is(String att, String name, String msg) {

		Assert.assertEquals(framePage.assert_is(att, name), msg);
	}

	public void assert_hidden(String name) {

		Assert.assertEquals(framePage.assert_hidden(name), false);
	}

	public void change_att(String att, String name, String msg) {

		Assert.assertEquals(framePage.change_att(att, name, msg), true);
	}

	public void element_visiable(String name) {
		
		Assert.assertEquals(framePage.element_visiable(name),true);
	}

	public void highligh_element(String name) {
		framePage.highligh_element(name);
	}

	public void set_bound(String name) {
		framePage.set_bound(name);
	}

	public void capture_image(String name, String png) {
		framePage.capture_image(name, png);
	}

	

}
