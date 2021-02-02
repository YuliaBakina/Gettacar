package com.qa25.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarPage extends HelperBase{

    public CarPage(WebDriver driver) {
        super(driver);
    }

    public String getCarPrice() {
        return getText(By.cssSelector("[class='price-box-details_carPrice__2OTPp']"));
    }
}
