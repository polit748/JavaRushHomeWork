package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
        int countW = 0;
        int countN = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i])){
                countN++;
            }
            else countW++;
        }
        String[] words = new String[countW];
        String[] nums = new String[countN];

        countN = 0;
        countW = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i]))
            {
                nums[countN] = array[i];
                countN++;
            }
            else
            {
                words[countW] = array[i];
                countW++;
            }
        }
        String temp;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 1; j < nums.length - i; j++)
            {
                int a = Integer.parseInt(nums[j-1]);
                int b = Integer.parseInt(nums[j]);
                if(a<b)
                {
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = words.length - 1; i >0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if(isGreaterThan(words[j], words[j +1]))
                {
                    temp = words[j];
                    words[j] = words[j +1];
                    words[j + 1] = temp;
                }
            }
        }
        countN = 0;
        countW = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(isNumber(array[i])){
                array[i] = nums[countN];
                countN++;
            }
            else
            {
                array[i] = words[countW];
                countW++;
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
