package com.au.carsguide.steps;

import com.au.carsguide.pages.FindDealerPage;
import com.au.carsguide.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FindDealersSteps {
    @When("I mouse hover on “buy+sell” tab")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHooverOnBuyAndSellLink();
    }

    @And("I click Find a Dealer")
    public void iClickFindADealer() {
        new FindDealerPage().clickOnFindDealer();
    }

    @Then("I navigate to ‘car-dealers’ page")
    public void iNavigateToCarDealersPage() {
    }

//    @And("I should see the dealer names <dealersName> are display on page")
//    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage() {
//    // new FindDealerPage().checkDealerNamesAvailable("dealersName");
////        System.out.println("dealers name: "+ dealerNames);
////        Assert.assertEquals(new FindDealerPage().checkDealerNamesAvailable(dealerNames), dealerNames, "Error");
////    }

    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealerNames) {
        System.out.println("dealers name: "+ dealerNames);
        Assert.assertEquals(new FindDealerPage().checkDealerNamesAvailable(dealerNames), dealerNames, "Error");
    }

    }





