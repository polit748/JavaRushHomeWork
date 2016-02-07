package com.javarush.test.level14.lesson06.home01;

/**
 * Created by polit on 04.02.16.
 */
public class BelarusianHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 1500;
    }
    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
