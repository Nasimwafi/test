package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopObjs extends Base {
	
	public DesktopObjs() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktopTab;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement desktopShowAllElements;
	
	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 12 of 12 (1 Pages)')]")
	private WebElement allElementsInPage;
	
	@FindBy(xpath= "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
	private WebElement addToCartOptionOnHp;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityInputForHp;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton1;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement hpLaptopAddedToCartSuccesMessage;
	
	@FindBy (xpath = "//button[@xpath='1']")
	private WebElement canonAddToCartoptiononcamser;
	
	@FindBy (xpath = "//select[@id='input-option226']")
	private WebElement dropDownOption;
	
	
	
	
	
	
	
	public void canonAddToCartoptiononcamser() {
		canonAddToCartoptiononcamser.click();
	}
	
	public void addToCartOptionOnHp () {
		addToCartOptionOnHp.click();
	}
	
	public void quantityInputForHp () {
		quantityInputForHp.sendKeys("1");
	}
	
	public void addToCartButton1 () {
		addToCartButton1.click();
	}
	
	public String hpLaptopAddedToCartSuccesMessage () {
		String temp = hpLaptopAddedToCartSuccesMessage.getText();
		return temp;
	}
	
	
	
	
	public void desktopTab () {
		desktopTab.click();
	}
	public void desktopShowAllElements () {
		desktopShowAllElements.click();
	}
	
	public boolean allElementsInPage () {
		if(allElementsInPage.isDisplayed())
			return true ;
		else 
			return false;
	}
	

}
