package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[]array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        int[]arrayCopy1 = new int[10];
        int[]arrayCopy2 = new int[10];

        arrayCopy1 = Arrays.copyOfRange(array,0,9);
//        for (int i = 0; i < arrayCopy1.length; i++){
//            System.out.println(arrayCopy1[i]);
//        }
        arrayCopy2 = Arrays.copyOfRange(array,10,20);
        for (int i = 0; i < arrayCopy2.length; i++){
            System.out.println(arrayCopy2[i]);
        }
    }
}
