package com.qa25.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HelperBase {
    WebDriver driver;

    public HelperBase(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> getItemsList(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return element;
    }

    public void click(By locator){
        waitUntilElementIsClicable(locator).click();
    }

    public WebElement waitUntilElementIsClicable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    public String getText(By locator) {
        return findElementOnPage(locator).getText();
    }

    public WebElement findElementOnPage(By locator){
        return driver.findElement(locator);
    }

}
