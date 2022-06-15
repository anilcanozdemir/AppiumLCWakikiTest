@Login
Feature: Login

  @Check
  Scenario: Check Profile Page
    Given Customer is on Home page
    When click "Profil" card in the navigationBar
    Then should see Profile Page

  @Email @Components
  Scenario: Check Email Components
    Given Customer is on Profile Page
    When click "E-Posta" radio button
    Then should see "GİRİŞ YAP" title
    Then should see "E-Posta" radio button
    Then should see "Telefon" radio button
    Then should see "E-Posta Adresiniz" text on Email
    Then should see "Şifreniz" text on Password
    Then should see Show Password Icon
    Then should see "Şifremi unuttum" forgot password
    Then should see "GİRİŞ YAP" login button

  @Phone @Components
  Scenario: Check Phone Components
    Given Customer is on Profile Page
    When click "Telefon" radio button
    Then should see "GİRİŞ YAP" title
    Then should see "E-Posta" radio button
    Then should see "Telefon" radio button
    Then should see Phone Text Box
    Then should see "Şifreniz" text on Password
    Then should see Show Password Icon
    Then should see "Şifremi unuttum" forgot password
    Then should see "GIRIŞ YAP" login button

  @Empty
  Scenario Outline: Empty Login
    Given Customer is on Profile Page
    When click login button
    Then should see "<emailAndPasswordErr>" Login Error Message
    Examples:
      | emailAndPasswordErr                                |
      | E-posta adresinizi ya da şifrenizi kontrol ediniz. |

  @Empty @Password
  Scenario Outline: Empty Password
    Given Customer is on Profile Page
    When type Email "<email>"
    When click login button
    Then should see "<emailAndPasswordErr>" Login Error Message
    Examples:
      | email         | emailAndPasswordErr                                |
      | enes@mail.com | E-posta adresinizi ya da şifrenizi kontrol ediniz. |

  @Empty @Email
  Scenario Outline: Empty Email
    Given Customer is on Profile Page
    When type Password "<pass>"
    When click login button
    Then should see "<emailAndPasswordErr>" Login Error Message

    Examples:
      | pass       | emailAndPasswordErr                                |
      | 1234567890 | E-posta adresinizi ya da şifrenizi kontrol ediniz. |

  @False @Email
  Scenario Outline: False Email
    Given Customer is on Profile Page
    When type Email "<email>"
    When click login button
    Then should see "<emailErr>" Email False message
    Examples:
      | email              | emailErr                                   |
      | enes@mail@mail.com | Lütfen geçerli bir e-posta adresi giriniz. |

  @False @Password
  Scenario Outline: False Password
    Given Customer is on Profile Page
    When type Password "<pass>"
    When click login button
    Then should see "<passErr>" Password False message
    Examples:
      | pass | passErr                             |
      | 123  | Şifreniz en az 6 karakter olmalıdır |

  @FalseLogin @Login
  Scenario Outline: False Login
    Given Customer is on Profile Page
    When type Email "<email>", Password "<password>" and click login
    Then should see "<emailAndPasswordErr>" Login Error Message
    Examples:
      | email         | password   | emailAndPasswordErr                                       |
      | enes@mail.com | 1234567890 | Lütfen E-Posta Adresinizi ya da Şifrenizi Kontrol Ediniz |
