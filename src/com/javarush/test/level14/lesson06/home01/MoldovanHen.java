package com.javarush.test.level14.lesson06.home01;

/**
 * Created by polit on 04.02.16.
 */
public class MoldovanHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 1900;
    }
    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
