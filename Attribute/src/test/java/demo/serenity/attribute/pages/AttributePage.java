package demo.serenity.attribute.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class AttributePage extends PageObject {

	WebElement msg;

	public String getTextMsg(String att, String path) {
		WebDriver driver = this.getDriver();
		path = path.replaceAll("xpath=","");
		msg = driver.findElement(By.xpath(path));
		String src = msg.getAttribute(att);
		// TODO Auto-generated method stub
		return src;
	}

}
