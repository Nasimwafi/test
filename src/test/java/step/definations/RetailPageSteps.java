package step.definations;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPage;

public class RetailPageSteps extends Base  {
	RetailPage obj = new RetailPage();
	
	
	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		obj.MyAccountButton();
	  
	}
	@When("User click on login")
	public void user_click_on_login() {
		obj.loginOption();
	    
	}
	@When("user enter Username and password")
	public void user_enter_username_and_password() {
		obj.userInformation();
	    
	}
	
	@Then("user should be loged in to MyAccount")
	public void user_should_be_loged_in_to_my_account() {
		Assert.assertTrue(obj.isMyaccountWebPage());
		
	   
	}
	
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	    obj.editLink();
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information() {
	    obj.firstname();
	    obj.lastName();
	    obj.EmailSesnd();
	    obj.telephoneSend();
	}
	
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	   obj.submitButton();
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	   Assert.assertTrue(obj.issuuccessmessage());
	}
	
	
	
	
	
	
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	   obj.editLinkPress();
	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	    obj.bankRadioButton();
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information() {
	    obj.bankName();
	}
	@When("User click on Continue buttonn")
	public void user_click_on_continue_buttonn() {
	   obj.continueeButton();
	}
	@Then("User should see a success messagee")
	public void user_should_see_a_success_messagee() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();

	}
	
}
