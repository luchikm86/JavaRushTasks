package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listStr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listStr.add(reader.readLine());
        }
        listStr.remove(2);
        Collections.reverse(listStr);

        for (String elem:listStr) {
            System.out.println(elem);
        }
    }
}


