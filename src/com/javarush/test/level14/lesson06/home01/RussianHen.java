package com.javarush.test.level14.lesson06.home01;

/**
 * Created by polit on 04.02.16.
 */
public class RussianHen extends Hen implements Country
{
    int getCountOfEggsPerMonth()
    {
        return 2700;
    }
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
