package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();

        Human grandFather1 = new Human("Nikolay", true, 65);
        list.add(grandFather1);
        Human grandMother1 = new Human("Olga", false, 66);
        list.add(grandMother1);
        Human grandFather2 = new Human("Andrey", true, 67);
        list.add(grandFather2);
        Human grandMother2 = new Human("Nataliya", false, 64);
        list.add(grandMother2);

        Human father = new Human("Vlad", true, 45, grandFather1, grandMother1);
        list.add(father);
        Human mother = new Human("Polina", false, 43, grandFather2, grandMother2);
        list.add(mother);
        Human child1 = new Human("Boris", true, 26, grandFather1, grandMother2);
        list.add(child1);
        Human child2 = new Human("Pavel", true, 29, grandFather2, grandMother1);
        list.add(child2);
        Human child3 = new Human("Anastasiya", false, 27, grandFather1, grandFather2);
        list.add(child3);

        for (Human people : list) {
            System.out.println(people);
        }
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}