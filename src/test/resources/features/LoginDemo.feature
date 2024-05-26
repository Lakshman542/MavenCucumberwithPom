Feature: Login Feature

  @test1
  Scenario Outline: letsKodeIt Test Scenario1
    Given user is already on Login Page
    When title of login page is Practice Page
    Then user clicks on SignIn button
    Then user enters "<username>" and "<password>"
    Then Close the browser

    Examples: 
      | username | password |
      | abcdef   | testing  |

      @test2
  Scenario Outline: letsKodeIt Test Scenario12
    Given user is already on Login Page
    When title of login page is Practice Page
    Then user clicks on SignIn button
    Then user enters "<username>" and "<password>"
    Then user click on login
    Then Close the browser

    Examples: 
      | username | password |
      | uytewtu   | testing  |
      