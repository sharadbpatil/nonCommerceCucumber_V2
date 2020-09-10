Feature: nopCommerce login 
	Description: to check login functionality 
Scenario: Successful login with valid credentials 
	Given User Launch browser 
	And User open application url "https://admin-demo.nopcommerce.com/login" 
	And User enter Email as "admin@yourstore.com" and Password as "admin" 
	When Click on Login 
	Then Page title should be "Dashboard / nopCommerce administration" 
	When Click on Logout link 
	Then Page title should be "Your store. Login" 
	And Close browser