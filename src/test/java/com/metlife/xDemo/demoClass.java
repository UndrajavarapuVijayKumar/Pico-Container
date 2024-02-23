package com.metlife.xDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.metlife.utils.WebDriverUtils.p;

public class demoClass {
    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver1.get(p.getProperty("ixigo"));
    }
}
