package com.resolver.web_app.WebDriverHooks;


import io.github.bonigarcia.wdm.WebDriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class WebAppDriverHooks {

    private static WebDriver driver;

    @Before
    public static WebDriver setUp() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            String appUrl = System.getProperty("app.url");
            System.out.println("URL:::::::::: " + appUrl);

            if (appUrl != null) {
                driver.get(appUrl);
            }
        }
        return driver;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return setUp();
    }
}
