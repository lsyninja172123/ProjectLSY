package org.testng.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AkshayaHomePage {
	
	public WebDriver driver;
	
	public AkshayaHomePage(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText="Add a Lead")
	private WebElement addLead;
	
	@FindBy(id="lead_first_name")
	private WebElement firstName;
	
	@FindBy(id="lead_last_name")
	private WebElement lastName;
	
	@FindBy(xpath="//a[@class='select2-choice']")
	private WebElement emailDropdown;
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/div/input")
	private WebElement emailTextBox;
	
	@FindBy(id="lead_phone")
	private WebElement phoneNumberTextBox;
	
	@FindBy(xpath="//span[text()='Select Projects']")
	private WebElement selectProjectsDropdown;
	
	@FindBy(xpath="//*[@id='select2-drop']/div/input")
	private WebElement selectProjectsTextBox;
	
	public WebElement getSelectProjectsTextBox() {
		return selectProjectsTextBox;
	}

	@FindBy(xpath="//*[@id=\"select2-drop\"]/ul/li[4]")
	private WebElement metropolisText;
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/ul/li[3]")
	private WebElement todayText;
	
	@FindBy(xpath="//*[@id=\"select2-drop\"]/ul/li[2]")
	private WebElement republicText;
	
	@FindBy(id="lead_city")
	private WebElement cityTextBox;
	
	@FindBy(id="lead_state")
	private WebElement stateTextBox;
	
	@FindBy(id="lead_country")
	private WebElement countryTextBox;
	
	@FindBy(id="lead_comment")
	private WebElement commentTextBox;
	
	@FindBy(xpath="//span[@class='noty_text']")
	private WebElement popupMsg;
	
	@FindBy(name="commit")
	private WebElement saveButton;
	
	public WebElement getPopupMsg() {
		return popupMsg;
	}
	
	public WebElement getRepublicText() {
		return republicText;
	}
	
	public WebElement getCityTextBox() {
		return cityTextBox;
	}

	public WebElement getStateTextBox() {
		return stateTextBox;
	}

	public WebElement getCountryTextBox() {
		return countryTextBox;
	}

	public WebElement getMetropolisText() {
		return metropolisText;
	}

	public WebElement getTodayText() {
		return todayText;
	}
	
	public WebElement getLeadsLink() {
		return leadsLink;
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

	public WebElement getEmailDropdown() {
		return emailDropdown;
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

	
	
}
