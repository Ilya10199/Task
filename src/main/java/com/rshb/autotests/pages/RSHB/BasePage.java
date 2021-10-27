package com.rshb.autotests.pages.RSHB;

import com.rshb.autotests.utils.CustomDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.rshb.autotests.constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(CustomDriver.getDriver(), this);
    }

    public void open(String url) {
        CustomDriver.getDriver().get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(CustomDriver.getDriver(), EXPLICIT_WAIT ).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void scrollToElement(WebElement xPath){
        ((JavascriptExecutor)CustomDriver.getDriver()).executeScript("arguments[0].scrollIntoView();", xPath);
    }

    public void customClick (WebElement element){
        scrollToElement(element);
        element.click();
    }

    public void customSendKey (WebElement element, String information){
         scrollToElement(element);
         element.click();
         element.clear();
         element.sendKeys(information);
    }

}
