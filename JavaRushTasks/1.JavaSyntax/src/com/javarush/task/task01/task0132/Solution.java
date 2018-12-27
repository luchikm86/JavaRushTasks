package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {


        String data = String.valueOf(number);
        int a = Character.getNumericValue(data.charAt(0));
        int b = Character.getNumericValue(data.charAt(1));
        int c = Character.getNumericValue(data.charAt(2));
        return (a+b+c);
    }
}
