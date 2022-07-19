package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base {

	public RetailPage() {
		PageFactory.initElements(driver, this);
	}
	
	Actions act = new Actions(driver);

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement MyAccountButton;

	public void MyAccountButton() {
		MyAccountButton.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement loginOption;

	public void loginOption() {
		loginOption.click();
	}

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailSection;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordSection;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;

	public void userInformation() {
		emailSection.sendKeys("first.tes@tekschool.us");
		passwordSection.sendKeys("abcde");
		loginButton.click();

	}

	@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	private WebElement MyaccountWebPage;

	public boolean isMyaccountWebPage() {
		if (MyaccountWebPage.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath ="//a[text()='Edit your account information']" )
	private WebElement editLink;
	
	public void editLink () {
		editLink.click();
	}
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	public void firstname () {
		act.doubleClick(firstname).perform();
		firstname.sendKeys("ahmad");
		
	}
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	public void lastName () {
		act.doubleClick(lastName).perform();
		lastName.sendKeys("wafi");
		
	}
	
	@FindBy(name = "email")
	private WebElement email;
	
	public void EmailSesnd () {
		act.doubleClick(email).perform();
		email.sendKeys("ahmad");
		
	}
	
	@FindBy(name = "telephone")
	private WebElement telephoneSend;
	
	public void telephoneSend () {
		act.doubleClick(telephoneSend).perform();
		telephoneSend.sendKeys("3549831981");
		
	}
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitButton;
	public void submitButton () {
		submitButton.click();
	}
	
	
	@FindBy (xpath = "//div[@id='account-account']/div[1]")
	private WebElement suuccessmessage;
	
	public boolean issuuccessmessage() {
		if (suuccessmessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	@FindBy(xpath = "//a[text() = 'Edit your affiliate information']")
	private WebElement editLinkPress;
	public void editLinkPress () {
		editLinkPress.click();
	}
	@FindBy(xpath = "//input[@value= 'bank']")
	private WebElement bankRadioButton;
	public void bankRadioButton () {
		bankRadioButton.click();
	}
	
	
	
	@FindBy (name = "bank_name")
	private WebElement bankName;
	@FindBy (name = "bank_branch_number")
	private WebElement BranchNumber;
	@FindBy (name = "bank_swift_code")
	private WebElement swiftcode;
	@FindBy (name = "bank_account_name")
	private WebElement bankaccountName;
	@FindBy (name = "bank_account_number")
	private WebElement bankaccountNumber;
	
	public void bankName () {
		bankName.sendKeys("california");
		BranchNumber.sendKeys("636856983");
		swiftcode.sendKeys("528574");
		bankaccountName.sendKeys("adfjlkja");
		bankaccountNumber.sendKeys("2545324");
		
	}
	
	@FindBy(xpath = "//input[@value= 'Continue']")
	private WebElement continueeButton;
	
	public void continueeButton() {
		continueeButton.click();
	}
	
	
	
	
	
	

}
