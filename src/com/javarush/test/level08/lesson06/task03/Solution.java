package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long  getTimeMsOfInsert(List list)
    {
        //напишите тут ваш код
        Date start = new Date();
        long startMs = start.getTime();
        insert10000(list);
        Date current = new Date();
        long endTime = current.getTime();
        //напишите тут ваш код
        return (endTime - startMs);
    }

    public static void insert10000(List list)
    {
        for (int i=0; i<10000 ;i++)
        {
            list.add(0, new Object());
        }
    }
}
