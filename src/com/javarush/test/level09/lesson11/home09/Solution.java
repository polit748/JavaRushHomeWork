package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Kisa1", new Cat("Kisa1"));
        map.put("Kisa2", new Cat("Kisa2"));
        map.put("Kisa3", new Cat("Kisa3"));
        map.put("Kisa4", new Cat("Kisa4"));
        map.put("Kisa5", new Cat("Kisa5"));
        map.put("Kisa6", new Cat("Kisa6"));
        map.put("Kisa7", new Cat("Kisa7"));
        map.put("Kisa8", new Cat("Kisa8"));
        map.put("Kisa9", new Cat("Kisa9"));
        map.put("Kisa10", new Cat("Kisa10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set set = map.keySet();
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
