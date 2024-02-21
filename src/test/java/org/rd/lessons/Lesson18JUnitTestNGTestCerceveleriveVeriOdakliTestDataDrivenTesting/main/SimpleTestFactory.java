package org.rd.lessons.Lesson18JUnitTestNGTestCerceveleriveVeriOdakliTestDataDrivenTesting.main;

import org.testng.annotations.Factory;

public class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new SimpleTest(0), new SimpleTest(1) , new SimpleTest(3)};
    }
}