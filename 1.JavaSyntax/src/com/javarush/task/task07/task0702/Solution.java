package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создание масива на 10 элементов
//        int[] arr = new int[10];
        String[] arr1 = new String[10];
        //заполнения масина 8-ю значениями
        for (int i = 0; i < 8; i++){
//            arr[i] = Integer.parseInt(reader.readLine());
            arr1[i] = reader.readLine();
        }

//        //вывод всех 10 элементом масина с новой строки
//        for (int elem: arr){
//            System.out.println(elem);
//        }

        //вывод всех 10 элементом масина с новой строки в обратном порядке
        for (int i = arr1.length-1; i >= 0; i--){
            System.out.println(arr1[i]);
        }


    }
}