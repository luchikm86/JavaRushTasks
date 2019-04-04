package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sidorov", 1000);
        map.put("Ivanov", 450);
        map.put("Stalone", 2300);
        map.put("Pupkin", 670);
        map.put("Shtirlic", 367);
        map.put("Solomkin", 500);
        map.put("Bosoy", 345);
        map.put("Chonkin", 987);
        map.put("Zhul", 1100);
        map.put("Kusto", 990);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) // если значение больше 500
                map.remove(pair.getKey()); //берем ячейки ключ и удаляем ячейку с мапы
        }
    }

    public static void main(String[] args) {
//        HashMap map = createMap();
//        removeItemFromMap(map);
//        System.out.println(map);


    }
}