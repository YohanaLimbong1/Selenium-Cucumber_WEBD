@loginValid @rcti

  Feature: Login rcti+
    Scenario: Positive case check user login with Valid data
      Given user access page "https://dev-webd.rctiplus.com/"
      Then user mengklik navigasi bar login Di Mainpage
      And user mengkllik button login
      And user mengklik button continue with email or phone number
      When user memasukkan email akun rcti+ "yohanalimbong1@gmail.com"
      And user memasukkan password akun rcti+ "Yohana12345"
      Then user mengklik login button

