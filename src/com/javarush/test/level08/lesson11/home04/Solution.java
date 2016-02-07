package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум

        Iterator<Integer> iterator = array.iterator();
        int min = iterator.next();
        while (iterator.hasNext())
        {
            Integer x = iterator.next();
            if(x < min)
            {
                min = x;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Тут создать и заполнить список
        List<Integer> list = new LinkedList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int N = Integer.parseInt(s);
        for (int i = 0; i < N; i++)
        {
            String s1 = reader.readLine();
            list.add(Integer.parseInt(s1));
        }
        return list;
    }
}
