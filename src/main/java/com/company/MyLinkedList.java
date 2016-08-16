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
        if (firstElement == null) {
            return 0;
        } else {
            int counter = 1;
            while (firstElement.getNext() != null) {
                firstElement = firstElement.getNext();
                counter++;
            }
            return counter;
        }
    }

    public void deleteElement(int position) {
        if (firstElement != null) {
            if (position == 0) {
                firstElement.getNext().setPrevious(null);
                firstElement = firstElement.getNext();
            } else {
                Element innerFirstElement = firstElement;
                int counter = 0;
                while (counter < position ) {
                    counter++;
                if(innerFirstElement.getNext() != null){
                    innerFirstElement = innerFirstElement.getNext();}
                else return;
                }
                Element rememberNext = innerFirstElement.getNext();
                Element rememberPrevious = innerFirstElement.getPrevious();
                if ((rememberNext==null && rememberPrevious!=null)){
                    innerFirstElement.getPrevious().setNext(rememberNext);
                if (rememberNext!=null ){
                    innerFirstElement.getPrevious().setNext(rememberNext);
                    innerFirstElement.getNext().setPrevious(rememberPrevious);}
                }
            }
        }
    }
}
