
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given Je me connecte sur l application Orange
    When Je saisis un username valide "Admin"
    And Je saisis un mot de passe valide "admin123"
    And Je clique sur le bouton Login
    When Je clique sur le bouton Admin

  @tag1
  Scenario: Je souhaite créer un Admin
    And Je select un user Role
    And Je select un statut
    And Je saisie un Employee Name
    And Je saisie un username
    And Je saisie un password
    And Je confirme le password
    And Je verifie le compte cree

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
