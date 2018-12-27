package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int mas[] = new int[3];//создаем  массив размером 3
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());// заполняем массив с клавиатуры
        }

        int numPlus = 0;
        int numMinus = 0;
        for (int i=0 ; i< mas.length; i++){
            if (mas[i]>0 ){  // находим положительные элементы
                numPlus++;
            }
            if (mas[i]<0) { // находим отрицательные элементы
                numMinus++;
            }
        }
        System.out.println("количество отрицательных чисел: " + numMinus);
        System.out.println("количество положительных чисел: " + numPlus);

    }
}
