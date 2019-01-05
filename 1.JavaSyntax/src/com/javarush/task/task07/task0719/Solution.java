package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String str = reader.readLine();
            int elem = Integer.parseInt(str);
            list.add(elem);
        }

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }


        //напишите тут ваш код
    }
}
