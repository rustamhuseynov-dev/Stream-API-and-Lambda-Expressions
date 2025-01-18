package com.rustam.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);


        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
