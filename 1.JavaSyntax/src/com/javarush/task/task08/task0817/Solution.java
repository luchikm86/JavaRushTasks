package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Sidorov", "Miha");
        map.put("Ivanov", "Andrey");
        map.put("Stalone", "Silvestr");
        map.put("Pupkin", "Vasya");
        map.put("Shtirlic", "Aleksandr");
        map.put("Solomkin", "Petr");
        map.put("Bosoy", "Nikolai");
        map.put("Chonkin", "Ivan");
        map.put("Zhul", "Vern");
        map.put("Kusto", "Zhak");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            String name = pair.getValue();
//            removeItemFromMapByValue(map, name);
//        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

//        HashMap<String, String> map = new HashMap<>();
//        map.put("Sidorov", "Miha");
//        map.put("Ivanov", "Andrey");
//        map.put("Stalone", "Silvestr");
//        map.put("Pupkin", "Vasya");
//        map.put("Shtirlic", "Aleksandr");
//        map.put("Solomkin", "Petr");
//        map.put("Bosoy", "Nikolai");
//        map.put("Chonkin", "Ivan");
//        map.put("Zhul", "Vern");
//        map.put("Kusto", "Zhak");
//        System.out.println(map);
//        removeTheFirstNameDuplicates(map);
//


    }
}
