package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LogoutPage;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	LogoutPage logoutPage = new LogoutPage();

	@When("Je clique sur la flèche de mon profil")
	public void jeCliqueSurLaFlècheDeMonProfil() throws InterruptedException {
		Thread.sleep(5000);
		logoutPage.getBtnProfil();
	}

	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		logoutPage.getBtnLogout();
	}
}
