package com.javarush.test.level07.lesson12.home01;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(i, Integer.parseInt(s));
        }
        for (int j = 0; j < list.size(); j++)
        {
            int x = list.get(list.size() - j - 1);
            System.out.println(x);
            //напишите тут ваш код
        }
    }
}
