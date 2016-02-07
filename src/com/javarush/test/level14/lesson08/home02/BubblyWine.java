package com.javarush.test.level14.lesson08.home02;

/**
 * Created by polit on 05.02.16.
 * 3. Создать класс BubblyWine, который наследуется от Wine, с реализованным методом public String getHolidayName(),
 * который возвращает строку "Новый год"
 */
public class BubblyWine extends Wine
{
    @Override
    public String getHolidayName()
    {
        return "Новый год";
    }
}
