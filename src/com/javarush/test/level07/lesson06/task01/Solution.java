package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();

        String s1 = "Amigo1";
        list.add(s1);

        String s2 = "Amigo2";
        list.add(s2);

        String s3 = "Amigo3";
        list.add(s3);

        String s4 = "Amigo4";
        list.add(s4);

        String s5 = "Amigo5";
        list.add(s5);
        int n = 0;
        n = list.size();
        System.out.println(n);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }//напишите тут ваш код

    }
}
