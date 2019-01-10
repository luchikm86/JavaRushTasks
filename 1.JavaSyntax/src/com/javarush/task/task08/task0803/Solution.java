package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция HashMap из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        //объявил переменную коллекции HashMap с типом элементов String, Cat и сразу проинициализируй ee
        HashMap<String, Cat> map = new HashMap<>();

        //добавил в коллекцию всех котов из массива String[] cats
        for (int i = 0; i < cats.length; i++) {
            Cat cat = new Cat(cats[i]); //создал кота - имя по индексу в массиве
            map.put(cat.name, cat);
        }
        return map;

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
