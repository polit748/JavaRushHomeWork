package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(ziclOdin( a, b));
    }
    public static int ziclOdin(int a, int b)
    {
        int zalupaOrla1 = 0;
        int minDelitel = 1;
        while (minDelitel <= a && minDelitel <= b)
        {
            if ((a%minDelitel == 0) && (b%minDelitel == 0))
            {
                zalupaOrla1= minDelitel;
                minDelitel++;
            }
            else minDelitel++;
        }
        return zalupaOrla1;
    }
}
