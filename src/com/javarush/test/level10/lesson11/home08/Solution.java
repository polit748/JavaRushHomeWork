package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[2];
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add(":");
        l1.add("K");
        l1.add("m");
        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("m");
        l2.add("d");
        l2.add("a");
        arrayLists[0] = l1;
        arrayLists[1] = l2;
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}