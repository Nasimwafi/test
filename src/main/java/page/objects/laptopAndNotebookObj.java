package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class laptopAndNotebookObj extends Base  {
	
	public laptopAndNotebookObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Laptops & Notebooks")
	private WebElement laptopAndNotebookTab;
	
	@FindBy (xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLaptopAndNotebook;
	
	@FindBy( xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement macBoolItem;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement macBookCartButton;
	
	@FindBy( xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement susccesmessage1;
	
	@FindBy ( xpath = "//span[@id='cart-total']")
	private WebElement cartOptionElement;
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	private WebElement redButtonOnShopingCart;
	
	
	
	
	@FindBy( xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macCompairButton;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macAircompairButton;
	
	@FindBy( xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement copmarisionSuccesMessage;
	
	@FindBy( xpath = "//a[@id='compare-total']")
	private WebElement comparisionLink;
	
	@FindBy( xpath = "//h1[contains(text(),'Product Comparison')]")
	private WebElement comparisionChartDisplay;
	
	
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[2]")
	private WebElement sonyHeartOption;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement mustLoginOrCreatAccountMessage;
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement macBookPro;
	
	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement priceOfMacBookPro;
	
	
	
	public void macBookPro () {
		macBookPro.click();
	}
	
	public String priceOfMacBookPro () {
		String temp = priceOfMacBookPro.getText();
		return temp;
	}
	
	public void laptopAndNotebookTab() {
		laptopAndNotebookTab.click();
	}
	
	public void showAllLaptopAndNotebook () {
		showAllLaptopAndNotebook.click();
	}
	
	public void macBoolItem () {
		macBoolItem.click();
	}
	
	public void macBookCartButton () {
		macBookCartButton.click();
	}
	
	public String susccesmessage1 () {
		String temp = susccesmessage1.getText();
		return temp;
	}
	
	public String itemInCart () {
		String temp = cartOptionElement.getText();
		return temp;
	}
	
	public void cartOptionClick() {
		cartOptionElement.click();
	}
	
	public void redButton () {
		redButtonOnShopingCart.click();
	}
	public void macCompairButton () {
		macCompairButton.click();
	}
	public void macAircompairButton () {
		macAircompairButton.click();
	}
	public String copmarisionSuccesMessage () {
		String temp = copmarisionSuccesMessage.getText();
		return temp;
	}
	public void comparisionLink () {
		comparisionLink.click();
	}
	
	public boolean comparisionChartDisplay () {
		if (comparisionChartDisplay.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void sonyHeartOption () {
		sonyHeartOption.click();
		
	}
	
	public boolean mustLoginOrCreatAccountMessage () {
		if (mustLoginOrCreatAccountMessage.isDisplayed())
			return true ;
		else 
			return false;
	}
	
	
	
	
	
	

}
