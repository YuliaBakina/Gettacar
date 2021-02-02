package com.qa25.tests.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MainTest extends TestBase {

    @Test
    public void interviewTaskTest()  {

        //Press on 'Choose your car'
        mainPage.clickChooseCarButton();

        //From the left menu get to 'Body type'
        List<WebElement> filters = filterPage.getFiltersList();
        filterPage.clickBodyType(filters); //   filters.get(1).click();

        //Select 'Pickup'
        filters = filterPage.getBodytypesList();
        filterPage.clickPickup(filters);

        //Press on the first car
        List<WebElement> cars = filterPage.getCarsList();
        filterPage.clickChosenCar(cars, 0); // 0 - the first car

        //Check if the price is > 20000$ then return "High" or if the price is < 20000 then return "Low"
        Double price = Double.parseDouble(carPage.getCarPrice().split(" ")[0].substring(1).replace(",",""));
        String result = checkPrice(price);
        System.out.println("==================================================================");
        System.out.println("The test method returns: " + result + ", because car price = $" + price);
        System.out.println("==================================================================");

    }

    private String checkPrice(Double price) {
        if(price > 20000){
            return "High";
        }
        return "Low";
    }
}
