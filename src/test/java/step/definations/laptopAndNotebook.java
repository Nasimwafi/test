package step.definations;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.laptopAndNotebookObj;

public class laptopAndNotebook extends Base  {
	
	laptopAndNotebookObj obj = new laptopAndNotebookObj();
	
	@When("User click on laptop & notebook tab")
	public void user_click_on_laptop_notebook_tab() {
		obj.laptopAndNotebookTab();
		logger.info("user click on laptop and note book option");
	  
	}
	@And("User click on show all laptop & notebool option")
	public void user_click_on_show_all_laptop_notebool_option() {
	   obj.showAllLaptopAndNotebook();
	   logger.info("user clicks on show all");
	}
	@And("User click on macbook item")
	public void user_click_on_macbook_item() {
		obj.macBoolItem();
		logger.info("user clicks on cart button");
	   
	}
	@And("user click add to cart button")
	public void user_click_add_to_cart_button() {
		obj.macBookCartButton();
		logger.info("user clicks on add to cart");
	 
	}
	@Then("user should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(obj.susccesmessage1(), true);
		logger.info("user sees the sucess message");
	   
	}
	@And("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
	   Assert.assertTrue(obj.itemInCart(), true);
	   logger.info("user sees the item in the cart");
	}
	@And("User click on cart option")
	public void user_click_on_cart_option() {
		obj.cartOptionClick();
		logger.info("user clicks on cart option");
	
	}
	@And("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	   obj.redButton();
	   logger.info("user clicks on remove button");
	}
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show_itmes_s(String string) {
	    Assert.assertTrue(obj.itemInCart(), true);
	    logger.info("user succesfully manages to remove items from cart");
	}
	
	@And("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	   obj.macCompairButton();
	   logger.info("user clicked on compare button in macbook");
	}
	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    obj.macAircompairButton();
	    logger.info("user clicked on mac air compare button");
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_messag(String string) {
		Assert.assertTrue(obj.copmarisionSuccesMessage(), true);
		logger.info("user sees the success message ");

	}
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		obj.comparisionLink();
		logger.info("user clicks on comparion link");
	 
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(obj.comparisionChartDisplay());
		logger.info("user is on comparision chart page");
	  
	}
	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	    obj.sonyHeartOption();
	    logger.info("user clicks on heart option on sony item");
	}
	
	@Then("User should get a message {string}")
	public void user_should_see_a_messa(String string) {
		Assert.assertTrue(obj.mustLoginOrCreatAccountMessage());
		logger.info("user is asked to creat or login to their account");

	}
	
	@And("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	   obj.macBookPro();
	   logger.info("user clicks in macbookpro");
	}
	@Then("User should see  {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
	    Assert.assertTrue(obj.priceOfMacBookPro(), true);
	}
	

}
