package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list  = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
        int length = list.get(0).length();

        for (String elem : list) {
            if (length == elem.length()) {
                System.out.println(elem);
            }

        }
    }
}
