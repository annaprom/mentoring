package com.company;


import org.junit.Assert;

public class MainTest {
    @org.junit.Test
    public void outputSortingFromTest() throws Exception {
        Element e1 = new Element(null, "We", null);
        Element e2 = new Element(e1, "are", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "pretty", null);
        e2.setNext(e3);
        Assert.assertEquals("We are pretty", Main.outputSortingFrom(e1).toString());
    }

    @org.junit.Test
    public void outputTestForOneElement() throws Exception {
        Element e1 = new Element(null, "We", null);
        Assert.assertEquals("We", Main.outputSortingFrom(e1).toString());
    }

    @org.junit.Test
    public void outputTestForNullElement() throws Exception {
        Assert.assertEquals("", Main.outputSortingFrom(null).toString());
    }

    @org.junit.Test
    public void addNewLastElement() throws Exception {
        Element e1 = new Element(null, "We", null);
        Element e2 = new Element(e1, "are", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "pretty", null);
        e2.setNext(e3);
        Main.addNewElement("7", 5, e1);
        Assert.assertEquals("We are pretty 7", Main.outputSortingFrom(e1).toString());
    }

    @org.junit.Test
    public void addNewFirstElement() throws Exception {
        Element e1 = new Element(null, "We", null);
        Element e2 = new Element(e1, "are", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "pretty", null);
        e2.setNext(e3);
        Main.addNewElement("7", 0, e1);
        Assert.assertEquals("7 We are pretty", Main.outputSortingFrom(e1.getPrevious()).toString());
    }

    @org.junit.Test
    public void addNewInsideElement() throws Exception {
        Element e1 = new Element(null, "We", null);
        Element e2 = new Element(e1, "are", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "pretty", null);
        e2.setNext(e3);
        Main.addNewElement("7", 2, e1);
        Assert.assertEquals("We are 7 pretty", Main.outputSortingFrom(e1).toString());
    }

    @org.junit.Test
    public void calculateCountElement() throws Exception {
        Element e1 = new Element(null, "We", null);
        Element e2 = new Element(e1, "are", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "pretty", null);
        e2.setNext(e3);
        Assert.assertEquals(3, Main.countQuantity(e1));
    }

    @org.junit.Test
    public void calculateNoElement() throws Exception {
        Assert.assertEquals(0, Main.countQuantity(null));
    }

    @org.junit.Test
    public void addAndCalculateElement() throws Exception {
        Element e1 = new Element(null, "We", null);
        Element e2 = new Element(e1, "are", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "pretty", null);
        e2.setNext(e3);
        Main.addNewElement("7", e1);
        Assert.assertEquals(4, Main.countQuantity(e1.getPrevious()));
    }
}