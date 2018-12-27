package com.javarush.task.task06.task0622;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем новый масив на 5 элементов
        int[] arr = new int[5];
        //заполняем масив значениями
        for (int i = 0; i < arr.length; i++){
            //ввод с консоли данных для заполнения масива
            arr[i] = Integer.parseInt(reader.readLine());
        }
        //сортировка масива по возрастанию
        Arrays.sort(arr);
        //вывод элементов масива по возрастанию
        for (Integer elem: arr) {
            System.out.println(elem);;
        }



    }
}
