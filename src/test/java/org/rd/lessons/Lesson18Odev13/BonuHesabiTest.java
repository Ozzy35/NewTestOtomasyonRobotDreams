package org.rd.lessons.Lesson18Odev13;

import org.testng.annotations.Test;

public class BonuHesabiTest {

    @Test(groups = {"Grup A"})

    public void test1() {

        System.out.println("Test 1");
    }

    @Test(groups = {"Grup B"})

    public void test2() {

        System.out.println("Test 2");
    }

    @Test(groups = {"Grup C","Grup A"})

    public void test3() {

        System.out.println("Test 3");
    }
}




