@Signup @rcti

Feature: Signup RCTI+
  Scenario: Positive case sign up RCTI+ Succes
    Given user access page "https://dev-webd.rctiplus.com/"
    Then user mengklik navigasi bar login Di Mainpage
    And user mengkllik button login
    And user mengklik button register
    When user input on username signup "yohanaclimbong1@gmail.com"
    And user input on password signup "12345678"
    And user input re-type password "12345678"
    Then user click button next
    And user input on fullname "Yohana Limbong"
    And user input on birth date "1998-08-27"
    And user click field fullname
    And user click field gender
    And user click gender
    And user click button next
    Then sleep waiting second


