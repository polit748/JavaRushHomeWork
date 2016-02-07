package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни
их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> list = new ArrayList<Human>();//напишите тут ваш код
        Human grandma1 = new Human("Luda", false, 80, null, null);
        list.add(grandma1);
        Human grandma2 = new Human("Tania", false, 80, null, null);
        list.add(grandma2);
        Human grandpa1 = new Human("Yura", true, 75, null, null);
        list.add(grandpa1);
        Human grandpa2 = new Human("Vitaly", true, 75, null, null);
        list.add(grandpa2);
        Human mama = new Human("Katia", false, 30, grandpa1, grandma1);
        list.add(mama);
        Human papa = new Human("Vitaliy", true, 29, grandpa2, grandma2);
        list.add(papa);
        Human child1 = new Human("Arie", true, 7, papa, mama);
        list.add(child1);
        Human child2 = new Human("Stela", false, 4, papa, mama);
        list.add(child2);
        Human child3 = new Human("Kfir", true, 1, papa, mama);
        list.add(child3);

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).toString());
        }


    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, Boolean sex,  int age, Human father, Human mother )
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
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
