package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        String bb = reader.readLine();
        String cc = reader.readLine();
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int c = Integer.parseInt(cc);

        if (a >= b && a <= c || a <= b && a >= c)
            System.out.println(a);
        if (b >= c && b <= a || b <= c && b >=a)
            System.out.println(b);
        if (c >= a && c <= b || c <= a && c >= b)
            System.out.println(c);
    }
}
