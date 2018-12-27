package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            for (int g = 1; g < 11; g++){
                System.out.print(g * i + " ");
            }
            System.out.println("");
        }

    }
}
