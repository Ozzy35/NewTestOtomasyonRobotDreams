package org.rd.lessons.Lesson18OzzySeleniumicinTestNGFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CorrectTestNG {

    //Mını otomasyon yazdik, ıntelıj kodları satır satır okuyor, KODUJ TEMIZ OLMASI KARGASA ONELNEMEIS ICIN YAPIYORUZ
    //kodumuzu basak bırısı baktıgında anlasılabılır olması gereklı o yuzden yapıyoruz
    WebDriver driver;
    @BeforeTest  //Test öncesi kosulcak adımlar, testelerımızden once burdakılerı kosucak
    public void testtenOncekiAdimlar(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

}
     @Test  //test sırasında kosulcaklar
    public void anaSayfayaBaglanma(){

        driver.get("https://www.google.com");
     }
     @AfterTest  //Test sonrası kosulcak adimlar
    public void testSonrasiAdimlar(){

        driver.quit();
     }

}
