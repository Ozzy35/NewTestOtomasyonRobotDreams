package org.rd.lessons.Lesson18JUnitTestNGTestCerceveleriveVeriOdakliTestDataDrivenTesting.main;


import Lesson18JUnitTestNGTestCerceveleriveVeriOdakliTestDataDrivenTesting.Customer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class CustomerTestNG {
    Customer customer = new Customer();
    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod()
    public void beforeMethod(){
        customer.setFirstname("Ahmet");
    }

    @Test(groups = "unit")
    public void testCustomerName() {

        assertEquals(customer.getFirstname(), "Ahmet" );
    }

    @Test(groups = "unit")
    public void testCustomerEmail() {
        Customer customer = new Customer("John Doe", "johndoe@example.com");

        assertEquals(customer.getEmail(), "johndoe@example.com");
    }
}