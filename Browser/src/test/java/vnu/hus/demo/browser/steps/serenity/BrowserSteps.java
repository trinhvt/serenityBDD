package vnu.hus.demo.browser.steps.serenity;

import org.junit.Assert;

import net.thucydides.core.steps.ScenarioSteps;
import vnu.hus.demo.browser.pages.BrowserPage;

public class BrowserSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	BrowserPage brPage;


	public void visit_page(String website) {
		brPage.setDefaultBaseUrl(website);
		brPage.open();
		brPage.setDriver();
	}
	public void page_is_refreshed() {
		brPage.refresh_page();
	}

	public void maximize_window() {
		brPage.maximize_window();
	}

	public void go_backward_page() {
		brPage.go_back_page();
		
	}

	public void go_forward_page() throws InterruptedException {
		brPage.go_forward_page();
	}

	public void page_open_on_another_window(String http) {
		System.out.println(http);
		brPage.openNewWindow(http);
	}

	public void assert_text_present(String msg) {
		Assert.assertEquals(msg, brPage.waitForTextToAppear(msg));
	}

	public void assert_not_present(String msg) {
		brPage.assert_not_present(msg);
	}

	public void assert_page_title(String msg) {
		
		Assert.assertEquals(brPage.getTitle(), msg);		
	}

	public void assert_page_title_not(String msg) {
		Assert.assertNotEquals(brPage.getTitle(), msg);
	}


	public void assert_page_title_has(String msg) {
		Assert.assertEquals(brPage.getTitle().contains(msg), true);;
	}

	public void page_title_does_not_have(String msg) {
		Assert.assertEquals(brPage.getTitle().contains(msg), false);;
		
	}

	public void assert_url_is(String https) {
		Assert.assertEquals(brPage.getDriver().getCurrentUrl(), https);
		
	}

	public void assert_url_is_not(String https) {
		Assert.assertNotEquals(brPage.getDriver().getCurrentUrl(), https);		
	}

	public void dimension_is_changed_size(int no1, int no2) {
		brPage.change_size(no1,no2);
	}

	public void scroll_up_down_screen(int no1, int no2) {
		brPage.scroll_up_down(no1,no2);
	}

	public void window_is_moved(int no1, int no2) {
		brPage.move_window(no1,no2);
	}

	public void close_current_window() {
		brPage.close_current_window();
	}

	public void back_original_window() {

		brPage.go_back_page();
	}

	public void open_link_in_new_window(String link) {
		brPage.open_link_new_window(link);
	}

	

	public void open_dialog_and_switch(String dialog) {
		brPage.open_dialog(dialog);		
	}

	
	
	

}
