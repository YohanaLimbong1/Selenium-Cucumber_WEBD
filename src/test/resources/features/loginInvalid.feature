@loginInvalid @rcti

  Feature: Login rcti+
    Scenario: Negative case check user login with email wrong
      Given user access page "https://dev-webd.rctiplus.com/"
      Then user mengklik navigasi bar login Di Mainpage
      And user mengkllik button login
      And user mengklik button continue with email or phone number
      When user memasukkan email akun rcti+ "yohanalimbong12@gmail.com"
      And user memasukkan password akun rcti+ "Yohana12345"
      Then user mengklik login button
      And system menampilkan box message error "Invalid, User Has Not Been Registered"
