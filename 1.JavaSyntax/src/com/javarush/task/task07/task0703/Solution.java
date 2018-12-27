package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = new String[10];
        int[] arr = new int[10];
        for (int i = 0; i < arrStr.length; i++){
            arrStr[i] = reader.readLine();
            arr[i] = arrStr[i].length();
        }
//        for (String elem:arrStr) {
//             int a = elem.length();
//             arr[a]++;
//            System.out.println(arr[a]);
//        }
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = arrStr[i].length();
//        }
        for (int elem:arr) {
            System.out.println(elem);
        };
    }
}
