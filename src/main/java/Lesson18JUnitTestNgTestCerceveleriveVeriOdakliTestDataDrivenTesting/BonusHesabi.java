package Lesson18JUnitTestNgTestCerceveleriveVeriOdakliTestDataDrivenTesting;

import lombok.Getter;
import lombok.Setter;

public class BonusHesabi {

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

    public BonusHesabi(String name, double salary, int workHours) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }

    public void bonus() {
        if (this.workHours > 25) {
            this.bonus = (workHours - 25) * 1000;
            System.out.println("Extra çalışma saatlerine uygulanan bonus miktarı : 1000 TL " + this.bonus);
        } else {
            System.out.println("Bonus almaya hak kazanmadınız. ");

        }
    }

    public void printInfo() {
        System.out.println("  ");
        System.out.println("*******************************");
        System.out.println("Çalışanın adı:" + getName());
        System.out.println("Çalışsanın maaşı:" + getSalary());
        System.out.println("Çalışanın çalışma saatleri: " + getWorkHours());
        System.out.println("*********************************");

        bonus(); //Constructors

    }
}


