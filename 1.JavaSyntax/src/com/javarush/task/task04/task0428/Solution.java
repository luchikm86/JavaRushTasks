package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int numb1 = Integer.parseInt(reader.readLine());
//        System.out.println(numb1);
//        int numb2 = Integer.parseInt(reader.readLine());
//        System.out.println(numb2);
//        int numb3 = Integer.parseInt(reader.readLine());
//        System.out.println(numb3);

        int mas[] = new int[3];//создаем  массив размером 10
        for (int i = 0; i < mas.length; i++) {
//            mas[i] = input.nextInt();// заполняем массив с клавиатуры
            mas[i] = Integer.parseInt(reader.readLine());
        }

        int num = 0;
        for (int i=0 ; i< mas.length; i++){
            if (mas[i]>0 ){  // находим нечетные элементы
                num++;
            }
        }
        System.out.println(num);



    }
}
