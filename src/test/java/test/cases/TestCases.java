package test.cases;

import org.testng.annotations.Test;
import test.base.BaseTest;

import static io.qameta.allure.Allure.step;

import static com.rshb.autotests.constants.Constant.Urls.RSHB;

public class TestCases extends BaseTest {

    @Test
    public void testCaseOne() {
        getPageManager().getBasePage().open(RSHB);
        step("Кликаем Частным лицам", () -> getPageManager().getMainPage().openPrivateClientsPage());
        step("Выбираем Кредиты", () ->getPageManager().getPrivateClientsPage().openCreditsPage());
        step("Переходим на станицу потреительский кредит без обеспечения", () ->getPageManager().getCreditsPage().openUnsecuredConsumerLoanPage());
        step("Рассчитываем кридит", () ->getPageManager().getLoanCalculationPage().calculateLoan());
        step("Сравниваем предварительный рассчёт", () ->getPageManager().getLoanCalculationPage().ComparisonOfPreliminaryCalculation());
    }

    @Test
    public void testCaseTwo() {
        getPageManager().getBasePage().open(RSHB);
        step("Кликаем Частным лицам", () -> getPageManager().getMainPage().openPrivateClientsPage());
        step("Выбираем вклады и сбережения", () -> getPageManager().getPrivateClientsPage().openDepositsAndSavingsPage());
        step("Переходит на страницу вклады и сбережения", () -> getPageManager().getDepositsAndSavingsPage().openCalculationOfProfitabilityOnDepositPage());
        step("Сравниваем годовую ставку", () -> getPageManager().getCalculationOfProfitabilityOnDepositPage().comparisonOfAnnualRates());
    }
}