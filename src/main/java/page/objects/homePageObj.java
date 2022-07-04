package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class homePageObj extends Base  {
	
	public homePageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement logo;
	
	@FindBy(xpath= "//span[contains(text(),'Currency')]")
	private WebElement currencyOption;

	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euroOption;
	
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement euroLogo;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement shopingCart;
	
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement shopingCartMessege;
	
	
	public boolean testEnvironment() {
		if (logo.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void currencyOption() {
		currencyOption.click();
	}
	
	public void euroOption () {
		euroOption.click();
	}
	
	public boolean euroLogo() {
		if(euroLogo.isDisplayed())
			return true;
		else 
			return false;
				
	}
	
	public void shopinCart() {
		shopingCart.click();
	}
	
	public boolean shopingCartMessage () {
		if(shopingCartMessege.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
}
