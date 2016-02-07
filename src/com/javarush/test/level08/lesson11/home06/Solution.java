package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> ch = new ArrayList<Human>();
        ArrayList<Human> pa = new ArrayList<Human>();
        ArrayList<Human> ma = new ArrayList<Human>();

        Human child1 = new Human("Lior", true, 5, new ArrayList<Human>());
        Human child2 = new Human("Arie", true, 7, new ArrayList<Human>());
        Human child3 = new Human("Kfir", true, 2, new ArrayList<Human>());
        ch.add(child1);
        ch.add(child2);
        ch.add(child3);
        Human father = new Human("Haim", true, 30, ch);
        Human mother = new Human("Kosha", false, 31, ch);
        pa.add(father);
        ma.add(mother);
        Human grandpa1 = new Human("Yura", true, 60, pa);
        Human grandpa2 = new Human("Vitaly", true, 64, ma);
        Human grandma1 = new Human("Luda", false, 60, pa);
        Human grandma2 = new Human("Tania", false, 50, ma);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        //напишите тут ваш код
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, Boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
