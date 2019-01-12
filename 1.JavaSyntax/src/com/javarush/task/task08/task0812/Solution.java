package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i, Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < list.size() -1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                if (maxCount < count)
                    maxCount = count;
            } else
                count = 1;
        }

        System.out.println(maxCount);



    }
}