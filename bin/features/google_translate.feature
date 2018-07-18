#Author: jose.blandon@ceiba.com.co

Feature: Google Translate
  As a web user
  I want to use Google Translate
  to translate words between different languages

  Scenario: Translate from english to spanish
    Given that Antonio wants to translate a word
    When he translates the word cheese from english to spanish
    Then he should see the word queso in the screen