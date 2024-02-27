package org.rd.lessons.Lesson18Odev13;

import Lesson18JUnitTestNgTestCerceveleriveVeriOdakliTestDataDrivenTesting.BonusHesabiLesson18Odev;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BonusHesabiTest {

    public BonusHesabiTest(String name) {
    }

    public String getname() {
        return ("Todor Rogachev");
    }

    @Test(groups="unit")

    public void  testBonusHesabiName(){
       BonusHesabiLesson18Odev name = new BonusHesabiLesson18Odev("Todor Rogachev");

       assertEquals(BonusHesabiLesson18Odev.getFirstname(),"Todor Rogachev");

    }
    @Test(groups = "unit")
    public void testBonusHesabiSalary(){
        BonusHesabiLesson18Odev salary =new BonusHesabiLesson18Odev("Todor Rogachev", "2000");

        assertEquals(BonusHesabiLesson18Odev.getsalary(),"2000");

    }


}
