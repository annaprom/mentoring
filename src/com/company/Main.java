package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Element e1 = new Element(null, "We", null);
        Element e2 = new Element(e1, "are", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "pretty", null);
        e2.setNext(e3);
        addNewElement("7", 5, e1);
        System.out.print(outputSortingFrom(e1));
//        System.out.println(outputSortingFrom(e1));
    }

    public static String outputSortingFrom(Element e) {
        String res = "";
        while (e != null) {
            res = res + " " + e.getValue();
            e = e.getNext();
        }
        return res;
    }

    public static void addNewElement(String data, int position, Element e) {
        if(position==0) {
            Element firstNew = new Element(null, data, e);
            e.setPrevious(firstNew);
        }
        else {
            int counter = 1;
            while (counter < position && e.getNext()!=null) {
                counter++;
                e = e.getNext();
            }
            Element rememberNext = e.getNext();
            Element rememberPrevious = e;
            Element eNew = new Element(rememberPrevious, data, rememberNext);
            rememberPrevious.setNext(eNew);
            if (rememberNext != null) {
                rememberNext.setPrevious(eNew);
            }
        }
    }
}
