package com.company;

public class Element {
    private Element previous;
    private String value;
    private Element next;

    public Element(Element previous, String value, Element next) {
        this.previous = previous;
        this.value = value;
        this.next = next;
    }

    public Element(String value) {
        this(null, value, null);
    }

    public Element getPrevious() {
        return previous;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}