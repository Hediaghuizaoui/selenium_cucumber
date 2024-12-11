package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.BuzzPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuzzStepDefinition {

	BuzzPage buzzPage;

	public BuzzStepDefinition() {
		buzzPage = new BuzzPage();
	}

	/**
	 * Créer un buzz
	 */

	@When("Je clique sur le bouton buzz")
	public void jeCliqueSurEBoutonBuzz() {
		buzzPage.getModuleBuzz();
	}

	@When("Je saisis un buz {string}")
	public void jeSaisisUnBuz(String buzz) {
		buzzPage.fillBuzzDescription(buzz);
	}

	@When("Je clique sur le bouton post")
	public void jeCliqueSurLeBoutonPost() {
		buzzPage.postBuzzDescription();
	}

	@Then("Je verifie le buzz cree")
	public void jeVerifieLeBuzzCree() throws InterruptedException {
		String s = buzzPage.verifyBuzzIsCreated();
		Thread.sleep(10000);
		Assertions.assertEquals(s, "Test Automation");

	}

	/**
	 * Modifier un buzz
	 */
	@When("je clique sur Modifier le buzz")
	public void jeCliqueSurModifierLeBuzz() {
		buzzPage.clickThreePointMenu();
		buzzPage.clickEdit_PostBtn();
	}

	@When("Je modifie le buzz {string}")
	public void jeModifieLeBuzz(String buzz) {
		buzzPage.editBuzzDescription(buzz);
	}

	@When("Je clique sur le bouton confirmer")
	public void jeCliqueSurLeBoutonConfirmer() {
		buzzPage.postModification();

	}

	@Then("Je verifie le buzz est modifie")
	public void jeVerifieLeBuzzEstModifie() {

	}

	/**
	 * Modifier un buzz
	 */

	@When("je clique sur Supprimer le buzz")
	public void jeCliqueSurSupprimerLeBuzz() {
		buzzPage.clickThreePointMenu();
		buzzPage.clickDelete_Post();
	}

	@When("Je confirme la suppression")
	public void jeConfirmeLaSuppression() {
		buzzPage.confirmDelete_Post();
	}

	@Then("Je verifie le buzz est supprimé")
	public void jeVerifieLeBuzzEstSupprimé() {

	}

}
