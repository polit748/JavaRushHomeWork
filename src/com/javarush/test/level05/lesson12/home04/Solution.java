package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution
{
    public static void main(String[] args)
    {
        Date today = new Date(11, 12, 2015);
        System.out.println(today.day + " " + today.month + " " + today.year);//напишите тут ваш код
    }
    public static class Date{
        int day;
        int month;
        int year;
        public Date(int day, int month, int year){
            this.day = day;
            this.month =month;
            this.year = year;
        }
    }
}
