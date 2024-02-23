package com.metlife.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demoClass {
    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver1.get("");
    }
}
