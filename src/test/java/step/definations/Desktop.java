package step.definations;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopObjs;

public class Desktop extends Base {
	
	DesktopObjs obj = new DesktopObjs();
	
@When("User click on Desktop tab")
public void user_click_on_desktop_tab() {
  obj.desktopTab();
  logger.info("user clicked on desktop tab");
}

@And("User click on Show all desktops")
public void user_click_on_show_all_desktops() {
     obj.desktopShowAllElements();
     logger.info("user clicked on show all");
}

@Then("User should see all items are present in Desktop page")
public void user_should_see_all_items_are_present_in_desktop_page() {
     Assert.assertTrue(obj.allElementsInPage());
     logger.info("user sees the all items");
}
@And("User click  ADD TO CART option on HP LP3065item")
public void user_click_add_to_cart_option_on_hp_lp3065item() {
	obj.addToCartOptionOnHp();
	logger.info("user clicked on add to cart on hp laotop");
     
}
@And("User select quantity1")
public void user_select_quantity() {
	obj.quantityInputForHp();
	logger.info("user entered quantity of hp laptop");
    
}
@And("User click add to Cart button")
public void user_click_add_to_cart_button() {
	obj.addToCartButton1();
	logger.info("user clicked on add to cart after selecting quantity");
     
}
@Then("User should see a messagee {string}")
public void user_should_see_a_messagee(String string) {
	Assert.assertTrue(obj.hpLaptopAddedToCartSuccesMessage(), true);
    logger.info("User have successfully added to cart");
}

@And("User click  ADD TO CART option on Canon EOS 5Ditem")
public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
    obj.canonAddToCartoptiononcamser();
}
@And("User select color from dropdown Red")
public void user_select_color_from_dropdown_red() {
    
}
@And("User select quantityy one")
public void user_select_quantityy_one() {
     
}
@Then("User should see a messaget {string}")
public void user_should_see_a_messaget(String string) {
     
}

@When("User click add to Cart buttont")
public void user_click_add_to_cart_buttont() {
     
}


}
