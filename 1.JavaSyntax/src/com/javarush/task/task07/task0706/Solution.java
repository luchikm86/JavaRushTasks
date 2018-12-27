package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int even = 0;
        int odd = 0;
        for (int i = 0; i <array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
            if (array[i]%2 == 0){
                even+=i;
            }else {
                odd+=i;
            }
        }

        for (int i = 0; i<array.length; i = i+2){
            even = even + array[i];
        }

        for (int i = 1; i<array.length; i = i+2){
            odd = odd + array[i];
        }

//        System.out.println(even);
//        System.out.println(odd);

        if (even>odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
