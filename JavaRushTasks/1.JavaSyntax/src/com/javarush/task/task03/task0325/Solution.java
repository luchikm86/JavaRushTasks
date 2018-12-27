package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String money = reader.readLine();
        int money1 = Integer.parseInt(money);

        System.out.println("Я буду зарабатывать $" + money1 + " в час");
    }
}
