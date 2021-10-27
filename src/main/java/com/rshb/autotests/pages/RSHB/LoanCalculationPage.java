package com.rshb.autotests.pages.RSHB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.rshb.autotests.constants.Constant.Estimation.LOAN_RATE;
import static com.rshb.autotests.constants.Constant.Estimation.MONTHLY_PAYMENT;
import static com.rshb.autotests.constants.Constant.LoanData.CREDIT_AMOUNT;
import static com.rshb.autotests.constants.Constant.LoanData.CREDIT_TERM;

public class LoanCalculationPage extends BasePage {

    @FindBy (xpath = "//*[text()='Сумма кредита']/..//input")
    WebElement creditAmountBtn;

    @FindBy (xpath = "//*[contains(text(),'месяцах')]/..//input")
    WebElement creditTermBtn;

    @FindBy (xpath = "//*[contains(text(), 'Комплексная ')]/..//input")
    WebElement comprehensiveInsuranceCoverageBtn;

    @FindBy (xpath = "//*[contains(text(), 'Получаю')]/..//input")
    WebElement receiveASalaryToAnAccountRSHBBtn;

    @FindBy (xpath = "//*[@class='loan-calculator-result__value']")
    WebElement loanRate;

    @FindBy (xpath = "//*[@class='loan-calculator-result__value loan-calculator-result__value--green']")
    WebElement monthlyPayment;


    public LoanCalculationPage calculateLoan () {

        customClick(comprehensiveInsuranceCoverageBtn);
        customClick(receiveASalaryToAnAccountRSHBBtn);
        customClick(creditAmountBtn);
        customSendKey(creditAmountBtn, CREDIT_AMOUNT);
        customClick(creditTermBtn);
        customSendKey(creditTermBtn, CREDIT_TERM);

        return this;
    }

    public LoanCalculationPage ComparisonOfPreliminaryCalculation() {
        String actualMonthlyPayment = monthlyPayment.getText();
        String actualLoanRate = loanRate.getText();

        Assert.assertEquals(LOAN_RATE, actualLoanRate);
        Assert.assertEquals(MONTHLY_PAYMENT, actualMonthlyPayment );

        return this;
    }

}
