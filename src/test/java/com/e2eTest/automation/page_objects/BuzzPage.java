package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BuzzPage extends BasePage {

	public BuzzPage() {
		super(Setup.getDriver());
	}

	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']")
	private static WebElement moduleBuzz;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"What's on your mind?\"]")
	private static WebElement buzzDescriptionField;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement postBtn;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Test Automation']")
	private static WebElement textElement;

	@FindBy(how = How.XPATH, using = "//div[@class='orangehrm-buzz-newsfeed']//div[1]//div[1]//div[1]//div[1]//div[2]//li[1]")
	private static WebElement btnModif_Supp;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Edit Post']")
	private static WebElement btnEditPost;
	
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-buzz-post oxd-buzz-post--active oxd-buzz-post--composing']//textarea[@class='oxd-buzz-post-input']")
	private static WebElement inputEdit;
	
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-form-actions orangehrm-buzz-post-modal-actions']//button[@type='submit'][normalize-space()='Post']")
	private static WebElement submitEditBtn;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Yes, Delete']")
	private static WebElement btnYesDelete;
	


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Delete Post']")
	private static WebElement btnDeletePost;
	/* Methods */
	public void getModuleBuzz() {
		wait.waitForElementToBeVisible(moduleBuzz, 20);
		moduleBuzz.click();
	}

	public void fillBuzzDescription(String buzz) {
		wait.waitForElementToBeVisible(buzzDescriptionField, 40);
		buzzDescriptionField.sendKeys(buzz);
	}

	public void postBuzzDescription() {
		wait.waitForElementToBeClickable(postBtn, 20);
		postBtn.click();
	}

	public String verifyBuzzIsCreated() {
		wait.waitForElementToBeVisible(textElement, 20);

		return textElement.getText();
	}

	public void clickThreePointMenu() {
		wait.waitForElementToBeVisible(btnModif_Supp, 20);
		btnModif_Supp.click();
	}

	public void clickEdit_PostBtn() {
		wait.waitForElementToBeClickable(btnEditPost, 20);
		btnEditPost.click();
	}
	public void editBuzzDescription(String buzzEditee) {
		wait.waitForElementToBeVisible(inputEdit, 20);
		inputEdit.clear();
		inputEdit.sendKeys(buzzEditee);
	}
	public void postModification() {
		wait.waitForElementToBeVisible(submitEditBtn, 30);
		submitEditBtn.click();

	}
	
	public void clickDelete_Post() {
		wait.waitForElementToBeClickable(btnDeletePost, 20);
		btnDeletePost.click();
	}
	public void confirmDelete_Post() {
		wait.waitForElementToBeClickable(btnYesDelete, 20);
		btnYesDelete.click();
	}
}