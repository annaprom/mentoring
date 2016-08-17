package com.company;

public class MyLinkedList {

    private Element firstElement;
    private Element lastElement;

    public StringBuilder outputSortingFrom() {
        StringBuilder res = new StringBuilder();
        Element innerFirstElement = firstElement;
        while (innerFirstElement != null) {
            res.append(innerFirstElement.getValue());
            if (innerFirstElement.getNext() != null) {
                res.append(" ");
            }
            innerFirstElement = innerFirstElement.getNext();
        }
        return res;
    }

    public void createList(String data) {
        if (firstElement != null) {
            Element eNew = new Element(lastElement, data, null);
            lastElement.setNext(eNew);
            lastElement = eNew;
        } else {
            firstElement = new Element(data);
            lastElement = firstElement;
        }
    }

    public void addNewElement(String data, int position) {
        if (firstElement != null) {
            if (position == 0) {
                Element firstNew = new Element(null, data, firstElement);
                firstElement.setPrevious(firstNew);
                firstElement = firstNew;
            } else {
                int counter = 1;
                Element innerFirstElement = firstElement;
                while (counter < position && innerFirstElement.getNext() != null) {
                    counter++;
                    innerFirstElement = innerFirstElement.getNext();
                }
                Element rememberNext = innerFirstElement.getNext();
                Element rememberPrevious = innerFirstElement;
                Element eNew = new Element(rememberPrevious, data, rememberNext);
                rememberPrevious.setNext(eNew);
                if (rememberNext != null) {
                    rememberNext.setPrevious(eNew);
                }
            }
        } else {
            Element firstNew = new Element(null, data, null);
            firstElement = firstNew;
        }
    }

    public void addNewElement(String data) {
        addNewElement(data, 0);
    }

    public int countQuantity() {
        Element current = firstElement;
        if (current == null) {
            return 0;
        } else {
            int counter = 1;
            while (current.getNext() != null) {
                current = current.getNext();
                counter++;
            }
            return counter;
        }
    }

    public void deleteElement() {
        if (firstElement != null && lastElement!=null) {
                Element rememberNext = lastElement.getNext();
                Element rememberPrevious = lastElement.getPrevious();
                if (rememberPrevious != null) {
                    lastElement.getPrevious().setNext(rememberNext);
                }
                if (rememberNext != null && rememberPrevious == null) {
                    lastElement.getNext().setPrevious(rememberPrevious);
                    firstElement = firstElement.getNext();
                }
            }
        }

    public void getElementByPosition(int position) {
        int quantity = countQuantity();
        int counter = 0;
        if (quantity > position) {
            Element current = firstElement;
            while (counter < position) {
                counter++;
                if (current.getNext() != null) {
                    current = current.getNext();
                }
            }
            lastElement = current;
        }
        else lastElement = null;
    }
}
