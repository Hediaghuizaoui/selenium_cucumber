package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AdminPage extends BasePage{

	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']")
	private static WebElement moduleAdmin;

	@FindBy(how = How.NAME, using = "password")
	private static WebElement userRoleinput;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement emplyeeNameinput;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Dashboard']")
	private static WebElement statusinput;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Dashboard']")
	private static WebElement username;
	
	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Dashboard']")
	private static WebElement password;
	
	
	public AdminPage() {
		super(Setup.getDriver());
	}


	public static WebElement getModuleAdmin() {
		return moduleAdmin;
	}
	
	public static WebElement getUserRoleinput() {
		return userRoleinput;
	}
	public static WebElement getEmplyeeNameinput() {
		return emplyeeNameinput;
	}
	public static WebElement getStatusinput() {
		return statusinput;
	}
	public static WebElement getUsername() {
		return username;
	}
	public static WebElement getPassword() {
		return password;
	}

}
