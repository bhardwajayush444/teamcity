package com.kr.tests;

import com.teamcity.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class testCaluclator {
    calculator calc;

    @Test
    public void testAdd(){
        calc=new calculator();
        int a=5;
        int b=10;
        Assert.assertEquals(calc.add(a,b),15);
    }

    @Test
    public void testSubtract(){
        calc=new calculator();
        int a=10;
        int b=5;
        Assert.assertEquals(calc.subtract(a,b),5);
    }

    @Test
    public void testMultiply(){
        calc=new calculator();
        int a=10;
        int b=5;
        Assert.assertEquals(calc.multiply(a,b),50);
    }
    @Test
    public void validateCOncatenate(){
        calc=new calculator();
        Assert.assertEquals(calc.concatenate("Ayush","Bhardwaj"),"Ayush Bhardwaj");
    }
}
