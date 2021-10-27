package com.rshb.autotests.pages.RSHB;

import com.rshb.autotests.utils.CustomDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

   @FindBy (xpath = "//*[@class='b-main-menu-items']//*[text()='Частным лицам']")
   WebElement privateClientsBtn;


    public MainPage openPrivateClientsPage() {
        BasePage page = PageFactory.initElements(CustomDriver.getDriver(), BasePage.class);
        page.customClick(privateClientsBtn);

        return this;
    }
}
