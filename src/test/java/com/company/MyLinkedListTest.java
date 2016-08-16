package com.company;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class MyLinkedListTest {

    MyLinkedList list;

    @Before
    public void createListOfThreeElements() {
        list = new MyLinkedList();
        list.createList("We");
        list.createList("are");
        list.createList("pretty");
    }

    @org.junit.Test
    public void outputSortingFromTest() throws Exception {
        Assert.assertEquals("We are pretty", list.outputSortingFrom().toString());
    }
    @org.junit.Test
    public void outputTestForOneElement() throws Exception {
        MyLinkedList emptyList = new MyLinkedList();
        emptyList.addNewElement("We", 0);
        Assert.assertEquals("We", emptyList.outputSortingFrom().toString());
    }

    @org.junit.Test
    public void outputTestForNullElement() throws Exception {
        MyLinkedList emptyList = new MyLinkedList();
        Assert.assertEquals("", emptyList.outputSortingFrom().toString());
    }

    @org.junit.Test
    public void addNewLastElement() throws Exception {
        list.addNewElement("7", 5);
        Assert.assertEquals("We are pretty 7", list.outputSortingFrom().toString());
    }


    @org.junit.Test
    public void addNewFirstElement() throws Exception {
        list.addNewElement("7", 0);
        Assert.assertEquals("7 We are pretty", list.outputSortingFrom().toString());
    }

    @org.junit.Test
    public void addNewInsideElement() throws Exception {
        list.addNewElement("7", 2);
        Assert.assertEquals("We are 7 pretty", list.outputSortingFrom().toString());
    }

    @org.junit.Test
    public void calculateCountElement() throws Exception {
        Assert.assertEquals(3, list.countQuantity());
    }

    @org.junit.Test
    public void calculateNoElement() throws Exception {
        MyLinkedList EmptyListForCalculation = new MyLinkedList();
        Assert.assertEquals(0, EmptyListForCalculation.countQuantity());
    }

    @org.junit.Test
    public void addAndCalculateElement() throws Exception {
        list.addNewElement("7");
        Assert.assertEquals(4, list.countQuantity());
    }

    @org.junit.Test
    public void addOneElement() throws Exception {
        MyLinkedList emptyList = new MyLinkedList();
        emptyList.addNewElement("7");
        Assert.assertEquals(1, emptyList.countQuantity());
    }

    @org.junit.Test
    public void deleteFirstElement() throws Exception {
        list.deleteElement(0);
        Assert.assertEquals("are pretty", list.outputSortingFrom().toString());
    }

    @org.junit.Test
    public void deleteMiddleElement() throws Exception {
        list.deleteElement(1);
        Assert.assertEquals("We pretty", list.outputSortingFrom().toString());
    }

    @org.junit.Test
    public void deleteLastElement() throws Exception {
        list.deleteElement(2);
        Assert.assertEquals("We are", list.outputSortingFrom().toString());
    }

    @org.junit.Test
    public void deleteNotExistedElement() throws Exception {
        list.deleteElement(8);
        Assert.assertEquals("We are pretty", list.outputSortingFrom().toString());
    }

    @org.junit.Test
    public void deleteFromEmptyList() throws Exception {
        MyLinkedList emptyList = new MyLinkedList();
        emptyList.deleteElement(2);
        Assert.assertEquals("", emptyList.outputSortingFrom().toString());
    }

    @After
    public void tearDown(){
        list = null;
    }
}