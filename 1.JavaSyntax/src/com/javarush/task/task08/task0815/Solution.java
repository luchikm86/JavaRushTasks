package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Первый", "Сергей");
        map.put("Иванов", "Николай");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Петро");
        map.put("Штирлиц", "Василий");
        map.put("Одинцов", "Андрей");
        map.put("Мюлер", "Павел");
        map.put("Мухич", "Александр");
        map.put("Петрушкин", "Игорь");
        map.put("Ботан", "Иван");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String s = entry.getValue();
            if (name.equals(s))
                count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        return map.containsKey(lastName) ? 1 : 0;
    }

    public static void main(String[] args) {

    }
}
