package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.ConnexionPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnexionSteps {

	private ConnexionPage connexionPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;

	public ConnexionSteps() {
		connexionPage = new ConnexionPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}

	@Given("Je me connecte sur Orange")
	public void jeMeConnecteSurOrange() {
		seleniumUtils.get(configFileReader.getProperty("home.url"));
	}

	@When("Je saisis le username valide {string}")
	public void jeSaisisLeUsernameValide(String name) throws InterruptedException {
		seleniumUtils.writeText(ConnexionPage.getUsername(), name);
	}

	@When("Je saisis le mot de passe valide {string}")
	public void jeSaisisLeMotDePasseValide(String password) {
		seleniumUtils.writeText(ConnexionPage.getPassword(), password);
	}

	@When("Je clique sur Login")
	public void jeCliqueSurLogin() {
		seleniumUtils.click(ConnexionPage.getBtnLogin());
	}
	
	@Then("Je me redirige vers Dashboard {string}")
	public void jeMeRedirigeVersDashboard(String text) {
		validations.assertEquals(ConnexionPage.getUserHome(), text);
	}

}
