package com.qa25.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends HelperBase{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickChooseCarButton() {
        click(By.xpath("//span//a [@href='/used/']"));
    }

}
