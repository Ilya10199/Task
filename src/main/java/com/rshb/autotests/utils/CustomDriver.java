package com.rshb.autotests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.rshb.autotests.utils.Config.CHROME;
import static com.rshb.autotests.constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CustomDriver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    private static WebDriver initDriver() {


        switch (CHROME) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect browser name" + CHROME);
        }
        driver.manage().window().maximize();

        return driver;
    }
}
