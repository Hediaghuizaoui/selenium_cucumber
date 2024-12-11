package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class ConnexionPage extends BasePage {

	@FindBy(how = How.NAME, using = "username")
	private static WebElement username;

	@FindBy(how = How.NAME, using = "password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Dashboard']")
	private static WebElement userHome;

	public ConnexionPage() {
		super(Setup.getDriver());
	}

	public static WebElement getUsername() throws InterruptedException {
		Thread.sleep(3000);
		wait.waitForElementToBeVisible(username, 10);
		return username;

	}

	public static WebElement getPassword() {
		return password;

	}

	public static WebElement getBtnLogin() {
		return btnLogin;

	}

	public static WebElement getUserHome() {
		wait.waitForElementToBeVisible(userHome, 10);
		return userHome;

	}

}
