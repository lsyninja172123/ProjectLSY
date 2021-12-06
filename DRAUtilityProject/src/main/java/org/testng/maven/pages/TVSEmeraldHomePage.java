package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVSEmeraldHomePage {
	
	public WebDriver driver;
	
	public TVSEmeraldHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement emailTextBox;
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	private WebElement phoneNumberTextBox;
	
	@FindBy(xpath="//select[@name='sell_do[form][lead][project_id]']")
	private WebElement selectProjectsDropdown;
	
	@FindBy(xpath="//textarea[@name='sell_do[form][note][content]']")
	private WebElement commentTextBox;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement saveButton;
	
	@FindBy(xpath="//div[@class='thankyou']")
	private WebElement successMessage;
	
	@FindBy(xpath="//input[@name='sell_do[form][custom][custom_channel_partner_name]']")
	private WebElement channelPartnerName;
	
	@FindBy(xpath="//input[@name='sell_do[form][custom][custom_channel_partner_number]']")
	private WebElement channelPartnerMobileNumber;
	
	
	public WebElement getChannelPartnerName() {
		return channelPartnerName;
	}

	public WebElement getChannelPartnerMobileNumber() {
		return channelPartnerMobileNumber;
	}

	public WebElement getSuccessMessage() {
		return successMessage;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPhoneNumberTextBox() {
		return phoneNumberTextBox;
	}

	public WebElement getSelectProjectsDropdown() {
		return selectProjectsDropdown;
	}

	public WebElement getCommentTextBox() {
		return commentTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getName() {
		return name;
	}
	
	
}
