package com.qa25.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterPage extends HelperBase{

    public FilterPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getFiltersList() {
        return getItemsList(By.cssSelector("[class = 'collapsible-box_container__1J0oZ filters-section_collapse-container__2dGRP collapsible-box_desktop__2IiNs']"));
    }

    public List<WebElement> getBodytypesList() {
       return getItemsList(By.cssSelector("[class='filters-section_type__18oxQ']"));
    }

    public List<WebElement> getCarsList() {
        return driver.findElements(By.cssSelector("[class='catalog-car-card_catalog-car-card__mneaS cars-grid_car-card__CCKfU']"));
    }

    public void clickChosenCar(List<WebElement> cars, int i) {
        cars.get(i).click();
    }

    public void clickBodyType(List<WebElement> filters) {
        for(WebElement e : filters){
            if(e.getText().equals("Body type")){
                e.click();
            }
        }
    }

    public void clickPickup(List<WebElement> filters) {
        for(WebElement e : filters){
            if(e.getText().equals("Pickup")){
                e.click();
            }
        }
    }

}
