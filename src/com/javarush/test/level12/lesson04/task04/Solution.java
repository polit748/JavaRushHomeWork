package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {


    }
    public int min(int a, int b)
    {
        if (a > b)
            return b;
        else
            return a ;
    }
    public long min(long c, long d)
    {
        if (c > d)
            return d;
        else
            return c;
    }
    public double min(double f, double h)
    {
        if (f > h)
            return h;
        else
            return f;
    }
    //Напишите тут ваши методы
}
