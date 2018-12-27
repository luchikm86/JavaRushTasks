package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

//        Comparator<String> comprator = (o1,o2) -> o1.length() - o2.length();

        while (true){
            String str = reader.readLine();
            if (str.isEmpty()) break;
            list.add(str);
        }

        Collections.sort(list);

        for (String s : list)
            System.out.println(s);
    }
}

