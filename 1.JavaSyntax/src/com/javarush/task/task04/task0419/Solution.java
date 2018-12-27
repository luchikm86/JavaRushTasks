package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine()); //1
        int num2 = Integer.parseInt(reader.readLine()); //2
        int num3 = Integer.parseInt(reader.readLine()); //3
        int num4 = Integer.parseInt(reader.readLine()); //4

        int maxNumb1 = Math.max(num1,num2);
        int maxnumb2 = Math.max(num3, num4);

        if (maxNumb1 > maxnumb2) {
            System.out.println(maxNumb1);
        } else {
            System.out.println(maxnumb2);
        }

    }
}
