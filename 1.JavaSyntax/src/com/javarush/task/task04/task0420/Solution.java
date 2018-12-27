package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer array[] = new Integer[3];
        for(int i = 0; i <  array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(array, Collections.reverseOrder());

        //выводит отсорт ированый по убыванию массив
//        System.out.println(Arrays.toString(array));

        //выводит отсортированный список цифр
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }

    }
}
