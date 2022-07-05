package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
