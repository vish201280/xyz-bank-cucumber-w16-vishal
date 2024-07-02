package com.xyzbank.demo.pages;

import com.xyzbank.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = Logger.getLogger(AccountPage.class);

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawTab;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amtInputField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositWithdrawBtn;

    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement depositWithdrawSuccessMsg;


    public void clickOnDepositTab() {
        clickOnElement(depositTab);
        log.info("click on " + depositTab.toString());
    }

    public void clickOnWithdrawTab() {
        clickOnElement(withdrawTab);
        log.info("click on " + withdrawTab.toString());
    }

    public void clickOnDepositWithdrawBtn() {
        clickOnElement(depositWithdrawBtn);
        log.info("click on " + depositWithdrawBtn.toString());
    }

    public void enterAmount(String amt) {
        sendTextToElement(amtInputField, amt);
        log.info("Enter " + amt);
    }

    public String getDepositWithdrawSuccessMsg() {
        log.info("Get text " + depositWithdrawSuccessMsg.toString());
        return getTextFromElement(depositWithdrawSuccessMsg);
    }

}
