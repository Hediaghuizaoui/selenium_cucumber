@login @smoketest
Feature: Je souhaite tester la page de connexion
  En tant que utilisateur je souhaite tester la page de connexion

  Background: 
    Given Je me connecte sur l application Orange
    When Je saisis un username valide "Admin"
    And Je saisis un mot de passe valide "admin123"
    And Je clique sur le bouton Login

  @login_valid_credentials
  Scenario: Je souhaite tester la page de connexion avec des données valides
    Then Je me regirige vers la page Home "Dashboard"

  @logout
  Scenario: Je souhaite me deconnecter
    When Je clique sur la flèche de mon profil
    When Je clique sur le bouton Logout