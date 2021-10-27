package com.rshb.autotests.pages.RSHB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.rshb.autotests.constants.Constant.AnnualRate.*;

public class CalculationOfProfitabilityOnDepositPage extends BasePage{



    @FindBy (xpath = "//*[@id='deposit_451879']//td[contains(text(), '%')]")
    WebElement myBenefit;

    @FindBy (xpath = "//*[@id='deposit_409523']//td[contains(text(), '%')]")
    WebElement myPiggyBank;

    @FindBy (xpath = "//*[@id='deposit_330854']//td[contains(text(), '%')]")
    WebElement myScore;

    @FindBy (xpath = "//*[@id='deposit_451946']//td[contains(text(), '%')]")
    WebElement ultra;

    @FindBy (xpath = "//*[@id='deposit_451924']//td[contains(text(), '%')]")
    WebElement premium;

    @FindBy (xpath = "//*[@id='deposit_11790']//td[contains(text(), '%')]")
    WebElement posteRestante;


    public CalculationOfProfitabilityOnDepositPage comparisonOfAnnualRates() {

        waitElementIsVisible(myBenefit);

        String actualMyBenefit = myBenefit.getText();
        String actualMyPiggyBank = myPiggyBank.getText();
        String actualMyScore = myScore.getText();
        String actualUltra = ultra.getText();
        String actualPremium = premium.getText();
        String actualPosteRestante = posteRestante.getText();


        Assert.assertEquals(MY_BENEFIT, actualMyBenefit);
        Assert.assertEquals(MY_PIGGY_BANK, actualMyPiggyBank);
        Assert.assertEquals(MY_SCORE, actualMyScore);
        Assert.assertEquals(ULTRA, actualUltra);
        Assert.assertEquals(PREMIUM, actualPremium);
        Assert.assertEquals(POSTE_RESTANTE, actualPosteRestante);

        return this;
    }
}
