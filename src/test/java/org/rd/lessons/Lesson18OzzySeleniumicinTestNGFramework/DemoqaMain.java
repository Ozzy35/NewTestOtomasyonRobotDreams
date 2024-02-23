package org.rd.lessons.Lesson18OzzySeleniumicinTestNGFramework;

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

        driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);//SAYFANIN YUKLENMESINI BEKLER
        driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);//YAPILAN ISLEMLERI BEKLER

        JavascriptExecutor jsx =(JavascriptExecutor) driver; //sayfa kaydırma
        jsx.executeScript("window.scroll(0,100)",""); //devam ettırıyoruz kaydırma ıslemınıte

        try {
            WebElement regulationsConcent = driver.findElement(By.cssSelector("button.fc-button.fc-cta-consent.fc-primary-button[aria-label='Consent'] p"));
            regulationsConcent.click();
            System.out.println("Consent butonu tıklandı.");
        } catch (Exception e) {
            System.out.println("Consent butonu bulunamadı veya tıklanabilir olmadı.");

        } finally {
            WebElement fullName =driver.findElement(new By.ByCssSelector("#userName"));
            fullName.click();
            fullName.sendKeys("Ozzy");

            WebElement eMail =driver.findElement((By.xpath("//input[@id='userEmail']")));
            eMail.click();
            eMail.sendKeys("ozzy@gmail.com");

            WebElement currentAddress =driver.findElement((By.cssSelector(" .form-control[placeholder=\"Current Address\"]")));
            currentAddress.click();
            currentAddress.sendKeys("izmir, Türkiye");


            WebElement permanentAddress = driver.findElement((By.cssSelector("#permanentAddress")));
            permanentAddress.click();
            permanentAddress.sendKeys("İzmir,Türkiye");

            WebElement submitButton= driver.findElement(By.cssSelector("#submit"));
            submitButton.click();

            driver.quit();
        }
        System.out.println("Ana pencere başlığı: " + driver.getTitle());


    }

}

//scroldown selenium java---stacover flowdan bakabılırısn