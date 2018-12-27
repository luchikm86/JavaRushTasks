package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int max = list.get(0).length();
        int min = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            max = max < list.get(i).length() ? list.get(i).length() : max;
            min = min > list.get(i).length() ? list.get(i).length() : min;
        }

        for (int i = 0; i < list.size(); i++)
            if (list.get(i).length() == max || list.get(i).length() == min) {
                System.out.println(list.get(i));
                break;
            }
    }
}




