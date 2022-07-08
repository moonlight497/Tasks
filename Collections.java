package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections<capasity, capacity> {
    private int size;
    private int capacity;
    private String [] elements;

    public  Collections(){
          size = 0;
          capacity =10;
          elements = new String[capacity];
    }
    public void add(String element){
        if(size==capacity){
            grow();
        }
    }
    private void grow(){
    capacity = (int) (capacity *  1.5);
    String [] newElements = new String[capacity];
        for(int i=0;i<elements.length;i++){
          newElements[i] = elements[i];
        }
        elements = newElements;
    }


}