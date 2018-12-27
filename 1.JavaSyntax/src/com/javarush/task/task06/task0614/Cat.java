package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
//        cats.add(this);
    }

    public static void main(String[] args) {
        printCats();

        cats.forEach(System.out::println); // аналог foreach что ниже
//        for (Cat elem:cats) {
//            System.out.println(elem);
//        }
    }

    public static void printCats() {
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }
    }
}
