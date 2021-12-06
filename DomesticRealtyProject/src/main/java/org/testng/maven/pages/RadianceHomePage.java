package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadianceHomePage {
	
	public WebDriver driver;
	
	public RadianceHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='ADD LEAD']")
	private WebElement addLead;
	
	@FindBy(name="//span[text()='ADD LEAD']")
	private WebElement firstName;
	
	@FindBy(name="lname")
	private WebElement lastName;
	
	@FindBy(id="country")
	private WebElement countryDropdown;
	
	@FindBy(id="mobileNo")
	private WebElement mobileNumberTextBox;
	
	@FindBy(id="emailId")
	private WebElement emailIdTextBox;
	
	@FindBy(name="interestedproject")
	private WebElement selectProjectDropdown;
	
	@FindBy(name="comments")
	private WebElement commentsTextBox;
	
	@FindBy(xpath="//*[@id=\"basic-form-layouts\"]/div/div/div/form/div/center/button/i")
	private WebElement saveButton;
	
	@FindBy(xpath="//button[@class='confirm']")
	private WebElement alertButton;
	
	@FindBy(xpath="/html/body/div[6]/h2")
	private WebElement alertMessage;

	public WebElement getAlertMessage() {
		return alertMessage;
	}

	public WebElement getAlertButton() {
		return alertButton;
	}

	public WebElement getAddLead() {
		return addLead;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getMobileNumberTextBox() {
		return mobileNumberTextBox;
	}

	public WebElement getEmailIdTextBox() {
		return emailIdTextBox;
	}

	public WebElement getSelectProjectDropdown() {
		return selectProjectDropdown;
	}

	public WebElement getCommentsTextBox() {
		return commentsTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
