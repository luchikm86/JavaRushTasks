package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        double a = 0;

        while (true) {
            int numb = Integer.parseInt(reader.readLine());
            if (numb != -1){
                a += numb;
                sum++;
            }else {
                break;
            }
        }
        System.out.println(a/sum);
    }
}

