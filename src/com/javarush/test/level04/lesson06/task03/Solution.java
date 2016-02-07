package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Integer[] ch = new Integer[3];
        ch[0] = Integer.parseInt(r.readLine());
        ch[1] = Integer.parseInt(r.readLine());
        ch[2] = Integer.parseInt(r.readLine());
        Arrays.sort(ch, Collections.reverseOrder());
        for (Integer a : ch)
        {
            System.out.println(a);
        }
    }
}
