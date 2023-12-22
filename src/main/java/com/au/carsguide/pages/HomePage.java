package com.au.carsguide.pages;

import com.au.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buySellTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;
    @CacheLookup
    @FindBy(css = "body.html.not-front.not-logged-in.no-sidebars.page-buy-a-car.page-buy-a-car-new-and-used-car-search.cars-for-sale.submenu-active:nth-child(2) div.content-detail.clearfix:nth-child(15) div.region.region-content:nth-child(1) div.block.block-system:nth-child(1) div.content div.cars-for-sale-form-wrapper.buy-a-car-form-wrapper div.panel.panel-car-for-sale-form div.panel-body.container form.form-inline div.search-type:nth-child(2) > label.search-type-all.active")
    WebElement newAndUsedCars;

    @CacheLookup
    @FindBy(id = "makes")
    WebElement selectMake;

    @CacheLookup
    @FindBy(id = "models")
    WebElement selectModel;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/select[1]")
    WebElement selectLocation;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/select[1]")
    WebElement selectPrice;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCar;

    @CacheLookup
    @FindBy(css = "body.carsguide:nth-child(2) div.universalGrid:nth-child(2) div.universalInner div.mace-windu div.grid-srp:nth-child(3) section.innerGrid.container.slidingContent.inner-grid div.filterWrapper.searchSidebar div.sidebar div.bgWhite div.filter:nth-child(3) div.collapsable.desktopFilter div.clickable div.accordionHeader > h3.title")
    WebElement makeInResult;

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedCarLink;

    public void mouseHooverOnBuyAndSellLink() {
        log.info("Mouse hoover Buy +Sell" + buySellTab.toString());
        mouseHoverToElement(buySellTab);

    }

    public void searchCarLink() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Search car " + searchCars.toString());
        clickOnElement(searchCars);
    }

    public void clickOnNewAndUsedCars() throws InterruptedException {
        Thread.sleep(2000);
        log.info("New And Used Car" + newAndUsedCars.toString());
        clickOnElement(newAndUsedCars);
    }

    public void selectMakeOptions(String value) {
        log.info("select Make " + selectMake.toString());
        selectByValueFromDropDown(selectMake, value);
    }

    public void selectModelOptions(String value) {
        log.info("select Model " + selectModel.toString());
        selectByVisibleTextFromDropDown(selectModel, value);
    }

    public void selectLocationOptions(String value) {
        log.info("select Location " + selectLocation.toString());
        selectByValueFromDropDown(selectLocation, value);
    }

    public void selectPriceText(String value) throws InterruptedException {
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(selectPrice, value);
        log.info("select Price" + selectPrice.toString());
    }

    public void clickOnFindMyNextCarTab() {
        log.info("Find my next car" + selectPrice.toString());

        clickOnElement(findMyNextCar);
    }

    public String verifyTheMake(String make) {
        log.info("Verify the Make " + make.toString());
        return getTextFromElement(makeInResult);
    }

    public void clickOnUsedCar(){
        clickOnElement(usedCarLink);
    }
}
