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

}
