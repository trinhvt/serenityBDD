package demo.vnu.hus.frame.pages;


import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class FramePage extends PageObject {

	WebElement msg;
	public WebDriver driver;

	public void go_inside(String id) {
		// TODO Auto-generated method stub
		WebDriver driver = this.getDriver();
		id = id.replaceAll("id=", "");
		driver.switchTo().frame(id);
		this.driver = driver;

	}

	public boolean assert_enabled(String name) {
		// TODO Auto-generated method stub
		name = name.replaceAll("name=", "");
		msg = driver.findElement(By.name(name));

		return msg.isEnabled();
	}

	public boolean assert_disabled(String name) {
		// TODO Auto-generated method stub
		name = name.replaceAll("name=", "");
		msg = driver.findElement(By.name(name));

		return msg.isEnabled();
	}

	public boolean assert_present(String xpath) {
		// TODO Auto-generated method stub
		xpath = xpath.replaceAll("xpath=", "");
		try {
			msg = driver.findElement(By.xpath(xpath));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean assert_absent(String xpath) {
		// TODO Auto-generated method stub
		xpath = xpath.replaceAll("xpath=", "");
		try {
			msg = driver.findElement(By.xpath(xpath));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public String assert_is(String att, String name) {
		// TODO Auto-generated method stub
		name = name.replaceAll("name=", "");
		msg = driver.findElement(By.name(name));

		return msg.getAttribute(att);

	}

	public boolean assert_hidden(String name) {
		// TODO Auto-generated method stub
		name = name.replaceAll("name=", "");
		msg = driver.findElement(By.name(name));

		return msg.isDisplayed();
	}

	public boolean change_att(String att, String name, String intoch) {
		// TODO Auto-generated method stub
		try {

			name = name.replaceAll("name=", "");
			msg = driver.findElement(By.name(name));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript(
					"document.getElementsByName('" + name + "')[0].setAttribute('" + att + "', '" + intoch + "');");

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean element_visiable(String name) {
		// TODO Auto-generated method stub
		name = name.replaceAll("name=", "");
		msg = driver.findElement(By.name(name));
		return msg.isDisplayed();
	}

	public boolean highligh_element(String name) {
		// TODO Auto-generated method stub
		try {

			name = name.replaceAll("name=", "");
			msg = driver.findElement(By.name(name));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementsByName('" + name + "')[0].setAttribute('style', 'background:red');");

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean set_bound(String name) {
		// TODO Auto-generated method stub
		try {

			name = name.replaceAll("name=", "");
			msg = driver.findElement(By.name(name));
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean capture_image(String name, String png) {
		// TODO Auto-generated method stub
		try {
			name = name.replaceAll("name=", "");
			msg = driver.findElement(By.name(name));
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			BufferedImage fullImg = ImageIO.read(screenshot);
			
			// Get the location of element on the page
			org.openqa.selenium.Point point = msg.getLocation();

			// Get width and height of the element
			int eleWidth = msg.getSize().getWidth();
			int eleHeight = msg.getSize().getHeight();
			BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
			ImageIO.write(eleScreenshot, "png", screenshot);
			System.out.println(screenshot.toString());
			File screenshotLocation = new File("C:\\images\\"+png);
			FileUtils.copyFile(screenshot, screenshotLocation);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String getMsgText() {

		return "";
	}

}
