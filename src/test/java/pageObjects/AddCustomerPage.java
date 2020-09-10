package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	public WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
		
	//@FindBy(xpath="/html/body/div[3]/div[2]/div/ul/li[4]/a/span")
	@FindBy(xpath="//a[@href='#']//span[contains(text(),'Customers')]")
	@CacheLookup
	WebElement lnkCustomers_menu;
	
	@FindBy(xpath="//span[@class='menu-item-title'][contains(text(),'Customers')]")
	@CacheLookup
	WebElement lnkCustomers_menuItem;
	
	@FindBy(xpath="//a[@class='btn bg-blue']")
	@CacheLookup
	WebElement btnAddNew;
	
	@FindBy(id="Email")
	//FindBy(xpath="//input[@id='Email']")  // this is another way
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	//@FindBy(xpath="//input[@id='Password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="FirstName")
	//@FindBy(xpath="//input[@id='FirstName']")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(id="LastName")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(id="Gender_Male")
	@CacheLookup
	WebElement rdGenderMale;
	
	@FindBy(id="Gender_Female")
	@CacheLookup
	WebElement rdGenderFemale;
	
	@FindBy(id="DateOfBirth")
	@CacheLookup
	WebElement txtDob;
	
	@FindBy(xpath="//span[@class='k-icon k-i-calendar']")
	@CacheLookup
	WebElement calendar;
	
	@FindBy(id="Company")
	@CacheLookup
	WebElement txtCompany;
	
	@FindBy(id="IsTaxExempt")
	@CacheLookup
	WebElement chkIsTaxExempt;
	
	@FindBy(xpath="//div[9]//div[2]//div[1]//div[1]//div[1]")
	@CacheLookup
	WebElement lstNewsletter;
	
	@FindBy(xpath="//div[10]//div[2]//div[1]//div[1]//div[1]")
	@CacheLookup
	WebElement lstCustomerRoles;
	
	
	@FindBy(xpath="//select[@id='VendorId']")
	@CacheLookup
	WebElement drpManagerofVendor;
	
	@FindBy(xpath="//textarea[@id='AdminComment']")
	@CacheLookup
	WebElement txtAdminComment;
	
	
	@FindBy(xpath="//button[@name='save']")
	@CacheLookup
	WebElement btnSave;
	
			
	//The new customer has been added successfully.
	
}
