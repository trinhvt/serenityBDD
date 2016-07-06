package demo.vnu.hus.elementtext.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;


public class ElementPage extends PageObject{

	WebElement css;


	public String getMsg() {
		return css.getText();
	}


	public void setByElement2(String css2, String msg3) {
		WebDriver driver = this.getDriver();
		css2 = css2.replaceAll("css=", "");
		css=driver.findElement(By.cssSelector(css2));

	}


	

	

}
