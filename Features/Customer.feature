Feature: Customer feature 
	Description: to add new customer  
Scenario: Add new customer 
	Given User Launch browser 
	And User open application url "https://admin-demo.nopcommerce.com/login" 
	And User enter Email as "admin@yourstore.com" and Password as "admin" 
	When Click on Login 
	Then User can view Dashboard 
	And User click on Customer menu 
	And Click on Customer submenu 
	When Click on Add New button 
	Then User can view add new customer page 
	And User enter customer info 
	When Click on Save button 
	Then User can view confirmation message "The new customer has been added successfully." 
	When Click on Logout link 
	Then Page title should be "Your store. Login" 
	And Close browser 
	
	