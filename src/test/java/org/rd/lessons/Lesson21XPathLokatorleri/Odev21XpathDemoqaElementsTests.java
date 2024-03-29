package org.rd.lessons.Lesson21XPathLokatorleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Odev21XpathDemoqaElementsTests {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);

        JavascriptExecutor jsx =(JavascriptExecutor) driver; //sayfa kaydırma
        jsx.executeScript("window.scroll(0,100)",""); //devam ettırıyoruz kaydırma ıslemını


//        consent sorunu ıcın

        try {
            WebElement regulationsConcent = driver.findElement(By.cssSelector("button.fc-button.fc-cta-consent.fc-primary-button[aria-label='Consent'] p"));
            regulationsConcent.click();
            System.out.println("Consent butonu tıklandı.");
        } catch (Exception e) {
            System.out.println("Consent butonu bulunamadı veya tıklanabilir olmadı.");

        } finally {
            WebElement linkButtons = driver.findElement(By.xpath("//span[normalize-space()='Buttons']"));
            linkButtons.click();

            WebElement clickMeButton = driver.findElement(By.xpath("(//p[contains(.,'Consent')]"));
            clickMeButton.click();

            WebElement myMessage = driver.findElement(By.xpath("//button[@id='DuBba']"));
            System.out.println(myMessage.getText());
        }
//        System.out.println("Ana pencere başlığı: " + driver.getTitle());




    }
}
