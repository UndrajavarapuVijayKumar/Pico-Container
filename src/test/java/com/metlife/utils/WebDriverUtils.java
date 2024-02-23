package com.metlife.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverUtils {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static FileInputStream fis;
    public static Properties p;
    public static void init() throws IOException {
        fis = new FileInputStream("C:\\Users\\lenovo\\Downloads\\picocontainer\\src\\test\\resources\\Features\\Data.properties");
        p = new Properties();
        p.load(fis);
    }
    public static void initialize(String browser){
        switch (browser){
            case "ff": case "firefox":
                driver = new FirefoxDriver();
                break;
            case "gc": case  "chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void launchBrowser(){
//        driver.get(String.valueOf(p.getProperty("ixigo").equals(URL)));
        driver.navigate().to("https://www.ixigo.com/trains/transactions#login-signup");
    }
    public static void type(By locator, String value){
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        driver.findElement(locator).sendKeys(value);
//        we.clear();

    }
    public static void click(By locator) throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        driver.findElement(locator).click();
        Thread.sleep(3000);
    }
    public static void assertion(String ErrorValue, String ActualValue){
        Assert.assertEquals(ErrorValue,ActualValue);
    }
    public static String gettext(By locator){
        String text= driver.findElement(locator).getText();
        return  text;
    }
    public static void scroll(WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);

    }
    public static void screenshot() throws IOException {
        File f1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f1,new File("./image.png")  );
    }


}
