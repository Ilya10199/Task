package com.rshb.autotests.pages.RSHB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositsAndSavingsPage extends BasePage {

    @FindBy (xpath = "//*[text()='Расчет доходности по вкладам и накопительным счетам']")
    WebElement calculationOfProfitabilityOnDepositsBtn;

    public DepositsAndSavingsPage openCalculationOfProfitabilityOnDepositPage() {
        customClick(calculationOfProfitabilityOnDepositsBtn);

        return this;

    }

}
