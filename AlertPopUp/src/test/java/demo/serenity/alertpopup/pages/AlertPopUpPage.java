package demo.serenity.alertpopup.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class AlertPopUpPage extends PageObject {

	WebDriver driver;
	WebElement webElement;
	public void setAlertDriver() {

		this.driver = this.getDriver();

	}

	public void goToInsideFrame(String frame) {
		frame=frame.replaceAll("id=", "");
		webElement=driver.findElement(By.id(frame));
		driver=driver.switchTo().frame(webElement);
	}

	
	public void goToDialogBox(String text, String box) {
		box=box.replaceAll("css=", "");
		webElement=driver.findElement(By.cssSelector(box));
		webElement.click();
		Alert driverAlert=driver.switchTo().alert();
		
		driverAlert.sendKeys(text);
	
		driverAlert.accept();
	}

	public String getElementIs(String id, String msg) {
		id=id.replaceAll("id=", "");
		webElement=driver.findElement(By.id(id));
		return webElement.getText();
	
	}

	public void gotToDialogBoxCan(String dialog) {
		dialog=dialog.replaceAll("css=", "");
		webElement=driver.findElement(By.cssSelector(dialog));
		webElement.click();
		Alert driverAlert=driver.switchTo().alert();
		

	
		driverAlert.dismiss();
	}

	public void gotToDialogBoxOK(String dialog) {
		dialog=dialog.replaceAll("css=", "");
		webElement=driver.findElement(By.cssSelector(dialog));
		webElement.click();
		Alert driverAlert=driver.switchTo().alert();
		

	
		driverAlert.accept();;
	}

	public String goToAlert(String dialog) {
		dialog=dialog.replaceAll("css=", "");
		webElement=driver.findElement(By.cssSelector(dialog));
		webElement.click();
		Alert driverAlert=driver.switchTo().alert();
		return driverAlert.getText();

	}
	

}
