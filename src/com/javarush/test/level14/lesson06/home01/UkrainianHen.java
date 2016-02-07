package com.javarush.test.level14.lesson06.home01;

import javax.xml.ws.handler.Handler;

/**
 * Created by polit on 04.02.16.
 */
public class UkrainianHen extends Hen implements Country
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 2500;
    }
    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
