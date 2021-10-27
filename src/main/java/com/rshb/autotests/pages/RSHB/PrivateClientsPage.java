package com.rshb.autotests.pages.RSHB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivateClientsPage extends BasePage {

    @FindBy (xpath = "//*[@class='b-page-head-menu b-page-head-menu_trigger']//*[text()='Кредиты']")
    WebElement creditsBtn;

    @FindBy (xpath = "//*[@class='b-page-head-menu b-page-head-menu_trigger']//*[text()='Вклады и сбережения']")
    WebElement depositsAndSavingsBtn;

    @FindBy (xpath = "//*[@class='b-sections-menu-item moscow']//*[text()='Ставки по вкладам повышены']")
    WebElement increasedDepositsBtn;


    public PrivateClientsPage openCreditsPage() {
        customClick(creditsBtn);

        return this;
    }

    public PrivateClientsPage openDepositsAndSavingsPage() {
        customClick(depositsAndSavingsBtn);
        customClick(increasedDepositsBtn);

        return this;
    }

}
