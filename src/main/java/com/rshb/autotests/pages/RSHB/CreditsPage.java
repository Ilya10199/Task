package com.rshb.autotests.pages.RSHB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditsPage extends BasePage {

    @FindBy (xpath = "//*[text()='Потребительский кредит без обеспечения']")
    WebElement unsecuredConsumerLoanBtn;


    public CreditsPage openUnsecuredConsumerLoanPage() {

        customClick(unsecuredConsumerLoanBtn);

        return this;
    }

}
