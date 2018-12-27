package com.javarush.task.task03.task0319;

/*
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader InputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(InputStreamReader);

        String name = bufferedReader.readLine();
        String money = bufferedReader.readLine();
        int money1 = Integer.parseInt(money);
        String year = bufferedReader.readLine();
        int year1 = Integer.parseInt(year);
        System.out.println(name + " получает " + money1 + " через " + year1 + " лет.");
    }
}
