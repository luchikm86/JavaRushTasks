package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<>();
        //заполнение масива
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        //сортировка с большей к меньшей длине
        Collections.sort(strings, (s1 , s2) -> s2.length() - s1.length());
        //берем длину строки первого элемента отсортированого масива, самый большой
        int length = strings.get(0).length();
        //через цикл проходим по масиву и сравнивае самую длинную строку с другими элементами
        //для поиска строк такоэ же длины если они естть и выводим
        for (String elem:strings) {
            //если длина первого макс элемента равна элементу масива, то выводим строку
            if (length == elem.length()){
                System.out.println(elem);
            }
        }
    }
}
