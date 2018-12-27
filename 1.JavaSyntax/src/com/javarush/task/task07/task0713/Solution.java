package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                if (list.get(i) % 2 == 0) {
                    two.add(list.get(i));
                }
                three.add(list.get(i));
            } else if (list.get(i) % 2 == 0) {
                two.add(list.get(i));
            } else {
                all.add(list.get(i));
            }
        }

//        System.out.println("\n");
        printList(three);
//        System.out.println("\n");
        printList(two);
//        System.out.println("\n");
        printList(all);

    }

    public static void printList(List<Integer> list) {
        for (Integer elem : list) {
            System.out.println(elem);
        }
    }
}
