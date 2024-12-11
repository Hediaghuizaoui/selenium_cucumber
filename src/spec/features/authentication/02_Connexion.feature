@connexion
Feature: Connexion
  Je souhaite me connecter sur l'application

  @connexion
  Scenario Outline: Je souhaite me connecter sur l'application
    Given Je me connecte sur Orange
    When Je saisis le username valide "<username>"
    And Je saisis le mot de passe valide "<password>"
    And Je clique sur Login
    Then Je me redirige vers Dashboard "Dashboard" 

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Hedia    | hedia123 |
      | Souad    | souad123 |
