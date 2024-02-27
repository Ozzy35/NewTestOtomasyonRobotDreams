package org.rd.lessons.Lesson18Odev13;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BonusHesabiTestsWithDataProvider {

    @Test(groups = "unit", dataProvider = "credentials")
    public void BonusHesabiTest(String  name, String response ){
        BonusHesabiTest bonusHesabiTest = new BonusHesabiTest(name);

        assertEquals(bonusHesabiTest.getname(), response);
    }
    @DataProvider(name = "credentials")
    public Object[][] credentials(){
        return new Object[][]{
                {"Todor Rogachev","Todor Rogach"},
                {"Todor Rogachev", "Todor Rogache"},
                {"Todor Rogachev","Todor Roga"}

        };
    }
}



//tek bır tane test metodu ıle datadrıver data provıde anannotaıosn ıle yapıyoruz
// tek bır testle data bazlı degısen tek bır yapıyı
//tekrar tekrar kosuyoruz

//ıkı tane aynı class ıcersınde farklı metodlara farklı datalar provıdelrlar
//
// kullanabılıyoruz main dekullanıblıyoruz

