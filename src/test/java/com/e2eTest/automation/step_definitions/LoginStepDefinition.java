package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	ConfigFileReader configFileReader;
	LoginPage loginPage;

	public LoginStepDefinition() {
		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();
	}

	@Given("Je me connecte sur l application Orange")
	public void login() throws InterruptedException {
		Setup.getDriver().get(configFileReader.getProperty("home.url"));
	}

	@When("Je saisis un username valide {string}")
	public void fillUsername(String username) throws InterruptedException {
		loginPage.getUsername(username);

	}

	@And("Je saisis un mot de passe valide {string}")
	public void fillPassword(String password) {
		loginPage.getPassword(password);

	}

	@When("Je clique sur le bouton Login")
	public void clickOnLoginPage() throws InterruptedException {
		loginPage.getBtnLogin();
		Thread.sleep(3000);

	}

	@Then("Je me regirige vers la page Home {string}")
	public void IseeHomePage(String text) {

		String txtHomePage = loginPage.getUserHome();
		Assertions.assertEquals(text, txtHomePage);

	}

}
