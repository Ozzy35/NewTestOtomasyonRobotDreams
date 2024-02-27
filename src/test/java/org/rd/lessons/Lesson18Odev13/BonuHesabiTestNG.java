package org.rd.lessons.Lesson18Odev13;

import Lesson18JUnitTestNgTestCerceveleriveVeriOdakliTestDataDrivenTesting.BonusHesabiLesson18Odev;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BonuHesabiTestNG {
    BonusHesabiLesson18Odev name = new BonusHesabiLesson18Odev();


    @BeforeTest  //Before dedıgımızde her test ıcın bunu eklıycek

    public void testtenOncekiAdimlar(){
        BonusHesabiLesson18Odev.getFirstname();
        BonusHesabiLesson18Odev.getsalary();



    }
    @Test  //test sırasında kosulcaklar
    public void anaSayfayaBaglanma(){



            }
    @AfterTest  //Test sonrası kosulcak adimlar.TEAR DOWN DATA
    // BITTIKTAN SONRA DATA TEZMILEMEIZ AMACLI KULANILIR.
    // CUSTOMER YAPTINIZ TEKRARAN SILMIYCEKSINIZ BIR DAHA CALISTIRKDIKTAN
    // SONRA TEKRARDAN SAGLIKLI KULLANABILMEK ADIAN KULANILIR
    //test clasını bıtırmek ıcın kullanılır

    public void tearDown(){

    }
}


//JUNIT ANLATILDI!

