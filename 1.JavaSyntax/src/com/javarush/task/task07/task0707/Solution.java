package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("world!");
        list.add("My name is ");
        list.add("Max.");
        list.add("Hi!");

        System.out.println(list.size());

        for (String elem:list){
            System.out.println(elem);
        }

    }
}
