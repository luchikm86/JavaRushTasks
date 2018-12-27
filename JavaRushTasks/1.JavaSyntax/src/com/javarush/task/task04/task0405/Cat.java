package com.javarush.task.task04.task0405;

/* 
Реализовать метод setCatsCount
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.catsCount = 5;
        System.out.println(cat1.catsCount);

    }
}
