Feature: Login Feature

Scenario Outline: letsKodeIt Test Scenario

Given user is already on Login Page
When title of login page is Practice Page
Then user clicks on SignIn button
Then user enters "<username>" and "<password>"
Then Close the browser


Examples:
	| username | password |
	| abcdef  | testing |
	
Scenario Outline: letsKodeIt Test Scenario2

Given user is already on Login Page
When title of login page is Practice Page
Then user clicks on SignIn button
Then user enters "<username>" and "<password>"
Then Close the browser


Examples:
	| username | password |
	| ghijkl  | testing |