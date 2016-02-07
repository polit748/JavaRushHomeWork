package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> strings = new HashSet<String>();
        strings.add("лопата");
        strings.add("лох");
        strings.add("лопасть");
        strings.add("лопа");
        strings.add("лопатыч");
        strings.add("любовь");
        strings.add("ла");
        strings.add("лопатка");
        strings.add("лото");
        strings.add("лакрос");
        strings.add("лопата1");
        strings.add("лопата2");
        strings.add("лопата0");
        strings.add("лопата3");
        strings.add("лопата4");
        strings.add("лопата5");
        strings.add("лопата6");
        strings.add("лопата7");
        strings.add("лопата8");
        strings.add("лопата9");
        return strings;
    }
}
