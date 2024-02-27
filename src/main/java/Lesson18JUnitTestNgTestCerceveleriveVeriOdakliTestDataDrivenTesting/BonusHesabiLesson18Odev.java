package Lesson18JUnitTestNgTestCerceveleriveVeriOdakliTestDataDrivenTesting;

import Lesson6OperatorveKosullar.BonusHesabi;
import lombok.*;

public class BonusHesabiLesson18Odev {

    @Setter
    @Getter
    String name;
    @Setter
    @Getter
    double salary;
    @Setter
    @Getter


    int workHours;
    double bonus;

    public BonusHesabiLesson18Odev(String name) {
        this.name = name;

    }
    public BonusHesabiLesson18Odev(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public BonusHesabiLesson18Odev(String todorRogahev, String number) {
    }

    public BonusHesabiLesson18Odev() {

    }


    public static String getFirstname() {
        return ("Todor Rogachev");
    }

    public static String getsalary() {
        return ("2000");
    }
}




