package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        if (number>=1 && number<=999) {
            String s1 = evenOrOdd(number);
            String s2 = numbLeng(number);
            System.out.println(s1 + s2);
        }
    }

    public static String evenOrOdd (int a) {
        if (a%2==0) {
            return "четное ";
        }else {
            return "нечетное ";
        }
    }

    public static String numbLeng(int a) {
        if (a >= 1 && a <= 9) {
            return "однозначное число";
        } else if (a >= 10 && a <= 99) {
            return "двузначное число";
        }else if (a >=100 && a <=999) {
            return "трехзначное число";
        }else return null;
    }
}
