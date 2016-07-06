package vnu.hus.demo.browser.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import net.thucydides.core.pages.PageObject;

public class BrowserPage extends PageObject {

	WebDriver driver;

	public void refresh_page() {
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		System.out.println("done");
	}

	public void maximize_window() {		
		driver.manage().window().maximize();
	}

	public void go_back_page() {
		driver.switchTo().defaultContent();
	}

	public void go_forward_page() throws InterruptedException {
	
		driver.navigate().forward();

	}

	public void assert_test_present(String msg) {

	}

	public void assert_not_present(String msg) {

	}

	public String getMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	public void change_size(int no1, int no2) {
		
		Dimension d = new Dimension(300, 500);
		driver.manage().window().setSize(d);
	}

	public void scroll_up_down(int no1, int no2) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + no1 + "," + no2 + ")", "");
	}

	public void move_window(int no1, int no2) {
		
		driver.manage().window().setPosition(new Point(no1, no2));
	}

	public void close_current_window() {
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
		

	}

	public void open_link_new_window(String link) {
		link=link.replaceAll("link=", "");
		
		WebElement wweb=driver.findElement(By.linkText(link));
		openNewWindow(wweb.getAttribute("href"));
	}

	public void open_dialog(String dialog) {
		dialog=dialog.replaceAll("css=", "");
		
		WebElement wweb=driver.findElement(By.cssSelector(dialog));
		wweb.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(0));
		
		System.out.println(driver.getTitle());
	}

	public void openNewWindow(String http) {
		this.driver = this.getDriver();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(0));
		driver.navigate().to(http);

	}
	public void setDriver(){
		this.driver=this.getDriver();
	}

}
