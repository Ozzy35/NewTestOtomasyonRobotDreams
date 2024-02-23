package org.rd.lessons.Lesson21XPathLokatorleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev21XpathDemoqaWebtablesTests {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        JavascriptExecutor jsx =(JavascriptExecutor) driver; //sayfa kaydırma
        jsx.executeScript("window.scroll(0,100)",""); //devam ettırıyoruz kaydırma ıslemını

        // consent sorunu ıcın

        try {
            WebElement regulationsConcent = driver.findElement(By.cssSelector("button.fc-button.fc-cta-consent.fc-primary-button[aria-label='Consent'] p"));
            regulationsConcent.click();
            System.out.println("Consent butonu tıklandı.");
        } catch (Exception e) {
            System.out.println("Consent butonu bulunamadı veya tıklanabilir olmadı.");

        } finally {
            WebElement addButton =driver.findElement(By.xpath(" //button[@id='addNewRecordButton']"));
            addButton.click();

            WebElement firstName =driver.findElement(By.xpath("//input[@id='firstName']"));
            firstName.click();
            firstName.sendKeys("Ozge");


            WebElement lastName =driver.findElement(By.xpath("//input[@id='lastName']"));
            lastName.click();
            lastName.sendKeys("Sargin");



            WebElement email =driver.findElement(By.xpath("//input[@id='userEmail']"));
            email.click();
            email.sendKeys("Ozzy@gmail.com");

            WebElement age =driver.findElement(By.xpath("//input[@id='age']"));
            age.click();
            age.sendKeys("33");

            WebElement salary =driver.findElement(By.xpath("//input[@id='salary']"));
            salary.click();
            salary.sendKeys("400000000");

            WebElement departman =driver.findElement(By.xpath("//input[@id='department']"));
            departman.click();
            departman.sendKeys("IT");


            WebElement submitButton =driver.findElement(By.xpath(" //button[@id='submit']"));
            submitButton.click();


            driver.quit();

        }
      //  System.out.println("Ana pencere başlığı: " + driver.getTitle());


//        WebElement elementsButton =driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
//        elementsButton.click();

//        WebElement webTables =driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
//        webTables.click();


    }



}
