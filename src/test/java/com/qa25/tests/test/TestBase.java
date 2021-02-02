package com.qa25.tests.test;

import com.qa25.tests.fw.CarPage;
import com.qa25.tests.fw.FilterPage;
import com.qa25.tests.fw.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    String baseURL = "https://www.gettacar.com/";
    MainPage mainPage;
    FilterPage filterPage;
    CarPage carPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(baseURL);

        mainPage = new MainPage(driver);
        filterPage = new FilterPage(driver);
        carPage = new CarPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void stop() {
        driver.quit();
    }

}
