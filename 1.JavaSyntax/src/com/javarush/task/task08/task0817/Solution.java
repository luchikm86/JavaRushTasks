package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "1");
        map.put("4", "2");
        map.put("5", "3");
        map.put("6", "4");
        map.put("7", "4");
        map.put("8", "5");
        map.put("9", "1");
        map.put("10", "1");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {          ////iterator
            int m = Collections.frequency(copy.values(), pair.getValue());////count frequency of all value
            if (m > 1)
                removeItemFromMapByValue(map, pair.getValue());                        ////remove key with duplicate value

        }

        //             или
//            if (Collections.frequency(copy.values(), pair.getValue()) > 1) {
//                removeItemFromMapByValue(map, pair.getValue());
//            }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

        removeTheFirstNameDuplicates(createMap());



    }
}
