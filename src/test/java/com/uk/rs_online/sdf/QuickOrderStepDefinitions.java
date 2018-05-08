package com.uk.rs_online.sdf;

import junit.framework.Assert;

import com.uk.rs.base.TestBase;
import com.uk.rs_online.pageObjects.BasketSummary;
import com.uk.rs_online.pageObjects.QuickOrderPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuickOrderStepDefinitions extends TestBase
{		QuickOrderPage quickorderpage;
		BasketSummary basketsummary;
	
	@When("^the user enters the RsStockId in the RsStockNo quantity in the Quantity_Box$")
	public void the_user_enters_the_RsStockId_in_the_RsStockNo_quantity_in_the_Quantity_Box() throws Throwable {
		quickorderpage = new QuickOrderPage();
		quickorderpage.QuickOrder(prop.getProperty("RsStockNo"),prop.getProperty("Quantity1"));
	}

	@When("^clicks on the AddtoBasket button$")
	public void clicks_on_the_AddtoBasket_button() throws Throwable {
		quickorderpage.addtobasket();
	    
	}

	@Then("^the user should be navigated to mybasketpage$")
	public void the_user_should_be_navigated_to_mybasketpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean flag = basketsummary.validateBasketPage();
		Assert.assertTrue(flag);
	}
}
