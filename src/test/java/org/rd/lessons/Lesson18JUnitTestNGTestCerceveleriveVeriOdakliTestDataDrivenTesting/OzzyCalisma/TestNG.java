package org.rd.lessons.Lesson18JUnitTestNGTestCerceveleriveVeriOdakliTestDataDrivenTesting.OzzyCalisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
    WebDriver driver;
    @BeforeTest  //Test öncesi kosulcak adımlar
    public void testtenOncekiAdimlar(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

}
     @Test
    public void anaSayfayaBaglanma(){   //Testten sonra kosulcak adimlar
        driver.get("https://www.google.com");
     }
     @AfterTest  //Test sonrası kosulcak adimlar
    public void testSonrasiAdimlar(){
        driver.quit();
     }

}
