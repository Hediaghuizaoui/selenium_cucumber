@buzz @smoketest
Feature: Buzz
  En tant que utilisateur je souhaite tester la fonctionnalité buzz

  Background: 
    Given Je me connecte sur l application Orange
    When Je saisis un username valide "Admin"
    And Je saisis un mot de passe valide "admin123"
    And Je clique sur le bouton Login
    When Je clique sur le bouton buzz

  @Creer_un_buzz
  Scenario: Je souhaite créer un buzz
    And Je saisis un buz "Test Automation"
    And Je clique sur le bouton post
    And Je verifie le buzz cree

  @Modifier_un_buzz
  Scenario: Je souhaite modifier le buzz déjà crée
    When je clique sur Modifier le buzz
    And Je modifie le buzz "Test auto modifiee"
    And Je clique sur le bouton confirmer
    And Je verifie le buzz est modifie

  @Supprimer_un_buzz
  Scenario: Je souhaite supprimer le buzz déjà modifiée
    When je clique sur Supprimer le buzz
    And Je confirme la suppression
    Then Je verifie le buzz est supprimé
    When Je clique sur la flèche de mon profil
    When Je clique sur le bouton Logout
