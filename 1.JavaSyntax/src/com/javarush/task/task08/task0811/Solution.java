package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
        ArrayList list = new ArrayList();

        for (int i = 0; i < 1000; i++) {
            list.add("list");
        }


        for (int i = 0; i < 1000; i++) {
            list.get(i);
        }

        return list;
    }

    public static List getListForSet() {
        ArrayList list = new ArrayList();

        for (int i = 0; i < 1000; i++) {
            list.add("list");
        }

        for (int i = 0; i < 1000; i++) {
            list.set(i, "new");
        }

        return list;
    }

    public static List getListForAddOrInsert() {
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 1000; i++) {
            linkedList.add("list");
        }

        return linkedList;

    }

    public static List getListForRemove() {
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 1000; i++) {
            linkedList.add("list");
        }

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }

        return linkedList;
    }

    public static void main(String[] args) {

    }
}
