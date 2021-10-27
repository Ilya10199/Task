package com.rshb.autotests.utils;

import com.rshb.autotests.pages.RSHB.*;

public class PageManager {

    private BasePage basePage;
    private MainPage mainPage;
    private PrivateClientsPage privateClientsPage;
    private CreditsPage creditsPage;
    private LoanCalculationPage loanCalculationPage;
    private DepositsAndSavingsPage depositsAndSavingsPage;
    private CalculationOfProfitabilityOnDepositPage calculationOfProfitabilityOnDepositPage;


    public BasePage getBasePage(){
        if(basePage == null){
            return basePage = new BasePage();
        }
        return basePage;
    }

    public MainPage getMainPage(){
        if(mainPage == null){
            return mainPage = new MainPage();
        }
        return mainPage;
    }

    public PrivateClientsPage getPrivateClientsPage(){
        if(privateClientsPage == null){
            return privateClientsPage = new PrivateClientsPage();
        }
        return privateClientsPage;
    }

    public CreditsPage getCreditsPage(){
        if(creditsPage == null){
            return creditsPage = new CreditsPage();
        }
        return creditsPage;
    }

    public LoanCalculationPage getLoanCalculationPage(){
        if(loanCalculationPage == null){
            return loanCalculationPage = new LoanCalculationPage();
        }
        return loanCalculationPage;
    }

    public DepositsAndSavingsPage getDepositsAndSavingsPage(){
        if(depositsAndSavingsPage == null){
            return depositsAndSavingsPage = new DepositsAndSavingsPage();
        }
        return depositsAndSavingsPage;
    }

    public CalculationOfProfitabilityOnDepositPage getCalculationOfProfitabilityOnDepositPage(){
        if(calculationOfProfitabilityOnDepositPage == null){
            return calculationOfProfitabilityOnDepositPage = new CalculationOfProfitabilityOnDepositPage();
        }
        return calculationOfProfitabilityOnDepositPage;
    }

}