package org.rd.lessons.Lesson18JUnitTestNGTestCerceveleriveVeriOdakliTestDataDrivenTesting.OzzyCalisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//WebDriver ayaga kaldırma ornegı:
public class DemoqaMain {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);//SAYFANIN YUKLENMESINI BEKLER
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);//YAPILAN ISLEMLERI BEKLER



        WebElement fullName =driver.findElement(new By.ByCssSelector("#userName"));
        fullName.click();
        fullName.sendKeys("Ozzy");

        WebElement eMail =driver.findElement((By.xpath("//input[@id='userEmail']")));
        eMail.click();
        eMail.sendKeys("ozzy@gmail.com");

        WebElement currentAddress =driver.findElement((By.cssSelector(" .form-control[placeholder=\"Current Address\"]")));
        currentAddress.click();
        currentAddress.sendKeys("izmir, Türkiye");

        JavascriptExecutor jsx =(JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,350", ""); //selenium sayfa asagı kaydırma

        driver.quit();

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea@id=\"permanentAddress\""));
        permanentAddress.click();
        permanentAddress.sendKeys("İzmir,Türkiye");

        WebElement submitButton= driver.findElement(By.id("submit"));
        submitButton.click();







    }

}

//scroldown selenium java---stacover flowdan bakabılırısn