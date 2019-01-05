package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
//        System.out.print("Число строк N: ");
        int n = Integer.parseInt(reader.readLine());
//        System.out.print("Число M: ");
        int m = Integer.parseInt(reader.readLine());

        //заполняем список
        for (int i = 0; i < n; i++) {
            list.add(i, reader.readLine());
        }

        //меняем местами в списке
        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);

        }

        //выводим список
        for (int i = 0; i < n; i++){
            System.out.println(list.get(i));
        }
    }
}
