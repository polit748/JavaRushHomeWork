package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        int age;
        int weight;
        boolean married;
        String eyes;
        String hair;
        Human(String name, int age, int weight, String eyes, String hair, boolean married)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.eyes = eyes;
            this.hair = hair;
            this.married = married;
        }

        Human(String name, String eyes, String hair)
        {
            this.name = name;
            this.eyes = eyes;
            this.hair = hair;
        }

        Human(String name, int age, int weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        Human(String name, int age, String hair)
        {
            this.name = name;
            this.age = age;
            this.hair = hair;
        }

        Human(String name, String eyes, String hair, boolean married)
        {
            this.name = name;
            this.eyes = eyes;
            this.hair = hair;
            this.married = married;
        }

        Human(String name, int weight, boolean married)
        {
            this.name = name;
            this.weight = weight;
            this.married = married;
        }

        Human(String name, String eyes, boolean married)
        {
            this.name = name;
            this.eyes = eyes;
            this.married = married;
        }

        Human(String name, int age, int weight, boolean married)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.married = married;
        }

        Human(String name, boolean married)
        {
            this.name = name;
            this.married = married;
        }

        Human human1 = new Human("Bob", 19, 70, "blue", "blond", false);
        Human human2 = new Human("Alise", "gray", "blond");
        Human human3 = new Human("Mary", 45, 70);
        Human human4 = new Human("Keren", 0);
        Human human5 = new Human("Hubert", 27, "ginger");
        Human human6 = new Human("Gary", "brown", "brunet", true);
        Human human7 = new Human("Colin", 90, true);
        Human human8 = new Human("Polly", "green", true);
        Human human9 = new Human("Piter", 35, 77, false);
        Human human10 = new Human("John", true);

    }
}
