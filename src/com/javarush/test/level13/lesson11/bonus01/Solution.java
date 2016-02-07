package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        //Scanner scanner = new Scanner(new FileInputStream(filename));
        BufferedReader fr = new BufferedReader(new FileReader(filename));
        ArrayList<Integer> list = new ArrayList<Integer>();
        String a;
        while ((a = fr.readLine())!= null)
        {
            if(Integer.parseInt(a)%2 == 0)
            list.add(Integer.parseInt(a));
        }
        Collections.sort(list);
        for (Integer m : list)
        {
            System.out.println(m);
        }
    }
}
