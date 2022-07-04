package step.definations;
import core.Base;
import io.cucumber.java.en.*;
import org.junit.Assert;
import page.objects.homePageObj;


public class homePage extends Base  {
	
	homePageObj obj = new homePageObj();
	
	@Given("User is on Retail Website")
	public void user_is_on_retail_website() {
		
	   Assert.assertTrue(obj.testEnvironment());
	   logger.info("user is on Home Page");
	}

	@When("User clicks on Currency")
	public void user_clicks_on_currency() {
	   obj.currencyOption();
	   logger.info("user clicks on currency");
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	obj.euroOption();
	logger.info("user clicks on euro option");
	}

	@Then("currency value should chande to Euro")
	public void currency_value_should_chande_to_euro() {
	    Assert.assertTrue(obj.euroLogo());
	    logger.info("user is succesfull");
	}

	@Given("User is on retail websitee")
	public void user_is_on_retail_websitee() {
	   Assert.assertTrue(obj.testEnvironment());
	   logger.info("user is on Home Page");
	}

	@When("User clicks on shoppping cart")
	public void user_clicks_on_shoppping_cart() {
	    obj.shopinCart();
	    logger.info("user shoping cart");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("message is desplayed")
	public void message_shold_display() {
	   Assert.assertTrue(obj.shopingCartMessage());
	   logger.info("user sees the messege");
	}

}
